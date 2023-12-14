# automationMyMoneyMobile

## Overview
This project is automation mobile for application android MyMoney that available in google play store. Tech that used for this project are using Java, Appium, JUnit, and Cucumber. Also using gradle for build tool.

## Getting Started 
These instructions will guide you on how to set up the project on your local machine for development and testing purposes.

### Prerequites 
Before getting started, ensure that you have the following software installed on your machine:

1. Java JDK: download and install the latest version of Java JDK from the official Oracle website (https://www.oracle.com/id/java/technologies/downloads/).
2. Gradle: Install Gradle by following the official Gradle installation guide (https://gradle.org/install/), but in this case, we are using 'gradlew'.
3. Appium: You need install appium server to run this project. You can check this link https://appium.io/docs/en/2.1/quickstart/install/. You also need appium driver to test on emulator or device https://appium.io/docs/en/2.1/quickstart/uiauto2-driver/.
4. Appium Java Client: This is the Java language bindings for writing Appium Tests that conform to WebDriver Protocol https://github.com/appium/java-client

### Installing 
To set up the development environment, follow these steps:

1. Clone this repository to your local machine using Git or download the ZIP file and extract it.
2. Open the project in your preferred Java IDE (e.g., IntelliJ or Eclipse).
3. Build the project and download dependencies using Gradle by running the following command in the terminal: ./gradlew clean build

## Point of View about MyMoney 
These are several point that i have hard time to make this automation : 
1. In Page to input expense, transfer, and income id for these button is same with button number 1,2,and 3 in calculator. So i dont have a choice to use selector xpath.

## Device i used for run this automation testing 
To run this testing i use emulator android Pixel 2 API 30 Android 11.0. For now i don't know how to run this project beside that, but i will keep searching in the future. 

## How to run this project 
To run this project you must run appium server first on your terminal with ussing command "appium". After that you need to run emulator on your PC and check that emulator is displayed in adb devices. And then run this project in terminal (Remember to set path to this project) by "./graldew mobileTest".These are several tags that you can see in file features that locate in src/test/resources/features/.

##What's next 
This project can handle automation test like : 
1. Intro Page 
2. Navigation feature 
3. Main Input 
There are lot feature that can be automated in the future. 

## Result 
<img width="1440" alt="image" src="https://github.com/nyomanyudis95/automationMyMoneyMobile/assets/44666702/ebce244f-ddbf-4b63-a3df-6d6fced06d7c">
















