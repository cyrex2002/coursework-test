import javafx.fxml.Initializable;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Scene3Controller implements Initializable {

    List<Product> cartlist;

    public Scene3Controller(){}

    public Scene3Controller(Scene2Controller a){
        this.cartlist =a.getCartList();
        System.out.println(cartlist.get(0).getProductName());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
