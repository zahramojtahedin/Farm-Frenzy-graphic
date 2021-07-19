package sample;

//import com.sun.prism.Image;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

//import javax.swing.text.html.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;
//import javafx.scene.image.ImageView;





//import basecode.Functions.GAME_ORDERS;
//import basecode.Functions.Main_Manager;
//import basecode.Functions.Variable_Reading;
//import basecode.Objects.Animal.*;
//import basecode.Objects.Products.*;
//import basecode.Objects.X_Y;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import com.sun.javafx.scene.SceneHelper;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
//import view.Main;

import java.io.IOException;
import java.util.HashMap;
//import javax.swing.SpringLayout.WIDTH;
import java.util.Random;

public class Game {
    @FXML
    private Button menu;
   @FXML
    ImageView myImageView;
    @FXML
    private Button f1;
    @FXML
    private Button bird_b;
    //
   // @FXML
   // private ImageView motor_r;
    //Image myImage=new Image(getClass().getResourceAsStream("factory4.png"));
    @FXML
    private Button f2;
    @FXML
    private Button f3;
    @FXML
    private Button f4;
    @FXML
    private Button well_b;
    @FXML
    private AnchorPane base;

    public void initialize(){

        base.setOnMouseClicked(event -> {
            //Update_factory ();
            try {
                Add_Grass(event.getX(), event.getY());
              //  Update_factory ();
                //Add_Bird(event.getX(), event.getY());
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }



    public void userF1() throws IOException {
        Image factory1 = new Image(getClass().getResourceAsStream("factory5.png"));
       // public void Update_factory (;)
        {
         myImageView.setImage(factory1);
          //  factory1.setFitWidth(40);
            //factory1.setFitHeight(40);
           // base.getChildren().add(15 ,factory1);
        }
    }

    /*
    public void Add_Grass(double X, double Y){
        System.out.println(X);
        System.out.println(Y);
        X_Y x_y = scaleXY(X,Y);
        System.out.println(x_y.getX());
        System.out.println(x_y.getY());
        if (GAME_ORDERS.getInstance().Plant(x_y.getX(),x_y.getY(),Main_Manager.getInstance().getCURRENT_USER())){
            ImageView image = new ImageView(new Image("C:\\Users\\Asus\\IdeaProjects\\f5\\src\\img\\grass.png"));//TODO
            X_Y x_y_view = back_scaleXY(x_y.getX(),x_y.getY());
            image.setLayoutX(x_y_view.getX());
            image.setLayoutY(x_y_view.getY());
            image.setFitWidth(WIDTH/Variable_Reading.getInstance().getMap_size()[0]);
            image.setFitHeight(HEIGHT/Variable_Reading.getInstance().getMap_size()[1]);
            base.getChildren().add(image);
        }
    }
    public X_Y scaleXY(double X, double Y){
        X_Y x_y = new X_Y(0,0);
        x_y.setX((int) Math.ceil((X)/(WIDTH/ Variable_Reading.getInstance().getMap_size()[0])));
        x_y.setY((int) Math.ceil((Y)/(HEIGHT/ Variable_Reading.getInstance().getMap_size()[1])));
        return x_y;
    }

    public X_Y back_scaleXY(int X, int Y){
        X_Y x_y = new X_Y(0,0);
        x_y.setX((X-1)*(WIDTH/Variable_Reading.getInstance().getMap_size()[0]));
        x_y.setY((Y-1)*(HEIGHT/Variable_Reading.getInstance().getMap_size()[1]));
        return x_y;
    }
    */
     //*/

    public void Add_Grass ( double x, double y ) throws IOException{
        base.setOnMouseClicked(e -> {
            //FoodAndWater.spaceRemaining -= 20;
            ImageView image = new ImageView(new Image("grass.png"));
            image.setLayoutX(e.getX());
            image.setLayoutY(e.getY());
            System.out.println(e.getX());
            System.out.println(e.getY());
            image.setFitWidth(40);
            image.setFitHeight(40);
            base.getChildren().add(10 , image);
        });
  }
   /*
    public void well_p() throws IOException{
        base.setOnMouseClicked(e -> {
            //FoodAndWater.spaceRemaining -= 20;
            ImageView image = new ImageView(new Image("well.png"));
            image.setLayoutX(e.getX());
            image.setLayoutY(e.getY());
            image.setFitWidth(50);
            image.setFitHeight(50);
            base.getChildren().add(20 , image);
        });
    }

*/
   public void userBird_b() throws IOException {
       //Main m=new Main();
       //m.changeScene("menu.fxml");
       //public void Add_Bird (double x, double y  ) throws IOException{
           //base.setOnMouseClicked(e -> {
               //FoodAndWater.spaceRemaining -= 20;
       double x=(Math.random()*1000)%400;
       double y=(Math.random()*100)%400;
       if(x<200)
           x+=120;
       if(y<200)
           y+=150;
       System.out.println(x);
               ImageView image2 = new ImageView(new Image("bird.png"));
               image2.setLayoutX(x);
               image2.setLayoutY(y);
               image2.setFitWidth(70);
               image2.setFitHeight(70);
               base.getChildren().add(20 , image2);
           //});
  // }
}
    public void userMenu() throws IOException {
        Main m=new Main();
        m.changeScene("menu.fxml");
    }
    public void userMotor() throws IOException {
        Main m=new Main();
        m.changeScene("motor.fxml");
    }
    public void userHelicopter() throws IOException {
        Main m=new Main();
        m.changeScene("helicopter.fxml");
    }
    //public void userF1() throws IOException
     {
       // Main m=new Main();
      //  m.changeScene("menu.fxml");
       // public void update_factory()
        {
          //  Image myImage=new Image(getClass().getResourceAsStream("factory4.png"));
         //   myImageView.setImage(myImage);
        }
       // Image factory1=new Image(getClass().getResourceAsStream("factory4.png"));
       //public void Update_factory()
        {
          //     myImageView.setImage(factory1);
        }
    }
    public void userF2() throws IOException {
        // Main m=new Main();
        // m.changeScene("menu.fxml");
    }
    public void userF3() throws IOException {
        // Main m=new Main();
        // m.changeScene("menu.fxml");
    }
    public void userF4() throws IOException {
        // Main m=new Main();
        // m.changeScene("menu.fxml");
    }
    public void userWell_b() throws IOException {
        // Main m=new Main();
        // m.changeScene("menu.fxml");
    }

}
