import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class UserController_payments {
    Csvreader csv = new Csvreader("student.csv");
    String[] userData;
    
    @FXML
    private Button Debtbnkbtn;

    @FXML
    private Label balanceLbl;

    @FXML
    private Button OnlineBnkbtn;

    @FXML
    void checkBalance(ActionEvent event) {
        balanceLbl.setText(userData[17]);
        if(Integer.parseInt(userData[17]) > 0){
            Debtbnkbtn.setDisable(false);
            OnlineBnkbtn.setDisable(false);
        }
    }

    @FXML
    void OnlineBnk(ActionEvent event) {

    }

    @FXML
    void Debtbnking(ActionEvent event) {

    }

    public void setUserdata(String[] userdata){
        userData = csv.GetUserInfoByUsername(userdata[0]);
    }

}
