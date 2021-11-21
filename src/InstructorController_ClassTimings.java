import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

import java.io.IOException;


public class InstructorController_ClassTimings implements Initializable{
    private String[] userData;
    Csvreader csv = new Csvreader("classes schedule.csv");

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextField textinput;

    @FXML
    private TextField PreferredTime;

    @FXML
    private Pane funcPane;

    @FXML
    private Label timingslbl;

       
    @FXML
    private ComboBox  preferredTime;

        
    @FXML
    private Label fridaylbl;

    @FXML
    private Label mondaylbl;

    @FXML
    private Label saturdaylbl;

    @FXML
    private Label ChangesSubmitted;

    @FXML
    private Button submit;

    @FXML
    private Label timelbl;

    @FXML
    private Label wednesdaylbl;
/*
    @FXML
    void timings(ActionEvent event) {

    } */ 
    @FXML
    void ChangeTimeAction(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

    }

    @FXML
    void SubmitAction(ActionEvent event) {

    }

    @FXML
    void signout(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       comboBox.setItems(FXCollections.observableArrayList("Monday 11-12pm","Wednesday 8-9am","Friday 4-5pm","Saturday 5-6pm"));
    }

    @FXML
    void addInputtoComboBox(ActionEvent event) {
        comboBox.getItems().add(textinput.getText());
        textinput.clear();
    }

    @FXML
    void selectPreferredTimeinfo(ActionEvent event) {
        System.out.println(comboBox.getValue());
    }


    @FXML
    void btnSave(ActionEvent event) throws IOException{
        funcPane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/InstructorUI_ClassTimings.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        funcPane.getChildren().add(newLoadedPane);
        InstructorController_ClassTimings user = loader.getController();
        user.setUserdata(userData);
    }

    public void setUserdata(String[] userData) {
        userData = csv.GetUserInfoByUsername(userData[0]);
    }

}


