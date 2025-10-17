# System Test / Black Box Tests

To perform black box tests locally (uses http://localhost:8080 by default):

mvn clean test-compile failsafe:integration-test

To test against a remote environment, set the BASE_URI environment variable:

```
export BASE_URI=https://[GENERATED_ID].execute-api.eu-central-1.amazonaws.com 
mvn clean test-compile failsafe:integration-test 
```