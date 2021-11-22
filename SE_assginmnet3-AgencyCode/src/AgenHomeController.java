import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;

public class AgenHomeController{
    Csvreader csv = new Csvreader("users.csv");

    @FXML
    private Button ReturnHome;

    @FXML
    private Text Title;

    @FXML
    private ImageView Imagebg;

    @FXML
    private Label Agentllbl;

    @FXML
    private Label Welcomelbl;

    @FXML
    private Pane funcpane;


    @FXML
    void RecruitStud(ActionEvent event) throws IOException {
        funcpane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/AgenUI_RecruitStud.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        funcpane.getChildren().add(newLoadedPane);
    }

    @FXML
    void UpdateStud(ActionEvent event) throws IOException {
        funcpane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/AgenUI_UpdateStud.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        funcpane.getChildren().add(newLoadedPane);
        

    }

    @FXML
    void AddInstruc(ActionEvent event) throws IOException {
        funcpane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/AgenUI_AddInstruc.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        funcpane.getChildren().add(newLoadedPane);

    }

    @FXML
    void UpdInst(ActionEvent event) throws IOException {
        funcpane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/AgenUI_UpdateInstruc.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        funcpane.getChildren().add(newLoadedPane);

    }

    @FXML
    void AssExam(ActionEvent event) throws IOException {
        funcpane.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/AgenUI_AssignExaminer.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        funcpane.getChildren().add(newLoadedPane);

    }

    @FXML
    void Logout(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/MainUI.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void ReturnHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/AgenUI.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    

    public void setAgentData(String[] userData){
        Agentllbl.setText(userData[0]);
    }

}