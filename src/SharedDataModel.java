import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class SharedDataModel {
    private static final SharedDataModel instance = new SharedDataModel();
    private ObservableList<Product> selectedObjects = FXCollections.observableArrayList();

    private SharedDataModel() {
        // Private constructor to enforce singleton pattern
    }

    public static SharedDataModel getInstance() {
        return instance;
    }

    public ObservableList<Product> getSelectedObjects() {
        return selectedObjects;
    }
}
