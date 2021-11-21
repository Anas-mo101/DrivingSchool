import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Pay{
    Boolean amountDone = false;
    String Amount;

    @FXML
    private TextField cardnum;

    @FXML
    private TextField cvv;

    @FXML
    private TextField exdate;

    @FXML
    private Label amountlbl;
    
    @FXML
    private Label statuslbl;

    @FXML 
    private Button Paybtn;

    @FXML
    void paybtn(ActionEvent event) throws IOException{
        
        if(cardnum.getText().trim().equals("") || cvv.getText().trim().equals("") || exdate.getText().trim().equals(""))
        {
            statuslbl.setText("Fill Required Fields");
        }else{
            if( isNumeric(cardnum.getText()) && isNumeric(cvv.getText()) )
            {
                amountDone = true;
                Stage stage = (Stage) Paybtn.getScene().getWindow();
                stage.close();
            }else{
                statuslbl.setText("Invalid Input");
            }
        }

    }

    public Boolean getAmountDone(){
        return amountDone;
    }

    public void setAmount(String Amount){
        amountlbl.setText(Amount);
        this.Amount = Amount;
    }

    public static boolean isNumeric(String string) {
        try {
            int intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
