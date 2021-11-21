import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AgenController_UpdateStud implements Initializable{

    @FXML
    private TextField name;

    @FXML
    private TextField studentid;

    @FXML
    private DatePicker TestDate;

    @FXML
    private Button UpdateItem;

    @FXML
    private ComboBox<String> License_Type;

    @FXML
    private ComboBox<String> Prog_Level;

    @FXML
    private DatePicker Admission;

    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        ObservableList<String> listProg = FXCollections.observableArrayList("Ready For Test","Still Learn");
        Prog_Level.setItems(listProg);
        ObservableList<String> listLicentype = FXCollections.observableArrayList("B-(Full)","B2","D","E");
        License_Type.setItems(listLicentype);
    }

    @FXML
    void UpdateStudentProgress(ActionEvent event) {
        try {
            String mes_name     =   name.getText();
            String mes_id       =   studentid.getText();
            String mes_prog     =   Prog_Level.getSelectionModel().getSelectedItem().toString(); 
            String mes_lcsType  =   License_Type.getSelectionModel().getSelectedItem().toString();

            LocalDate mes_test  =   TestDate.getValue(); 
            LocalDate mes_addmis = Admission.getValue();

            addUser1(mes_name, mes_id, mes_prog,mes_test,mes_addmis,mes_lcsType);

        } catch (Exception e) {
            System.out.println("Empty Input");
        }

    }


    public void addUser1(String name, String student_ID,String Proglevel,LocalDate test,LocalDate Admis,String LcnType) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("student.csv", true));
            writer.append(name + "," + student_ID + "," + Proglevel + "," + test + "," + Admis + "," + LcnType + "\n");
            writer.close();
        } catch (IOException ex) {
            System.out.println("No file found.");
        }
    }


}


