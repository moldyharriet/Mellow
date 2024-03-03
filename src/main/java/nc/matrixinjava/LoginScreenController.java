package nc.matrixinjava;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginScreenController implements Initializable{

    //create test credentials to run the user input against
    private final String testUsername = "testUser";
    private final String testPassword = "testPass";


    @Override
    public void initialize(URL url, ResourceBundle rb){
        //if we want anything to happen on initialization, put it here
    }

    //"login" button
    @FXML
    Button loginButton; //loginButton from FXML file
    @FXML
    public void loginButtonPressed(){ //this function is going to need to have the functionality to call userFieldEntered(), and passFieldEntered()
        System.out.println("Login button pressed!");
        userFieldEntered();
        passFieldEntered();
    }

    @FXML
    TextField userField; //userField from FXML file
    @FXML
    public void userFieldEntered(){
        String input = userField.getText(); //stores output of userField.getText() in new string input
        if(!input.equals(testUsername)){
            System.out.println("Wrong username!");
        }
        else{
            System.out.println("Username entered: " + input);
        }
    }

    @FXML
    PasswordField passField; //passField from FXML file
    @FXML
    public void passFieldEntered(){
        String input = passField.getText(); //stores output of passField.getText() in new string input
        if(!input.equals(testPassword)){
            System.out.println("Wrong password!");
        }
        else{
            System.out.println("Password entered: " + input);
        }
    }


}
