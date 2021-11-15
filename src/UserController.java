import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class UserController implements Initializable {
    private String[] userData;
    Csvreader csv = new Csvreader("users.csv");

    @FXML
    private VBox ppArea;

    @FXML
    private Label nameLbl;

    @FXML
    private VBox bannerContainer;

    @FXML
    void btnProfile(ActionEvent event) {
        
    }

    @FXML
    void btnSetting(ActionEvent event) {

    }

    @FXML
    void btnProgress(ActionEvent event) {

    }

    @FXML
    void btnStatus(ActionEvent event) {

    }

    @FXML
    void btnPayment(ActionEvent event) {

    }

    public void setUseData(String[] userData){
        this.userData = userData;
        nameLbl.setText(userData[0]);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }
}


