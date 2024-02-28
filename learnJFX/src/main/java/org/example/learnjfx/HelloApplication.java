package org.example.learnjfx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality; //this will only be needed when the Modality example is uncommented
import javafx.stage.StageStyle;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World Application"); //title the stage
        primaryStage.setX(900); //sets starting location in x of stage
        primaryStage.setY(400); //sets starting location in y of stage
        primaryStage.setWidth(700); //sets starting width of stage
        primaryStage.setHeight(400); //sets starting height of stage

        //style
        //THIS MUST BE SET BEFORE THE STAGE IS SET TO SHOW
        //realistically, [stage].show() should be the last thing called in the start method, to avoid exceptions like this
        primaryStage.initStyle(StageStyle.DECORATED); //sets the stage to be DECORATED
        //UTILITY could also be useful in some contexts; decorates the window but only with the essentials (close button, no minimize or maximize)

        Label newLabel = new Label("Hello World!");
        Scene primaryScene = new Scene(newLabel, 400, 200); //creates a new scene
        primaryStage.setScene(primaryScene); //set the scene for the stage

        //primaryStage.setFullscreen(true) and primaryStage.setResizable(false) could both be useful in the future, dialog windows, for example

        //modality block (uncomment to see how modality works (it's currently commented for functionality of main stage))
        /* Stage newStage = new Stage(); //create a new stage for purposes of seeing how modality works
        newStage.setTitle("Child Stage"); /sets the title of newStage to "Child Stage"
        newStage.initOwner(primaryStage); //sets the owner of newStage to primaryStage

        //looking at Modality, modality will decide which windows are blocked by the stage you call initModality on
        newStage.initModality(Modality.WINDOW_MODAL); //sets modality of window to WINDOW_MODAL which should only block the parent window
        newStage.show(); //show the newStage
        */

        //this is called last to avoid exceptions of something not being set before the stage is shown
        primaryStage.show(); //show the stage

        primaryStage.setOnCloseRequest(event ->{
            System.out.println("Stage is closing!");
        }); //lamba expression to complete whatever event is in {} when stage is closed
        //-> points to what should be done when event occurs
    }

    public static void main(String[] args){
        Application.launch(args);
    }

}