package rm.mellow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

/*
if you wanted to use a "file URL" to load the FXML file, you would import this library:
import java.net.URL;
and then use the following code:
loader.setLocation(new URL("file:///path/to/fxml/file.fxml"));
*/

public class driver extends Application{

    //create class object
    LoginScreenController LSC = new LoginScreenController();

    public static void main(String[] args) {
        launch(args); //launches the application
    }

    @Override
    public void start(Stage primaryStage) throws Exception { //create new start method
        FXMLLoader loader = new FXMLLoader(); //create a new FXMLLoader object, this will be used to load the FXML created with SceneBuilder
        loader.setLocation(driver.class.getResource("LoginScreen.fxml")); //getClass() will get class of given object, getResource will get the resource of the given string
        //in this case we're using driver.class.getResource() to specify the class, and then call on the resources directory for the fxml file

        Scene scene = new Scene(loader.load(), 600, 400); //create a new scene object, set scene to loader.load() (which is going to load the FXML file), and set the size to 800x600
        primaryStage.setScene(scene); //set the scene for the stage
        primaryStage.setTitle("Matrix In Java"); //set title of stage(window)

        //find out how to change the scene after start() is used. maybe has to do with main function?

        primaryStage.show(); //shows the stage
    }
}
