package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Helicopter {
    @FXML
    private Button ok;
    @FXML
    private Button cancel;
    @FXML
    private Button products;
    @FXML
    private Button order;
    public void userOk() throws IOException {
        Main m=new Main();
        m.changeScene("game.fxml");
    }
    public void userCancel() throws IOException {
        Main m=new Main();
        m.changeScene("game.fxml");
    }
    public void userProducts() throws IOException {
        Main m=new Main();
        m.changeScene("helicopter.fxml");
    }
    public void userOrder() throws IOException {
        Main m=new Main();
        m.changeScene("helicopter.fxml");
    }
}
