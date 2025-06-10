package mx.edu.utez.holamundojavafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
       Label lblNombre = new Label("Nombre");
        TextField tfNombre = new TextField();
        Label lblEdad = new Label("Edad");
        TextArea tfEdad = new TextArea();
        Label lblOpciones = new Label("Opciones");
        ObservableList<String> opciones = FXCollections.observableArrayList("Estudiante", "Profesor", "Administrador");
        ComboBox<String> cmbOpciones = new ComboBox<>(opciones);
        Button btnAceptar = new Button("Crear");
        Label lblResultado = new Label();
       //StackPane root = new StackPane(myLabel);
       //Scene scene = new Scene(root, 200, 200);

       btnAceptar.setOnAction( e -> {
           String nombre = tfNombre.getText();
           String edad = tfEdad.getText();
           String seleccion = cmbOpciones.getSelectionModel().getSelectedItem();
           if(nombre.isEmpty() || edad.isEmpty() || seleccion.isEmpty()){
               System.out.println("Todos los campos son obligatorios");
           } else{
               GridPane form = new GridPane();
               form.setStyle("-fx-background-color: #7CFC00");

               lblResultado.setText("Nombre " + nombre + "\nEdad " + edad + "\nSeleccion " + seleccion);
           }
       });


        GridPane form = new GridPane();

        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);

        form.add(lblNombre, 0, 0);
        form.add(tfNombre, 1, 0);
        form.add(lblEdad, 0, 1);
        form.add(tfEdad, 1, 1);
        form.add(lblOpciones, 0, 2);
        form.add(cmbOpciones, 1, 2);
        form.add(btnAceptar, 0, 3);
        form.add(lblResultado, 1, 4);

       //root.setPadding(new Insets(20));
       //root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(form, 100, 100);

        stage.setTitle("Mi primer app en java FX");
        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Icon/star_1222385.png")));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    /*

    Crea un formulario que contenga

Nombre
edad
Combo con opciones ("estudiante", "profesor", "admin")
Boton crear
Label resultado


Al dar clic en crear

Verificar que todos los campos contengan info
cambiar el color del gridPane y del lblResultado a verde
pintar el valor de los campos en lblResultado
     */
    public static void main(String[] args) {
        launch();
    }
}