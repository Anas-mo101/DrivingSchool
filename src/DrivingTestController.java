import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class DrivingTestController extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView testSchedule = new TableView();

        TableColumn<Person, String> column1 = new TableColumn<>("TIMING");
        column1.setCellValueFactory(new PropertyValueFactory<>("timing"));


        TableColumn<Person, String> column2 = new TableColumn<>("LICENSE TYPE");
        column2.setCellValueFactory(new PropertyValueFactory<>("licensetype"));


        testSchedule.getColumns().add(column1);
        testSchedule.getColumns().add(column2);

        testSchedule.getItems().add(new Person("8am-10am", "B2 License"));
        testSchedule.getItems().add(new Person("10am-12pm", "D/DA License"));
        testSchedule.getItems().add(new Person("12pm-1pm", "-"));
        testSchedule.getItems().add(new Person("2pm-4pm", "B2 License"));
        testSchedule.getItems().add(new Person("4pm-6pm", "D/DA License"));


        VBox vbox = new VBox(testSchedule);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    class Person {

        private String timing = null;
        private String licensetype = null;

        public Person() {
        }

        public Person(String timing, String licensetype) {
            this.timing = timing;
            this.licensetype = licensetype;
        }

        public String getTiming() {
            return timing;
        }

        public void setTiming(String firstName) {
            this.timing = firstName;
        }

        public String getLicenseType() {
            return licensetype;
        }

        public void setLicenseType(String lastName) {
            this.licensetype = lastName;
        }




    public void setUserdata(String[] examData) {
    }}}
