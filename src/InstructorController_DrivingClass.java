import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

public class InstructorController_DrivingClass {
    private String[] userData;
    Csvreader csv = new Csvreader("Driving classes.csv");

    @FXML
    private ImageView image;


    public void setUserdata(String[] userData) {
        userData = csv.GetUserInfoByUsername(userData[0]);
    }


}
