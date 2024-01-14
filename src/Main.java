import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ShoppingManager shopItem = new WestminsterShoppingManager();
        //shoppingManager.displayMenu();

        Product electronics = new Electronics("abc", "xperia 1", 200000, "sony", 1);
        Product clothing = new Clothing("xyz", "shorts", 500, "black", 28);

        Product x = shopItem.addNewProduct();

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(x);


        //System.out.println(x.getProductID());
        System.out.println(productList.get(0).getProductName());



    }

}