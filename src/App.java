import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
     // Program runs from here
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("FXML/MainUI.fxml"));    // loads the first FXML file to be veiwed, is controlled by MainController.java
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            primaryStage.setResizable(false);
            primaryStage.setTitle("Driving School Sign In");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
 public static void main(String[] args) {
        launch(args);
    }
}
