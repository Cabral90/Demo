package src.controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;


    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("/src/vista/pessoa"), 640, 480); // primary
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {

        String artTexto = "pro1.txt";
       FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));

        System.out.println("RUTA: "+App.class.getResource(fxml + ".fxml"));

        System.out.println("RUTA2: "+App.class.getResource("/src/"+artTexto));

     return fxmlLoader.load();

    }

    public static void main(String[] args) {
        launch();
    }
}