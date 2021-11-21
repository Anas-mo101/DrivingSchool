import java.text.DecimalFormat;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class UserController_progress {
    Csvreader csv = new Csvreader("student.csv");
    String[] userData;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @FXML
    private Label theoryhoursdoneLBL;

    @FXML
    private ProgressBar theorybar;

    @FXML
    private Label practicalhourleftLBL;

    @FXML
    private Label practicalhoursdoneLBL;

    @FXML
    private Label theoryhourleftLBL;

    @FXML
    private ProgressBar pracbar;

    @FXML
    private Label theoryexamLBL;

    @FXML
    private Label practicalexamLBL;

    public void setUserdata(String[] userdata){
        userData = csv.GetUserInfoByUsername(userdata[0]);
        theoryhoursdoneLBL.setText(userData[11]);
        theoryhourleftLBL.setText( Integer.toString(5-Integer.parseInt(userData[11])) );
        practicalhoursdoneLBL.setText(userData[12]);
        practicalhourleftLBL.setText( Integer.toString(22-Integer.parseInt(userData[12])) );
        theoryexamLBL.setText(userData[13]);
        practicalexamLBL.setText(userData[14]);
        theorybar.setProgress( Double.parseDouble(df.format(Double.parseDouble(userData[11])/5)) );
        pracbar.setProgress( Double.parseDouble(df.format(Double.parseDouble(userData[12])/22)) ); 
    }
}