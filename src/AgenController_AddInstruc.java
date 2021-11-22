import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AgenController_AddInstruc implements Initializable{
    Csvreader csv = new Csvreader("Instructor.csv");
    
    @FXML
    private TableColumn<Instructor, String> colExaminerSelc;

    @FXML
    private TableColumn<Instructor, String> colStatus;
    

    @FXML
    private TableColumn<Instructor, ComboBox> colTimeSlo;

    @FXML
    private TableColumn<Instructor, String> colnum;

    @FXML
    private TableView<Instructor> tableview;

    @FXML
    private Button Submit;

    ObservableList<Instructor> list = FXCollections.observableArrayList();

  
    @Override
    public void initialize(URL url, ResourceBundle resource){
        
            list.add(new Instructor("1","Morning",FXCollections.observableArrayList("Peter","John","Pol"), "Free"));
            list.add(new Instructor("2","Evening",FXCollections.observableArrayList("Peter","John","Pol"), "Free"));
            list.add(new Instructor("3","Afernoon",FXCollections.observableArrayList("Peter","John","Pol"), "Free"));     
            tableview.setItems(list);

        colnum.setCellValueFactory(new PropertyValueFactory<Instructor, String>("No"));
        colTimeSlo.setCellValueFactory(new PropertyValueFactory<Instructor, ComboBox>("Name"));
        colExaminerSelc.setCellValueFactory(new PropertyValueFactory<Instructor, String>("Date"));
        colStatus.setCellValueFactory(new PropertyValueFactory<Instructor, String>("Approval")); 
        
    }

}
