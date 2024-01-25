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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class  Scene2Controller extends Main implements Initializable{

    @FXML
    private Label id_L;
    @FXML
    private Label category_L;
    @FXML
    private Label name_L;
    @FXML
    private Label size_L;
    @FXML
    private Label colour_L;

    Product selectedItem;
    List<Product> productList2;
    List<Product> catergirizedList = new ArrayList<>();
    ObservableList<Product> list;

    List<Product> cartList = new ArrayList<>();



    public Scene2Controller(){
        WestminsterShoppingManager shopItem2 = new WestminsterShoppingManager();
        shopItem2.load();
        productList2 = shopItem2.getList();
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



    private final String[] categories = {"All","Electronics","Clothing"};
    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    String catergory;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll(categories);
        choiceBox.setOnAction(this::getCatergory);
        choiceBox.getSelectionModel().selectFirst();

        name.setCellValueFactory(new PropertyValueFactory<Product,String>("productName"));
        id.setCellValueFactory(new PropertyValueFactory<Product,String>("productID"));
        price.setCellValueFactory(new PropertyValueFactory<Product,Double>("price"));
        //name.setCellValueFactory(new PropertyValueFactory<Product,String>("productName"));



    }
    @FXML
    public void getCatergory(ActionEvent e){
        catergirizedList.clear();


        catergory = choiceBox.getValue();
        if(catergory.equals("Electronics")){


            for (Product x: productList2){
                if(x instanceof Electronics){
                    catergirizedList.add(x);
                }
            }


        } else if (catergory.equals("Clothing")) {

            for (Product x: productList2){
                if(x instanceof Clothing){
                    catergirizedList.add(x);
                }
            }

        }else {
            catergirizedList.addAll(productList2);
        }

        list = FXCollections.observableArrayList(catergirizedList);
        shopTable.setItems(list);
    }

    @FXML
    public void displaySelectedItem(MouseEvent event){
        this.selectedItem = shopTable.getSelectionModel().getSelectedItem();
        if(selectedItem instanceof Clothing) {
            id_L.setText("Product ID: "+ selectedItem.getProductID());
            category_L.setText("Category: Clothing");
            name_L.setText("Name: "+selectedItem.getProductName());
            size_L.setText("Size: "+String.valueOf(((Clothing) selectedItem).getSize()));
            colour_L.setText("Colour: "+((Clothing) selectedItem).getColour());
        }else if(selectedItem instanceof Electronics){
            id_L.setText("Product ID: "+ selectedItem.getProductID());
            category_L.setText("Category: Electronics");
            name_L.setText("Name: "+selectedItem.getProductName());
            size_L.setText("Brand: "+((Electronics) selectedItem).getBrand());
            colour_L.setText("Warranty: "+((Electronics) selectedItem).getWarranty());
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

    @FXML
    public void AddToCart(ActionEvent event){
        cartList.add(shopTable.getSelectionModel().getSelectedItem());
        System.out.println(cartList.size());
    }


    @FXML
    private void didSelectObject() {
       // Product selectedObject = shopTable.getSelectionModel().getSelectedItem();
        //cartList.add(shopTable.getSelectionModel().getSelectedItem());
        SharedDataModel.getInstance().getSelectedObjects().add(shopTable.getSelectionModel().getSelectedItem());
        //System.out.println(cartList.size());
        for(Product x:SharedDataModel.getInstance().getSelectedObjects()){
            if (x.getProductID().equals(shopTable.getSelectionModel().getSelectedItem().getProductID())){

            }else {
                SharedDataModel.getInstance().getSelectedObjects().add(shopTable.getSelectionModel().getSelectedItem());
            }
        }
    }







}
