import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class Instructor {
    private String no;
    private String name;
    private ComboBox<String> date;
    private String approval;
    
    public Instructor(String no, String name,ObservableList list, String approval) {
        this.no = no;
        this.name = name;
        this.date = new ComboBox<String>(list);
        this.approval = approval;
    }

    public ComboBox<String> getDate() {
        return date;
    }

    public void setDate(ComboBox<String> date) {
        this.date = date;
    }
    
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getApproval() {
        return approval;
    }
    public void setApproval(String approval) {
        this.approval= approval;
    }

}
