

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;


public class DrivingTestController implements Initializable {
    ObservableList list= FXCollections.observableArrayList();

    @FXML
    private ListView<String> TestSchedule;

    public DrivingTestController(ListView<String> TestSchedule) {
        this.TestSchedule = TestSchedule;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadData();
}
private void loadData() {


    list.removeAll(list);
    String a=" 8am-10am [B2 license]";
    String b=" 10am-12pm [D/DA license]";
    String c=" 2pm-3pm [B Full license]";
    String d=" 3pm-5pm [D/DA license]";
    
    list.addAll(a,b,c,d);
    TestSchedule.getItems().addAll(list);

    }

    public void setUserdata(String[] examData) {
    }
}