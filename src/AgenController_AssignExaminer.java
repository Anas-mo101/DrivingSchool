import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class AgenController_AssignExaminer implements Initializable {
    Csvreader csv = new Csvreader("Examiner.csv");     
    Csvreader csv1 = new Csvreader("Studentist.csv");

    @FXML
    private TableView<Person> tableview;

    @FXML
    private TableColumn<Person, String> colEligbleStud;

    @FXML
    private TableColumn<Person, String> colExaminer;

    @FXML
    private TableColumn<Person, Integer> colID;

    @FXML
    private TableColumn<Person, String> colStatus;

    @FXML
    private Button AddtoTable;

    @FXML
    private ComboBox<String> EligName;

    @FXML
    private ComboBox<String> Examiner;

    @FXML
    private ComboBox<String> Number;

    @FXML
    private ComboBox<String> Status;

    @Override
    public void initialize(URL url, ResourceBundle rb){

        colID.setCellValueFactory(new PropertyValueFactory<>("No"));
        colEligbleStud.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colExaminer.setCellValueFactory(new PropertyValueFactory<>("Approval"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("Status"));

        
        ObservableList<String> listNo = FXCollections.observableArrayList("1","2","3","4","5","6","7","8","9");
        Number.setItems(listNo);
        ObservableList<String> listEligName = FXCollections.observableArrayList(csv1.getUserInfo());
        EligName.setItems(listEligName);
        ObservableList<String> listExaminer = FXCollections.observableArrayList(csv.getUserInfo());
        Examiner.setItems(listExaminer);
        ObservableList<String> listStatus = FXCollections.observableArrayList("JPJ Test","QTI Test 1","QTI Test 2");
        Status.setItems(listStatus);
    }
    @FXML
    void AddTable(ActionEvent event) {
        try{
        String mes_cond      =   Number.getSelectionModel().getSelectedItem().toString();
        String mes_cond1     =   EligName.getSelectionModel().getSelectedItem().toString();
        String mes_cond2     =   Examiner.getSelectionModel().getSelectedItem().toString();
        String mes_cond3     =   Status.getSelectionModel().getSelectedItem().toString();
        Person person = new Person(mes_cond, mes_cond1, mes_cond2, mes_cond3);
        addUser1(mes_cond, mes_cond1, mes_cond2, mes_cond3);
        tableview.getItems().add(person);
        }
        catch (Exception e) {
            System.out.println("Empty Input");
            AddtoTable.setDisable(false);
        }
    }

    private void addUser1(String number, String eligname,String examiner ,String status) {
        try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("TestExam.csv", true));
                writer.append(number + "," + eligname + "," + examiner + "," + status + "\n" );
                writer.close();
        } catch (IOException ex) {
            System.out.println("No file found.");
        }
    }   
     
}
