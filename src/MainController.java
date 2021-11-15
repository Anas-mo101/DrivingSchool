import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;


public class MainController {
    private final int USERTYPE_INDEX = 2;
    private final int USERNAME_INDEX = 0;
    private final int PASS_INDEX = 1;
    private Stage stage;
    private Scene scene;
    private Parent root;
    Csvreader csv = new Csvreader("users.csv");

    @FXML
    private TextField passwordFeild;

    @FXML
    private TextField usernameFeild;

    @FXML
    private Label statusLbl;
 
    @FXML
    void btnSignIn(ActionEvent event) throws IOException{

        if(csv.CheckLoginDetails(usernameFeild.getText(),passwordFeild.getText())){
            statusLbl.setText("Login Successfull");
            switch (csv.GetUserData(USERTYPE_INDEX, csv.getUserLineLocation())){
                case "student": 
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/StudentUI.fxml"));
                    root = (Parent) loader.load();
                    UserController user = loader.getController();
                    user.setUseData(csv.GetUserData(csv.getUserLineLocation()));
                    break;
                default:
                    break;
            }
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
        }else{
            statusLbl.setText("Login Failed");
        }
    }
}
