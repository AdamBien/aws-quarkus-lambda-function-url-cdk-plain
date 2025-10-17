# IaC

AWS CDK infrastructure for Quarkus Lambda with Function URL.

## Configuration

Context parameters can be set in `cdk.json` or via CLI:

- `stack.props.region` - AWS region (default: eu-central-1)
- `function.name` - Lambda function name (default: airhacks_QuarkusFunctionURL)
- `function.url.allow.origins` - CORS allowed origins (default: http://localhost:8000)

## Stack Components

- Quarkus Lambda function
- Function URL with CORS configuration
- IAM permissions for Lambda execution

## Deploy

```bash
mvn clean package && cdk deploy
```

Or use the root `./buildAndDeploy.sh` to build both Lambda and CDK.

See you at: [airhacks.live](https://airhacks.live)