

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main extends Application {
    public static void main(String[] args) {

        //List<Product> productList = new ArrayList<>();
        ShoppingManager shopItem = new WestminsterShoppingManager();

        while (true){
            shopItem.displayMenu();
            //System.out.println(shopItem);
        }

        //shopItem.getID(3);
        //launch();
    }


    @Override
    public void start(Stage stage) throws Exception {
        StackPane root =new StackPane();

        Scene Scene1 = new Scene(root);
        stage.setScene(Scene1);
        stage.setTitle("paca");
        stage.show();
    }
}