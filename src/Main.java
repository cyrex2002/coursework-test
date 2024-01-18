

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

//        for(int p = 1; p <= 5; p++){
//            shopItem.displayMenu();
//            //System.out.println(shopItem);
//        }

        //shopItem.getID(3);
        launch();
    }


    @Override
    public void start(Stage stage) throws Exception {
        StackPane root =new StackPane();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("paca");
        stage.show();
    }
}