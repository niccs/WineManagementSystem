# WineManagementSystem
A simple user interface  created in JSF and Java that would allow a user to view the basic details of a wine, reading data from json files as parth of coding challange.


###  Features Supported!

For Excercise1:
  - The implementation of 4 wine composition methods is done is WineServiceImpl class.
For Excercise2:
  - A JSF UI that would allow a user to select a wine to see its details.
  - User can view basic details of a wine, and a combo-box toto switch between viewing the different composition types.
  - Composition types support printYearBreakdown,printVarietyBreakdown, printRegionBreakdown and printYearAndVarietyBreakdown.
  - Each method shows the percentage of the unique property along with the unique properties sorted from highest percentage to lowest.
  - JSF backing bean is loading a Wine object from the JSON sample files from the web-resourceses.
  - Maven build is provided.
  
### Design-workflow

![Design](https://github.com/niccs/WineManagementSystem/blob/master/src/main/images/Desgn%20approach.JPG)

### ScreenShots

![ScreenShot1](https://github.com/niccs/WineManagementSystem/blob/master/src/main/images/WineyManagement_Screen%20Shot1.JPG)
  
![ScreenShot2](https://github.com/niccs/WineManagementSystem/blob/master/src/main/images/WineyManagement_Screen%20Shot2.JPG)
### Tech
* JDK 1.8.0_201
* JSF 2.2
* JAVA  EE 7 compliant server (I have configured Glassfish 4)

### Installation instructions

*  Import the maven repo 
*  Install the Glassfish server
*  Download GlassFish tools from Eclipse marketplace.
*  Configure the downloaded server in eclipse.
*  From project properties, in targeted runtime-- select the Glassfish server.
*  WineManagementSystem--Run on server
*  The localhost URL will be:--http://localhost:8080/wineManagementSystem/
