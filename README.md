#### Web Automation Project

This project contains code base for Web automation assignment. Under this, we are writing end to end automated tests for GUI testing.

### **Built With**

* Maven - Dependency management
* TestNG - Testing framework
* Allure Reports - Reporting and Logging framework
* Scripting Language- Java

## Local development environment Setup

#### **Setting up your IDE (IntelliJ)**

    1. Install JDK 17 for windows using "https://www.oracle.com/java/technologies/downloads/"
    2. Install Maven from "https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.5.4/"
    3. Set environment variables path for both already installed JDK and Maven. 
    3. Install Git from this location "https://git-scm.com/download/win"
    4. Download and configure IntelliJ preferably 2020.2 version to point to the right Java SDK version 11
    5. Configure IntelliJ to point to the right Maven version installed and also ensure maven importing is set to automatic setting.
    6. Make sure to have the Maven IntelliJ plugins installed through market place.
    7. Ensure downloading allure reports binaries and save it on your machine.Set environment path variable for the same. 
    8. Pull the code from gitlab using command "git clone https://github.com/ariz05/mindtickleautomation.git"

#### **Execution without using maven maven commands -**

    1. If user choose to execute the project without maven, it can certainly be done by right clicking on the TestNg.xml file under project root directory. 
    2. Click on 'Run TestNG.xml' 

#### **Execution using maven through the commandline –**

#As this project uses Maven, we can invoke the tests using Maven goals.

    1. Pull the code from github using command "git clone "
    2. To run the test,point Maven to the project and use the goals:
       - clean test

#### **Tool / Technologies Leveraged –**

|Tool|Usage|

|GitHub Enterprise -> Acts as a code repository for maintaining the framework, automation test scripts and reports with
help of version controlling to avoid any data loss.|
|IntelliJ -> Used as a developer editing tool for designing/maintaining automation framework.|
|Maven -> Is a build tool used internally to run the build and validate the build status.|
|Scripting -> Java language used for writing scripts.|
|TestNG -> For managing integration tests and unit tests|
|Allure Reports -> To generate a detailed and user-friendly report with some good aesthetics.|

#### **Platforms Supported -**

	- OS supported
	      - Windows

#### **Execution Reporting –**

      1.Allure Reports – Used for generating graphical html test execution reports. Our framework supports some extensive reports like -  
           - Allure Reports from qameta
           - Source-directory/allure-results/
           After execution - open cmd in the project directory and run command - 'allure serve allure-results'
      2.Default Surefire report (HTML Only)
                - target/surefire/index.html	

#### **About project files/directories –**

##This project is built on Maven build tool. It consists of below components:

1. src module ->   This module keeps test cases, Object Repository, test data and common utilities that will be needed
   for the framework
   to support GUI automation.

2. Configuration ->   This directory contains config.properties file that keeps property details like baseurl of the
   environment,browser name, testdatapath, etc.
   More details can be included and leveraged in future for better parameterization.

3. allure-results ->   Directory contains allure report config files.

4. pom ->   This file contains dependencies and plugins used in the project.

5. TestNG.xml ->   This file contains information about the test suites , test classes and test methods we have written
   and wants to execute . We can group them according
   our requirement.

6. src/test/java ->   This directory contains subdirectories that contains code to perform different actions during
   execution.

### Scope of enhancements

* Jenkins tool integration for continuous integration.
* Allure report integration with jenkins using plugin.
* Multiple environment support to run the suite on QA/Non-prod/prod environments.
* Code coverage can be improved by adding some more unit tests.
* More end to end test scenarios can be designed and added to improve test quality.   		 
           