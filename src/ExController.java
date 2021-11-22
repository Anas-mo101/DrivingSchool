import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ExController implements Initializable {
    private String[] examData;
    Csvreader csv = new Csvreader("users.csv");


    @FXML
    private Pane PaneFunc;

    @FXML
    private Label nameLbl;

    @FXML
    private ImageView imageView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        File file = new File("@../imgs/examinerUI.jpeg");
        Image image = new Image(file.toURI().toString());
        imageView.setImage(image);
    }


    @FXML
    void btnDT(ActionEvent event) throws IOException{
        PaneFunc.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/DrivingTest.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        PaneFunc.getChildren().add(newLoadedPane);
       // DrivingTestController user = loader.getController();
      //  user.setUserdata(examData);



    }

    @FXML
    void btnStud(ActionEvent event) throws IOException{
        PaneFunc.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/ListStuds.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        PaneFunc.getChildren().add(newLoadedPane);
     //   ListStudController user = loader.getController();
      //  user.setUserdata(examData);


    }

    @FXML
    void btnLicense(ActionEvent event) throws IOException {
       PaneFunc.getChildren().clear();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/LicenseApp.fxml"));
        Pane newLoadedPane = (Pane) loader.load();
        PaneFunc.getChildren().add(newLoadedPane);

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

    public void setUseData(String[] examData){
        this.examData = examData;
        nameLbl.setText(examData[0]);
    }

}


