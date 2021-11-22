

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class ListStudController extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView listStud = new TableView();

        TableColumn<DrivingTestController.Person, String> name = new TableColumn<>("NAME");
        name.setCellValueFactory(new PropertyValueFactory<>("name"));


        TableColumn<ListStudController.Person, String> contactno = new TableColumn<>("CONTACT NO");
        contactno.setCellValueFactory(new PropertyValueFactory<>("contactno"));


        listStud.getColumns().add(name);
        listStud.getColumns().add(contactno);

        listStud.getItems().add(new ListStudController.Person("LEE TING WEI", "0189098988"));
        listStud.getItems().add(new ListStudController.Person("MUHD LUQMAN HAKIM", "0198898088"));
        listStud.getItems().add(new ListStudController.Person("ALYA QAISARA", "0126252202"));
        listStud.getItems().add(new ListStudController.Person("NORILYANA NORZALI", "01154556766"));
        listStud.getItems().add(new ListStudController.Person("MUHAMMAD GHUFRAN", "0198878687"));
        listStud.getItems().add(new ListStudController.Person("REUBEN LUKE", "0132227879"));
        listStud.getItems().add(new ListStudController.Person("AZHAR AHMAD ANUAR", "01134353677"));
        listStud.getItems().add(new ListStudController.Person("SITI MAISARAH", "0118889798"));
        listStud.getItems().add(new ListStudController.Person("SYAHNAZ MUHD AZHAN", "0198876768"));
        listStud.getItems().add(new ListStudController.Person("MOHAMAD ABDUL KHATAB", "0134557575"));


        VBox vbox = new VBox(listStud);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    class Person {

        private String name = null;
        private String contactno = null;

        public Person() {
        }

        public Person(String name, String contactno) {
            this.name = name;
            this.contactno = contactno;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContactno() {
            return contactno;
        }

        public void setContactno(String contactno) {
            this.contactno = contactno;
        }


        public void setUserdata(String[] examData) {

        }
    }}

