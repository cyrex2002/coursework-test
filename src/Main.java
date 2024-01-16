import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //List<Product> productList = new ArrayList<>();
        ShoppingManager shopItem = new WestminsterShoppingManager();

        for(int p = 1; p <= 5; p++){
            shopItem.displayMenu();
            //System.out.println(shopItem);
        }

        //shopItem.getID(3);












    }


}