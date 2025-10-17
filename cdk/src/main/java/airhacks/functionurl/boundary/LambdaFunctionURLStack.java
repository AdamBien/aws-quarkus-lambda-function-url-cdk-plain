package airhacks.functionurl.boundary;

import java.util.List;
import java.util.Map;

import airhacks.ConventionalDefaults;
import airhacks.functionurl.control.FunctionURLIntegrations;
import airhacks.lambda.control.QuarkusLambda;
import software.amazon.awscdk.CfnOutput;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.constructs.Construct;

public class LambdaFunctionURLStack extends Stack {

    public LambdaFunctionURLStack(Construct scope, String appName, String functionName, List<String> allowOrigins,
            StackProps stackProps) {
        super(scope, ConventionalDefaults.stackName(appName, "lambda-function-url"), stackProps);
        var configuration = Map.<String,String>of();
        var quarkusLambda = new QuarkusLambda(this,functionName,configuration);
        var function = quarkusLambda.getFunction();
        var functionURL = FunctionURLIntegrations.integrate(this, function, allowOrigins);
        var url = functionURL.getUrl();
        CfnOutput.Builder.create(this, "FunctionURLOutput")
            .value(url)
            .description("Lambda Function URL")
            .build();
        CfnOutput.Builder.create(this, "CurlCommandOutput")
            .value("curl  %s/hello".formatted(url))
            .description("Curl command to invoke the function")
            .build();
    }
}
