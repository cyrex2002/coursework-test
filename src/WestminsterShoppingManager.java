import java.util.Scanner;

public class WestminsterShoppingManager implements ShoppingManager{

    Scanner scanner = new Scanner(System.in);

    @Override
    public Product addNewProduct() {

        System.out.println("Enter product type");
        String productType = scanner.next();

        System.out.println("Enter product Id");
        String productId1 = scanner.next();

        System.out.println("Enter product name");
        String productname1 = scanner.next();

        System.out.println("Enter price");
        int price1 = scanner.nextInt();

        if (productType.equals("Electronic")){

        }

        Product product1= new Electronics(productId1, productname1, price1) {
        }







    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void printProducts() {

    }

    @Override
    public void saveFile() {

    }

    @Override
    public void displayMenu() {
        System.out.println("1. Add a new product\n2. Delete a product\n3. Print the list of the products\n4. Save in a file");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput){
            case 1:
                addNewProduct();
                break;
            case 2:
                deleteProduct();
                break;
            case 3:
                printProducts();
                break;
            case 4:
                saveFile();
                break;
        }
    }




}

