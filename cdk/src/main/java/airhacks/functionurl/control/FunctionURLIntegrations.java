package airhacks.functionurl.control;

import java.util.List;

import software.amazon.awscdk.services.lambda.FunctionUrl;
import software.amazon.awscdk.services.lambda.FunctionUrlAuthType;
import software.amazon.awscdk.services.lambda.IFunction;
import software.amazon.awscdk.services.lambda.InvokeMode;
import software.constructs.Construct;

public interface FunctionURLIntegrations {

    /**
     * Creates a Lambda Function URL integration.
     *
     * @see <a href=
     *      "https://docs.aws.amazon.com/lambda/latest/dg/lambda-urls.html">AWS Lambda Function URLs</a>
     */
    static FunctionUrl integrate(Construct scope, IFunction function, List<String> allowOrigin) {
        return FunctionUrl.Builder.create(scope, "FunctionURL")
                .authType(FunctionUrlAuthType.NONE)
                .function(function)
                .invokeMode(InvokeMode.BUFFERED)
                .build();
    }

}
