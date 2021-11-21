import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;


public class InstructorController_Training {
    private String[] userData;
    Csvreader csv = new Csvreader("training.csv");

    @FXML
    private Pane funcPane;

    @FXML
    private Button Training;

    @FXML
    private Label VenueOfTraining;

    @FXML
    void TrainingAction(ActionEvent event) {

    }

    public void setUserdata(String[] userdata){
        userData = csv.GetUserInfoByUsername(userdata[0]);
    }

}

