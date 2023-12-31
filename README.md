# Calculator_App_Automation_using_Appium_TestNG_Selenium
I have created a Calculator App Automation Project using Appium, TestNG and Selenium and asserted the correct series outputs after successful activities.

## Scenario
Automate any series for calculator app. Pass the series as a parameter to your test method.
For an example:
- 100/10*5-10+60 or 50+10-20*2+10/2

## How to run this project
- clone this project
- Open this project in Intellij Idea
- Start Appium Server with this command in the command prompt:  
  ```Appium```  
- For checking the connectivity of device, give this command in command prompt:
  ```adb devices```
- Open Appium Inspector
- Set desired capabilites:  
  {  
    "platformName": "Android",  
    "appium:platformVersion": "13",  
    "appium:appPackage": "com.miui.calculator",  
    "appium:appActivity": "com.miui.calculator.cal.CalculatorActivity",  
    "appium:app": "D:\\Apk\\CalculatorNew.apk"  
  }  
- In intellij Idea terminal-
- To run suite, hit this command ```gradle clean test```
- To generate allure report hit these command  
  ```allure generate allure-results --clean -output```  
  ```allure serve allure-results```
  
## Server used:
- Appium
  
## Tools Used
- Intellij Idea
- Jdk-11
- Selenium
- Allure
  
## Framework used:
- TestNG

## Video Recording of automation output:
https://github.com/suptimusfika/Calculator_App_Automation_using_Appium_TestNG_Selenium/assets/48064134/db005612-033a-4d0a-8abb-d30639b716f0


## Allure Report Image: 

### Report Summary:
![1](https://github.com/suptimusfika/Calculator_App_Automation_using_Appium_TestNG_Selenium/assets/48064134/eaf77b48-e116-43b5-9799-1ecf24271493)

### Behaviour:
![2](https://github.com/suptimusfika/Calculator_App_Automation_using_Appium_TestNG_Selenium/assets/48064134/1e3b4ca7-86a3-4be6-a7d9-2668f2cb68c6)
