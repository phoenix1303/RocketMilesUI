# RocketMilesUI

This project was created using following stack - Java, Maven, TestNG and Selenium WebDriver

Please make sure you have following elements installed to be able to run the solution:
  - Java 1.8;
  - Maven;
  - Eclipse IDE (once you install eclipse IDE please go to Help/Marketplace and install TestNG plugin);
  - Please download appropriate version of Selenium WebDriver according to version of your Chrome browser, 
  to do that go to the following URL - http://chromedriver.chromium.org/ and pick version based on version of your Chrome browser.
  
 Once you downloaded/installed all of the components above and imported the project please go to the following class - RocketMilesUIAbstractTest, that is located at 
 RocketMilesUI\src\test\java\com\oliulka\rocketmilesUI and update path to the WebDriver in System.setProperty.  
 After that you should be able to Clean the project - select Project in menu of Eclipse/Clean and specify RocketmilesIU, after that you should be able to run the solution.
 
 If you ever have issues with imports or other errors in the code please try to clean the project, to do that got to Project menu -> Clean and select necessary project.
 
 Tests could be ran individually as well as in bulk from Test01HomePageTests class.
 To run a specific test please doubleclick the name of the test (method with @Test annotation) and select Run As -> TestNG test.
 To run all of the tests please doubleclick class name (Test01HomePageTests) and select Run As -> TestNG test.
 
 At its core project implements testing of search functionality of Rocketmiles.com. We have setup and teardown methods for each test to
 bring up the browser and load the page as well as cleanup. Each test references dynamically designed methods that take few parameters like:
 destination, rewards program, CheckIn and CheckOut dates, number of Rooms and number of Guests and test top N results based on the input.
 Methods were designed as dynamic, that way introducing new test with different parameters would be simple.
 
 There were more things that I would like to integrate into this project like proper Logger, external testdata file, etc, 
 but due to the timeline those enhancements will be implemented in future.
 
 Sincerely,
 Oleksii Liulka
