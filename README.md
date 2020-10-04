
Maven Project, BDD framework in Selenium using Java language

Prerequisites:

This is a maven project hence to get started need to add maven dependencies in the pom.xml file Have used BDD framework so we need cucumber dependencies and to run we need Junit. Have also included Page Object Model so to run that we would need TestNG dependencies. Last but not the least we need to add the Selenium dependencies.

Description:
This is a project where the user needs to log into the application and search for a product which is coconut milk. There is a features file folder which includes the test scenario. Step Definition folder where we have stepdefinition java class which is where we have the element locators and methods and test cases. Runner folder where we have testRunner java class to execute the script

Have also included an end to end framework wherein have divided pages into page class and corresponding test class. There is a base class which has driver initialization and tear down Utility class which contains utilities Config File which contains config file which had information regarding username, browser info, password and Url

There are three pages: login page, homepage and productpage which has the locators and actions using Page Factory. One test class to test the functionality log into the application and search for a product which is coconut milk Have used assertions for verification of the test cases wherever appropriate.
