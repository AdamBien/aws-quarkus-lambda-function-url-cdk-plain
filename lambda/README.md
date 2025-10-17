# Lambda Function

Quarkus application packaged for AWS Lambda deployment.

## Endpoints

- `GET /hello` - Returns greeting message
- `POST /hello` - Accepts greeting message
- `GET /time` - Returns current timestamp

## Build

```bash
mvn clean package
```

Produces `function.zip` in `target/` for Lambda deployment.

## Local Development

```bash
mvn quarkus:dev
```

[Quarkus Lambda Guide](https://quarkus.io/guides/amazon-lambda-http)
