import javafx.scene.control.ComboBox;

public class TableComboBox {
    String name;

    ComboBox<String> timeslot;

    public TableComboBox(String name, ComboBox<String> timeslot) {
        this.name = name;
        this.timeslot = timeslot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComboBox<String> getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(ComboBox<String> timeslot) {
        this.timeslot = timeslot;
    }
}
