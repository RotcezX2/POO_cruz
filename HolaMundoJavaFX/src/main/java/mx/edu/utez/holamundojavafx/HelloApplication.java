package mx.edu.utez.holamundojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
       Label myLabel = new Label("Hola 3C");
       StackPane root = new StackPane(myLabel);
       Scene scene = new Scene(root, 200, 200);

        stage.setTitle("Mi primer app en java FX");
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Icon/star_1222385.png")));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}