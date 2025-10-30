# Quarkus Lambda exposed via Function URL

Quarkus application deployed to AWS Lambda and exposed via Function URL. Infrastructure defined with AWS CDK in Java.

## Build and Deploy

```bash
./buildAndDeploy.sh
```

Builds the Lambda function and deploys the CDK stack. Function URL output is displayed after deployment.

## Testing

System tests are located in `lambda-st` module. Configure the Function URL via `service_uri` property.

## Configuration

Environment variables are managed through CDK in `Configuration.java`. CORS origins can be configured via context parameters.

### References

- [BCE Architecture Design Pattern](https://bce.design/) - This project organizes code using the Boundary-Control-Entity pattern
- This project is a member of [Constructions Cloud](https://constructions.cloud/)

See you at: [airhacks.live](https://airhacks.live)
