package org.example.learnjfx;

//the vast majority of this information is being pulled or derived from http://jenkov.com/tutorials/javafx/index.html

import javafx.application.Application;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality; //this will only be needed when the Modality example is uncommented
import javafx.stage.StageStyle;
import javafx.scene.Cursor; //this would be used for the cursor example

public class learnJavaFX extends Application {

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
        /* You are allowed to set custom mouse cursors
            primaryScene.setCursor(Cursor.CROSSHAIR); //would set the cursor to a crosshair for example
            possible cursors include "OPEN_HAND, CLOSED_HAND, CROSSHAIR, DEFAULT, DISAPPEAR, E_RESIZE, HAND, MOVE, NE_RESIZE, NW_RESIZE, N_RESIZE, SE_RESIZE, SW_RESIZE, S_RESIZE, TEXT, V_RESIZE, W_RESIZE, WAIT, and NONE"
         */

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

        //lambda expressions explained for good measure
        //you call a method, and that method takes two parameters. One of which has data, the other of which is equivalent to the normal {} in a method
        //except it is instead "event -> {whatever you want to happen}, where the -> is the lambda operator
        //the parentheses are simply because you have a parentheses denoting where the parameters for the method begin, and the event is technically a parameter, so it's within the ()

        //.setOnCloseRequest will do something when stage is closed
        //.setOnHiding will do something while stage is hiding (while-call)
        //.setOnHidden will do something when the stage is hidden (one-time call)
        //.setOnShowing will do something while stage is showing (while-call)
        //.setOnShown will do something when the stage is shown (one-time call)
        primaryStage.setOnCloseRequest(event ->{
            System.out.println("Stage is closing!");
        }); //lambda expression to complete whatever event is in {} when stage is closed
        //-> points to what should be done when event occurs
        //on this topic, can also call primaryStage.close() to close stage

        //Event Handling
        primaryStage.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->{ //lambda expression to complete whatever event is in {} when mouse is clicked
            Label newerLabel = new Label("Mouse Clicked!"); //this is going to create a new label that says "Mouse Clicked" in the event of the mouse being clicked
            Scene newScene = new Scene(newerLabel, 400, 200); //this is going to create a new scene and pack the label into it in the event of the mouse being clicked
            primaryStage.setScene(newScene); //this is going to set the scene in the primaryStage to be newScene in the event of the mouse being clicked
            System.out.println("Mouse Clicked!"); //this is going to output a line to the console to indicate that the mouse was clicked
        });
    }

    public static void main(String[] args){
        Application.launch(args);
    }

}