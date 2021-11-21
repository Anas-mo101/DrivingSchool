import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage; 
import javafx.scene.Node;

public class UserController {
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
    void btnPayment(ActionEvent event) throws IOException{
        funcPane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/StudentUI_payment.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        funcPane.getChildren().add(newLoadedPane);
        UserController_payments user = loader.getController();
        user.setUserdata(userData);
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

    public void setUseData(String[] userData){
        this.userData = userData;
        nameLbl.setText(userData[0]);
    }

}


