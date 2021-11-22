import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.time.LocalDate;


public class DatePickerController extends Application  {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("DatePicker ");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/DrivingTest.fxml"));
        DatePicker datePicker = new DatePicker();

        Button button = new Button("Read Date");

        button.setOnAction(action -> {
            LocalDate value = datePicker.getValue();
        });

        HBox hbox = new HBox(datePicker);

        Scene scene = new Scene(hbox, 300, 240);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}