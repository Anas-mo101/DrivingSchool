import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class UserController_payments {
    Csvreader csv = new Csvreader("student.csv");
    String[] userData;
    String newDue;

    @FXML
    private Button Debtbnkbtn;

    @FXML
    private Label balanceLbl;

    @FXML
    private Button OnlineBnkbtn;

    @FXML
    void checkBalance(ActionEvent event) {
        balanceLbl.setText(userData[17]);
        if(Integer.parseInt(userData[17]) > 0){
            Debtbnkbtn.setDisable(false);
            OnlineBnkbtn.setDisable(false);
        }
    }

    @FXML
    void OnlineBnk(ActionEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("FXML/pay.fxml"));
            Parent root1 = (Parent) Loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1)); 
            stage.setResizable(false); 
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UTILITY);
            stage.setTitle("Make a Payment");
            Pay pay = Loader.getController();
            pay.setAmount(userData[17]);
            stage.showAndWait();
            System.out.println(pay.getAmountDone());
            paid(pay.getAmountDone());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Debtbnking(ActionEvent event) {
        try {
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("FXML/pay.fxml"));
            Parent root1 = (Parent) Loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1)); 
            stage.setResizable(false); 
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UTILITY);
            stage.setTitle("Make a Payment");
            Pay pay = Loader.getController();
            pay.setAmount(userData[17]);
            stage.showAndWait();
            System.out.println(pay.getAmountDone());
            paid(pay.getAmountDone());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void paid(Boolean flag){
        if(flag){
            balanceLbl.setText("0");
            Debtbnkbtn.setDisable(true);
            OnlineBnkbtn.setDisable(true);
            userData[17] = "0";
            csv.setUserData(userData[0], 0, "0", 17);
        }
    }

    public void setUserdata(String[] userdata){
        userData = csv.GetUserInfoByUsername(userdata[0]);
    }

    public void setNewDue(String newDue){
        this.newDue = newDue;
        balanceLbl.setText(newDue);
    } 
}
