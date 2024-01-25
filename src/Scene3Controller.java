import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;

public class Scene3Controller implements Initializable {

    @FXML
    private TableColumn<Product, Double> cartPrice;

    @FXML
    private TableColumn<Product, String> cartProduct;

    @FXML
    private TableColumn<Product, Integer> cartQuantity;

    @FXML
    private TableView<Product> cartTable;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

       // ArrayList<Product> regularList = FXCollections.observableArrayList(SharedDataModel.getInstance().getSelectedObjects());
        cartProduct.setCellValueFactory(new PropertyValueFactory<Product,String>("ProductName"));
        cartPrice.setCellValueFactory(new PropertyValueFactory<Product,Double>("price"));
        cartQuantity.setCellValueFactory(new PropertyValueFactory<Product,Integer>("itemQuantityInCart"));
        cartTable.setItems(SharedDataModel.getInstance().getSelectedObjects());
    }

    @FXML void goback(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Shopping Cart");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
