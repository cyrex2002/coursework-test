import java.util.ArrayList;
import java.util.Scanner;

public class WestminsterShoppingManager implements ShoppingManager{

    Scanner scanner = new Scanner(System.in);
    Product product1;




    @Override
     public Product addNewProduct() {

        System.out.println("Enter product type");
        String productType = scanner.next();

        System.out.println("Enter product Id");
        String productId1 = scanner.next();

        System.out.println("Enter product name");
        String productName1 = scanner.next();

        System.out.println("Enter price");
        double price1 = scanner.nextInt();

        if (productType.equals("E")){

            System.out.println("Enter brand name");
            String brand1=scanner.next();

            System.out.println("Enter warranty period");
            int warranty1 = scanner.nextInt();

            this.product1 = new Electronics(productId1,productName1, price1,brand1,warranty1);

        } else if (productType.equals("C")) {
            System.out.println("Enter color name");
            String colour1=scanner.next();

            System.out.println("Enter warranty period");
            double size1 = scanner.nextDouble();
            this.product1 = new Clothing(productId1, productName1, price1,colour1,size1);
        } else{
            System.out.println("Enter correct product type");
            addNewProduct();
        }

        return product1;
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

