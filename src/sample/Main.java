
package sample;
//package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
//import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.sound.sampled.Control;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
//import javax.swing.text.html.ImageView;
import java.io.FileInputStream;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
//import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.image.ImageView;


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
public class Main extends Application {
    ClassLoader loader = TestRes.class.getClassLoader();
        private   Media media = new Media(    loader.getResource("music.m4a").toString().toString());
    private MediaPlayer mediaPlayer = new MediaPlayer(media);
    private static Stage stg;
    @Override
    public void start(Stage primaryStage) throws Exception{
        mediaPlayer.play();
        // mediaPlayer.setOnHalted(this);
        mediaPlayer.setOnEndOfMedia(new Runnable() {
            @Override
            public void run() {
                mediaPlayer.seek(Duration.ZERO);
                mediaPlayer.play();
            }
        });

        stg=primaryStage;
        primaryStage.setResizable(false);
        int x = 800, y = 600, p1 = 40, r = 0, g = 200, b = 200;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Farm Frenzy");
        primaryStage.setScene(new Scene(root,600,400));
        //  Group root= new Group();
        //   Stage stage = new Stage();
        /*
        stage.setWidth(x);
        stage.setHeight(y);
        stage.setResizable(false);
        stage.setX(700);
        stage.setY(20);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Goodbye baby please hit the a button");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("a"));
        stage.setScene(scene);
        // kar haye marboot be stage

        Text text=new Text();
        text.setText("Hello dear");
        text.setX(x/2-p1*5/2);
        text.setY(y/2-p1*2/2);
        text.setFont(Font.font("verdana",p1));
        text.setFill(Color.rgb(r+200,g-100,b-50));
        //kar haye marboot be text

        Line line=new Line();
        line.setStartX(400);
        line.setStartY(400);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.rgb(r+150,g-150,b-50));
        line.setOpacity(0.5);
        line.setRotate(45);
        //kar haye marboot be khat

        InputStream stream = new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\f5\\src\\icon.png");
        Image image = new Image(stream);
        //Creating the image view
        ImageView imageView = new ImageView();
        //Setting image to the image view
        imageView.setImage(image);
        //Setting the image view parameters
        imageView.setX(800);
        imageView.setY(100);
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);
        stage.setTitle("Displaying Image");
        //kar haye marboot be image

*/
        // root.getChildren().add(text);
        //root.getChildren().add(line);
        //root.getChildren().add(imageView);
        //  primaryStage.setScene(scene);




        // public void grass_p(){}

        Image image = new Image(new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\f5\\src\\img\\anbar.jpg"));

        //Setting the image view
        ImageView imageView = new ImageView(image);

        //Setting the position of the image
        imageView.setX(50);
        imageView.setY(25);

        //setting the fit height and width of the image view
        imageView.setFitHeight(455);
        imageView.setFitWidth(500);

        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);


        //HBox root = new HBox(imageView);
        // Create the Scene
        // Scene scene = new Scene(root);
        // Add the Scene to the Stage
        //primaryStage.setScene(scene);
        // Set the Title of the Stage
        primaryStage.setTitle("A Fade-in and Fade-out Transition Example");
        // Display the Stage
        primaryStage.show();

        // Set up a fade-in and fade-out animation for the rectangle
        FadeTransition trans = new FadeTransition(Duration.seconds(2), imageView);
        trans.setFromValue(1.0);
        trans.setToValue(.20);
        // Let the animation run forever
        trans.setCycleCount(FadeTransition.INDEFINITE);
        // Reverse direction on alternating cycles
        trans.setAutoReverse(true);
        // Play the Animation
        trans.play();












        //  primaryStage.show();
    }
    public void changeScene(String fxml) throws IOException{
        Parent pane=FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }
    public static void main(String[] args) { launch(args); }
}





