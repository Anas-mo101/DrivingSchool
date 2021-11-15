import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UserController_status {
    Csvreader csv = new Csvreader("student.csv");
    String[] userData;

    @FXML
    private Label practicalclassLbl;

    @FXML
    private Label theoryexamLbl;

    @FXML
    private Label receiveLbl;

    @FXML
    private Label practicalexamLbl;

    @FXML
    private Label theoryclassLbl;

    public void setUserdata(String[] userdata){
        userData = csv.GetUserInfoByUsername(userdata[0]);
        practicalclassLbl.setText(userData[14]);
        theoryexamLbl.setText(userData[15]);
        
        practicalexamLbl.setText(userData[16]);
        theoryclassLbl.setText(userData[13]);

        if(userData[13].equals("done") && userData[14].equals("done")){ 
            receiveLbl.setText("Ready");
        }else{
            receiveLbl.setText("Not Ready");
        }
    }
}

