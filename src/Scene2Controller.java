import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class  Scene2Controller extends Main implements Initializable{

    List<Product> productList2;
    List<Product> catergirizedList = new ArrayList<>();
    ObservableList<Product> list;


    public Scene2Controller(){
        WestminsterShoppingManager shopItem2 = new WestminsterShoppingManager();
        shopItem2.load();
        productList2 = shopItem2.getList();

        list = FXCollections.observableArrayList(catergirizedList);

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
       // name.setCellValueFactory(new PropertyValueFactory<Product,String>("productName"));

    }
    @FXML
    public void getCatergory(ActionEvent e){
        catergirizedList.clear();
        //System.out.println(list2.size());

        catergory = choiceBox.getValue();
        if(catergory.equals("Electronics")){


            for (Product x: productList2){
                if(x instanceof Electronics){
                    catergirizedList.add(x);
                    list = FXCollections.observableArrayList(catergirizedList);
                }
            }
            //System.out.println(list3.size());
            //System.out.println(list.size());

        } else if (catergory.equals("Clothing")) {

            for (Product x: productList2){
                if(x instanceof Clothing){
                    catergirizedList.add(x);
                    list = FXCollections.observableArrayList(catergirizedList);

                }
            }

        }else {
            catergirizedList.addAll(productList2);
            list = FXCollections.observableArrayList(catergirizedList);
            //System.out.println("all");
        }
        shopTable.setItems(list);
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
