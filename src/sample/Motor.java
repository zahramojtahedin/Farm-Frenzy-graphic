package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Motor {
    @FXML
    private Button ok;
    @FXML
    private Button cancel;
    @FXML
    private Button product;
    @FXML
    private Button animal;
    public void userOk() throws IOException {
        Main m=new Main();
        m.changeScene("game.fxml");
    }
    public void userCancel() throws IOException {
        Main m=new Main();
        m.changeScene("game.fxml");
    }
    public void userProduct() throws IOException {
        Main m=new Main();
        m.changeScene("motor.fxml");
    }
    public void userAnimal() throws IOException {
        Main m=new Main();
        m.changeScene("motor.fxml");
    }
}
