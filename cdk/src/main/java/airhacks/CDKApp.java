package airhacks;

import airhacks.functionurl.boundary.LambdaFunctionURLStack;
import software.amazon.awscdk.App;
import software.amazon.awscdk.Tags;

public interface CDKApp {
    
    String appName = "quarkus-lambda-function-url";

    static void main(String... args) {

        var app = new App();

        Tags.of(app).add("project", "Quarkus on AWS Lambda via Function URL");
        Tags.of(app).add("environment", "development");
        Tags.of(app).add("application", appName);
        var functionName = Configuration.functionName(appName);
        var stackProperties = Configuration.stackProperties(appName);
        var allowOrigins = Configuration.allowOrigins(appName);
        new LambdaFunctionURLStack(app, appName,functionName,allowOrigins,stackProperties);
        app.synth();  
    }
}
