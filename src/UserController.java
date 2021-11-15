import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class UserController implements Initializable {
    private String[] userData;
    Csvreader csv = new Csvreader("users.csv");

    @FXML
    private Pane funcPane;
    
    @FXML
    private VBox ppArea;

    @FXML
    private Label nameLbl;

    @FXML
    private VBox bannerContainer;


    @FXML
    void btnProfile(ActionEvent event) throws IOException{
        funcPane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/StudentUI_profile.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        funcPane.getChildren().add(newLoadedPane);
        UserController_profile user = loader.getController();
        user.setUserdata(userData);
        // namelbl.setText(userData[0]);
    }

    @FXML
    void btnProgress(ActionEvent event) throws IOException{
        funcPane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/StudentUI_progress.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        funcPane.getChildren().add(newLoadedPane);
        UserController_progress user = loader.getController();
        user.setUserdata(userData); 
    }

    @FXML
    void btnStatus(ActionEvent event) throws IOException {
        funcPane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/StudentUI_status.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        funcPane.getChildren().add(newLoadedPane);
        UserController_status user = loader.getController();
        user.setUserdata(userData);
    }

    @FXML
    void btnPayment(ActionEvent event) {

    }
    
    @FXML
    void signout(ActionEvent event) {

    }

    public void setUseData(String[] userData){
        this.userData = userData;
        nameLbl.setText(userData[0]);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }
}


