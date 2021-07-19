package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Menu {
    @FXML
    private Button continue_b;
    @FXML
    private Button main_menu;
    @FXML
    private Button restart;
    @FXML
    private Button logout1;
    public void userContinue_b() throws IOException {
        Main m=new Main();
        m.changeScene("game.fxml");
    }
    public void userMain_Menu() throws IOException {
        Main m=new Main();
        m.changeScene("sample.fxml");
    }
    public void userRestart() throws IOException {
        Main m=new Main();
        m.changeScene("game.fxml");
    }
    public void userLogout1() throws IOException {
        Main m=new Main();
        m.changeScene("afterLogin.fxml");
    }
}
