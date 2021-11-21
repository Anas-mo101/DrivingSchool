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
import javafx.scene.control.TextField;

public class AgenController_UpdateInstruc implements Initializable {
    Csvreader csv = new Csvreader("Instructor.csv");

    @FXML
    private ComboBox<String> Agency_Name;

    @FXML
    private TextField Instruc_ID;

    @FXML
    private TextField Name;

    @FXML
    private TextField Schedule;

    @FXML
    private Button SubmitItem;

    @FXML
    private ComboBox<String> lesson;

    @FXML
    private ComboBox<String> workHours;


    @Override
    public void initialize(URL url, ResourceBundle rb){
        ObservableList<String> listConduc = FXCollections.observableArrayList("Teach Driving","Conduct Seminar");
        lesson.setItems(listConduc);
        ObservableList<String> listAgen = FXCollections.observableArrayList("Driver Club","ManduCekap","Drive Us","Power Club");
        Agency_Name.setItems(listAgen);
        ObservableList<String> listWorkHour = FXCollections.observableArrayList("2 hrs","3 hrs","4hrs","> 5 hrs");
        workHours.setItems(listWorkHour);
    }

    @FXML
    void SaveInfo(ActionEvent event) {
        try {
        String mes_name     =   Name.getText();
        String mes_id       =   Instruc_ID.getText();
        String mes_sche     =   Schedule.getText();
        String mes_cond     =   lesson.getSelectionModel().getSelectedItem().toString();  
        String mes_agen     =   Agency_Name.getSelectionModel().getSelectedItem().toString();  
        String mes_wrkhour  =   workHours.getSelectionModel().getSelectedItem().toString();  

        
        addUser1(mes_name, mes_id, mes_sche,mes_cond,mes_agen,mes_wrkhour);
    } catch (Exception e) {
        System.out.println("Empty Input");
    }
}

    private void addUser1(String name, String instruc_ID,String lesson ,String schedule,String workhour,String agencyName) {

        try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("instructor.csv", true));
                writer.append("\n" + name + "," + instruc_ID + "," + lesson + "," + schedule + "," + workhour + "," + agencyName);
                //csv.setUserData(name, 0, instruc_ID, 1);
                writer.close();
        } catch (IOException ex) {
            System.out.println("No file found.");
        }
    }


}