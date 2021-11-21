import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class AgenController_RecruitStud implements Initializable {
    //Csvreader csv = new Csvreader("studentlist.csv");     

    
    @FXML
    private TableColumn<Person, String> colList;

    @FXML
    private TableColumn<Person, String> colName;

    @FXML
    private TableColumn<Person, String> colDate;

    @FXML
    private TableColumn<Person, String> colApproval;

    @FXML
    private TableView<Person> tableview;


    ObservableList<Person> list = FXCollections.observableArrayList(

        new Person("1","Anas","12-08-2021","Register"),
        new Person("2","Nor","16-05-2021","Register"),
        new Person("3","Nur","01-06-2021","Register"),
        new Person("4","Kumar","12-07-2021","Register"),
        new Person("5","Ero","01-11-2021","Register"),
        new Person("6","Paul","18-10-2021","Register"),
        new Person("7","Harry","05-09-2021","Register"),
        new Person("8","Guru","09-10-2021","Register"),
        new Person("9","Marie","05-02-2021","Register"),
        new Person("10","Rol","12-11-2021","Register")
        

    );

    @Override
    public void initialize(URL url, ResourceBundle resource){

        colList.setCellValueFactory(new PropertyValueFactory<>("No"));
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("Approval"));
        colApproval.setCellValueFactory(new PropertyValueFactory<>("Status"));        

        tableview.setItems(list);

    }

}

