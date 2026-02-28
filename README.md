# UNO
[UNO](https://en.wikipedia.org/wiki/Uno_(card_game)) is a Software Engineering II ([UCM](https://informatica.ucm.es/)) group project based in the famous namesake multiplayer card game.

## Usage
The folder ![v1.0](https://github.com/UCM-FDI-DISIA/proyectois2dg2022-who/tree/main/v1.0) includes an executable version. The "Images" folder is neccesary. 

## Requirements 
The first step would be to import the game as a java proyect in Eclipse, once it is downloaded, the project would open and we should procede with the settings of the json.jar.  
We would select the project and click on the Project option in the upper bar.

Once the different options show up, we should click on Properties.

A screen just like the following one would open up, we should click on JavaBuildPath, and once in, we might select the Libraries window.

To continue we should select the json.jar that appears in the ClassPath section and delete it as shown inthe next image, we must do this to be able to change the json.jar path to the project one. If it doesn't show up or we previously didn't own any json.jar we can skip this step.

Once deleted we should add it again with the new path, for this, we must select the word ClassPath and click on the AddJARs option.

A similar window as the one on the image with the name of the proyect would show up and also all of the folders that are inside it. We must access to the folder names Dependencies where the project json.jar, select it, and click OK.

To finish up, we must save the changes and close the window.

A terminal capable of displaying colors is needed. Otherwise, the cards will appear as random characters.
In the case of the eclipse console, it is necessary to install ANSI Escape in Console. This Eclipse plugin interprets the ANSI escape sequences to color the console output.

To install the plugin in Eclipse select Help placed in the upper bar.

Next you should select Install New Software, as you can see in the next image.

An screen as the following would show up, you must select add to add the following URL http://www.mihai-nita.net/eclipse.

To finish up, only if you want to play on the console you must follow the next steps, you should press the class main, placed in the package main, and select Run As, and next Run Configurations.

The next screen will come up and you must select the option called Java Application and then the window Arguments.

As we show next you must write the word "cli" and then press Apply.

You can now start playing! Click on the RUN button and enjoy UNO with your friends!


