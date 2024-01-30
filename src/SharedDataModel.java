import javafx.collections.FXCollections;
import javafx.collections.ObservableList;



public class SharedDataModel {
    private static final SharedDataModel instance = new SharedDataModel();
    private ObservableList<Product> selectedObjects = FXCollections.observableArrayList();

    private String username;

    private SharedDataModel() {
        // Private constructor to enforce singleton pattern
    }

    public static SharedDataModel getInstance() {
        return instance;
    }

    public ObservableList<Product> getSelectedObjects() {
        return selectedObjects;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
