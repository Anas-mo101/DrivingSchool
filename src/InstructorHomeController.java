import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage; 
import javafx.scene.Node;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class InstructorHomeController {
    private String[] userData;
    Csvreader csv = new Csvreader("users.csv");

    @FXML
    private Pane funcPane;
    
    @FXML
    private Button signout;

    @FXML
    private Label instructorlbl;

    @FXML
    private ImageView Image;

    @FXML
    void timings(ActionEvent event) throws IOException{
        funcPane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/InstructorUI_ClassTimings.fxml"));
        Pane newPane = (Pane) loader.load();
        funcPane.getChildren().add(newPane);
        //InstructorController_ClassTimings user = loader.getController();
        //user.setUserdata(userData);
        // namelbl.setText(userData[0]);*/
    }

    @FXML
    void driving(ActionEvent event) throws IOException{
        funcPane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/InstructorUI_DrivingClasses.fxml"));
        Pane newPane = (Pane) loader.load();
        funcPane.getChildren().add(newPane);
        //InstructorController_DrivingClasses user = loader.getController();
        //user.setUserdata(userData); 
    }

    @FXML
    void student(ActionEvent event) throws IOException {
        funcPane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/InstructorUI_StudentDetails.fxml"));
        Pane newPane = (Pane) loader.load();
        funcPane.getChildren().add(newPane);
        //InstructorController_StudentDetails user = loader.getController();
        //user.setUserdata(userData);
    }

     @FXML
    void training(ActionEvent event) throws IOException{
        funcPane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/InstructorUI_Training.fxml"));
        Pane newPane = (Pane) loader.load();
        funcPane.getChildren().add(newPane);
        //InstructorController_Training ints = loader.getController();
        //ints.setUserdata(userData);
    }
    
    @FXML
    void signout(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/MainUI.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void setInstructorData(String[] userData){
        this.userData = userData;
    }

}


