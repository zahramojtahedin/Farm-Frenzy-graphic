package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class AfterLogin {
       @FXML
        private Button logout;
//public void userLogOut(ActionEvent event) throws IOException
//{
   // Main m=new Main();
   // m.changeScene("login.fxml");
//}
public void userLogOut() throws IOException{
    Main m=new Main();
     m.changeScene("sample.fxml");
}
}
