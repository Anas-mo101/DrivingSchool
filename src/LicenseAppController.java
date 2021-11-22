import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class LicenseAppController  extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView licenseApp = new TableView();

        TableColumn<DrivingTestController.Person, String> name = new TableColumn<>("NAME");
        name.setCellValueFactory(new PropertyValueFactory<>("name"));


        TableColumn<ListStudController.Person, String> license = new TableColumn<>("LICENSE");
        license.setCellValueFactory(new PropertyValueFactory<>("license"));


        licenseApp.getColumns().add(name);
        licenseApp.getColumns().add(license);

        licenseApp.getItems().add(new LicenseAppController.Person("LEE TING WEI", "APPROVED"));
        licenseApp.getItems().add(new LicenseAppController.Person("MUHD LUQMAN HAKIM", "PENDING"));
        licenseApp.getItems().add(new LicenseAppController.Person("ALYA QAISARA", "APPROVED"));
        licenseApp.getItems().add(new LicenseAppController.Person("NORILYANA NORZALI", "APPROVED"));
        licenseApp.getItems().add(new LicenseAppController.Person("MUHAMMAD GHUFRAN", "APPROVED"));
        licenseApp.getItems().add(new LicenseAppController.Person("REUBEN LUKE", "APPROVED"));
        licenseApp.getItems().add(new LicenseAppController.Person("AZHAR AHMAD ANUAR", "APPEROVED"));
        licenseApp.getItems().add(new LicenseAppController.Person("SITI MAISARAH", "PENDING"));
        licenseApp.getItems().add(new LicenseAppController.Person("SYAHNAZ MUHD AZHAN", "PENDING"));
        licenseApp.getItems().add(new LicenseAppController.Person("MOHAMAD ABDUL KHATAB", "PENDING"));


        VBox vbox1 = new VBox(licenseApp);

        Scene scene = new Scene(vbox1);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    class Person {

        private String name = null;
        private String license = null;

        public Person() {
        }

        public Person(String name, String license) {
            this.name = name;
            this.license = license;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLicense() {
            return license;
        }

        public void setLicense(String license) {
            this.license = license;
        }
    }
    public void btnUpdate(ActionEvent actionEvent) {
    }

    public void btnDelete(ActionEvent actionEvent) {
    }

    public void signout1(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/MainUI.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
