# BidOne
Maven Project, BDD framework in Selenium using Java language

Prerequisites:

This is a maven project hence to get started need to add maven dependecies in the pom.xml file
Have used BDD framework so we need cucumber dependecies and to run we need Junit.
Have also included Page Object Model so to run that we would need TestNG dependencies.
Last but not the least we need to add the Selenium dependencies.

Description:

This is a project where user needs to log into to the application and search for a product which is coconut milk
There are features file folder which includes the test scenario.
Step Definition forlder where we have stepdefinition java class which is where we have the element locators and methods and test cases.
Runner folder where we have testRunner java class to execute the script

Have also included end to end framework wherein have divided pages into class and corresponding test.
There is a base class which has driver initilization and tear down
There are three pages: login page, homepage and productpage which has the locators and actions using Page Factory.
One test class to test the functionality log into to the application and search for a product which is coconut milk
Have used assertions for verification of the test cases.
