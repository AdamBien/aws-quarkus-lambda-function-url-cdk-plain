package airhacks;

import java.util.List;

import airhacks.configuration.control.ZCfg;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

public interface Configuration {

    String defaultFunctioName = "airhacks_QuarkusFunctionURL";
    String defaultRegion = "eu-central-1"; //Frankfurt
    String defaultAllowOrigin = "http://localhost:8000";


    public static StackProps stackProperties(String appName) {
        ZCfg.load(appName);
        var region = ZCfg.string("stack.props.region",defaultFunctioName);
        var env = Environment
                .builder()
                .region(region)
                .build();
        return StackProps
                .builder()
                .env(env)
                .build();
    }

    public static String functionName(String appName) {
        ZCfg.load(appName);
        return ZCfg.string("function.name",defaultFunctioName);
    }

    public static List<String> allowOrigins(String appName){
        ZCfg.load(appName);
        var origin =  ZCfg.string("function.url.allow.origins",defaultAllowOrigin);
        return List.of(origin);
    }
}
