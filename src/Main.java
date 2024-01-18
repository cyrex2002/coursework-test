

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main extends Application {
    public static void main(String[] args) {





        //List<Product> productList = new ArrayList<>();
        WestminsterShoppingManager shopItem = new WestminsterShoppingManager();

//        while (true){
//            shopItem.displayMenu();
//            System.out.println(shopItem);
//        }
       launch();
    }


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));

        Scene Scene1 = new Scene(root);
        stage.setScene(Scene1);
        stage.setTitle("Shopping center");
        stage.show();
    }
}