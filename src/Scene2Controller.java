import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.URL;
import java.util.EventObject;
import java.util.ResourceBundle;

public class  Scene2Controller implements Initializable{
    @FXML
    WestminsterShoppingManager manager;
    public Scene2Controller(){
        this.manager=new WestminsterShoppingManager();
    }




    @FXML
    private TableView<Product> shopTable;

    @FXML
    private TableColumn<Product, String> id;

    @FXML
    private TableColumn<Product, String> info;

    @FXML
    private TableColumn<Product, String> name;

    @FXML
    private TableColumn<Product, Double> price;

    @FXML
    private TableColumn<Product, String> category;

    ObservableList<Product> list = FXCollections.observableArrayList(
            new Electronics("brr","brr",22,"ww",1)
    );







    private final String[] categories = {"all","Electronics","Clothing"};
    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    String catergory;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll(categories);
        choiceBox.setOnAction(this::getCatergory);

        name.setCellValueFactory(new PropertyValueFactory<Product,String>("productName"));
        id.setCellValueFactory(new PropertyValueFactory<Product,String>("productID"));
        price.setCellValueFactory(new PropertyValueFactory<Product,Double>("price"));
        name.setCellValueFactory(new PropertyValueFactory<Product,String>("productName"));

        shopTable.setItems(list);


    }
    @FXML
    public void getCatergory(ActionEvent e){
        manager.productList1.add(new Electronics("abc","abc",1,"1",1));
        manager.productList1.add(new Electronics("abc","abc",1,"1",1));
        catergory = choiceBox.getValue();

        if(catergory.equals("Electronics")){
            for (Product x:this.manager.productList1){
                if(x instanceof Electronics){
                    System.out.println("ele");
                }
            }

        } else if (catergory.equals("Clothing")) {
            for (Product x:this.manager.productList1){
                if(x instanceof Clothing){
                    System.out.println("clo");
                }
            }

        }else {
            System.out.println("all");
        }
    }




    public void goToCart(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene3.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Shopping Cart");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
