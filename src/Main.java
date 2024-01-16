import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        ShoppingManager shopItem = new WestminsterShoppingManager(productList);
        //shopItem.displayMenu();

//        Product electronics = new Electronics("abc", "xperia 1", 200000, "sony", 1);
//        Product clothing = new Clothing("xyz", "shorts", 500, "black", 28);

//        Product newProduct = shopItem.displayMenu();


//        productList.add(electronics);
//        productList.add(clothing);
//        productList.add(newProduct);
//
//        System.out.println(productList.size());


        //System.out.println(x.getProductID());
        //System.out.println(productList.get(0).getProductName());

        while (true){shopItem.displayMenu();}




    }



}