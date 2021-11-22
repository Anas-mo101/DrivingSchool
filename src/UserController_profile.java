import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class UserController_profile {
    Csvreader csv = new Csvreader("student.csv");
    private String[] userData; 

    @FXML
    private Label studIDlbl;

    @FXML
    private Label emaillbl;

    @FXML
    private Label licencetypelbl;

    @FXML
    private Label agelbl;

    @FXML
    private Label idTypelbl;

    @FXML
    private Label namelbl;

    @FXML
    private Label idNolbl;

    @FXML
    private Label phonelbl;

    @FXML
    private Label nationallbl;

    public void setUserdata(String[] userdata){
        userData = csv.GetUserInfoByUsername(userdata[0]);
        namelbl.setText(userData[0]);
        studIDlbl.setText(userData[3]);
        agelbl.setText(userData[4]);
        phonelbl.setText(userData[5]);
        emaillbl.setText(userData[6]);
        idTypelbl.setText(userData[7]);
        idNolbl.setText(userData[8]);
        nationallbl.setText(userData[9]);
        licencetypelbl.setText(userData[10]); 
    }

}
