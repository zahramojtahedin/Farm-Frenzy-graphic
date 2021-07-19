package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
public class LogIn {

    public LogIn () {
    }
//MainView
    @FXML
    private Button button;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

  //  String path="C:\\Users\\Asus\\IdeaProjects\\f5\\src\\music.m4a";
   // Media media=new Media(new File(path).toURI().toString());

  //  public void userLogIn ( ActionEvent event ) throws IOException{
       // checkLogin();
    //}
    public void userLogIn() throws IOException{
        checkLogin();
    }
    private void checkLogin() throws IOException{
        Main m =new Main();
        if ((username.getText().toString().equals("zeinab")||(username.getText().toString().equals("zahra")))&&password.getText().toString().equals("123")){
            wrongLogIn.setText("Success!!!");
           // m.changeScene("afterLogin.fxml");
            m.changeScene("game.fxml");
        }
        else if(username.getText().isEmpty()||password.getText().isEmpty())
        {
            wrongLogIn.setText("please enter your data.");
        }
        else {
            wrongLogIn.setText("sorry dear your password or username is wrong!");
        }
    }
        }
