import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.net.URL;
import java.util.ResourceBundle;

public class InstructorController_StudentDetails {
    private String[] userData;
    Csvreader csv = new Csvreader("student details.csv");

    @FXML
    private Pane funcPane;

   @FXML
    private Label genderlbl;

    @FXML
    private Label nationalitylbl;

    @FXML
    private Label contactNumberlbl;

    @FXML
    private Label emailAddlbl;

    @FXML
    private Label studentlbl;

    
    @FXML
    private Label studentIDlbl;

    @FXML
    private Label lNamelbl;

    @FXML
    private Label fNamelbl;

    @FXML
    private Label DOBlbl;

    @FXML
    private Label StudentDetails;

    @FXML
    void StudentAction(ActionEvent event) {

    }

    public void setUserdata(String[] userData) {
        userData = csv.GetUserInfoByUsername(userData[0]);
        studentIDlbl.setText(userData[0]);
        fNamelbl.setText(userData[3]);
        lNamelbl.setText(userData[4]);
        DOBlbl.setText(userData[5]);
        genderlbl.setText(userData[6]);
        nationalitylbl.setText(userData[7]);
        contactNumberlbl.setText(userData[8]);
        emailAddlbl.setText(userData[9]);
        





    }





}
