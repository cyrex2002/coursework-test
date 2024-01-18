import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class  Scene2Controller implements Initializable{
    @FXML
    WestminsterShoppingManager manager;

    public Scene2Controller(){
        this.manager=new WestminsterShoppingManager();
    }

    private final String[] categories = {"all","Electronics","Clothing"};

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    String catergory;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll(categories);
        choiceBox.setOnAction(this::getCatergory);
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


}
