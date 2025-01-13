# REST API Test Automation Project
REST API Automation for Create Message using Rest Assured and Cucumber BDD .

## Tools/Framework/Libraries
- JDK 23
- Maven - build tool
- Junit - test runner
- Cucumber - BDD/Gherkin style feature files
- Rest assured - Rest api verification library

## Setup Instruction

GIT Repository link: https://github.com/muthusamyraghul/hotelbooking-api-testautomation/tree/main

Clone the above repository and execute the below maven command for build

mvn clean install

## To run the test using tags - go to TestRunner.class(src/test/java/com/api/test/TestRunner.java)

Update the "tags = "@createMessageDataTable" and run using the command "mvn clean test"

## Swagger API documentation:
https://automationintesting.online/message/swagger-ui/index.html#/


### BDD (Feature file / Step definition)
BDD requires a feature file to invoke the step definitions:
- Create the scenarios in feature file as per the requirements, so each step in feature file has to match a step definition in class file;
- Following the BDD practices for coding;

###REST API
- This is written in a feature file using Cucumber.
- Each line of the scenario is tied to backend code that actually executes the line (step).


### JSON schema validation
- The main goal is to ensure that the JSON format is correct as well as all data inside it. We are using the Json schemafile and with help of Jsonschema validator we validate the response

#### Check the status code, so the expected status is passed by parameter in feature file

**_For Your Information:_**
I have tried to make use of lombok to create the setter and getter, but due to some local setup issues I couldn't implement it fully.
instead I have implemented it using manual Getter and Setter method 