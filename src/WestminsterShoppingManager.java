import java.io.*;
import java.util.*;


public class WestminsterShoppingManager implements ShoppingManager{


    public WestminsterShoppingManager(){

    }


    Scanner scanner = new Scanner(System.in);
    //Product product1;


    public List<Product> productList1= new ArrayList<>();


    String exitcode1 = "!exit";



    @Override
    public  void displayMenu() {

        System.out.println("1. Add a new product\n2. Delete a product\n3. Print the list of the products\n4. Save in a file\n5. Exit");

        Scanner scanner = new Scanner(System.in);
        try {
            int userInput = scanner.nextInt();
            switch (userInput) {
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
                case 5:
                    this.exitcode1 = "exit";
                    break;
                default:
                    System.out.println("Enter correct input");


            }

        }catch (Exception e){
            System.out.println("Enter valid input");
        }


    }

    @Override
    public void addNewProduct() {

        System.out.println("Enter product type");
        String productType = scanner.next();


        Integer itemQuantityInCart = 0;
        //int quantityC = 0;
        if (productType.equals("e")) {

            System.out.println("Enter product Id");
            String productId1 = scanner.next();

            int quantityE ;

            for (Product x : productList1) {
                if (x.getProductID().equals(productId1) && x.getClass().equals(Electronics.class)) {
                    quantityE = x.getQuantity() + 1;
                    x.setQuantity(quantityE);
                    return;
                } else {
                    break;
                }

            }

            quantityE = 1;

            System.out.println("Enter product name");
            String productName1 = scanner.next();

            System.out.println("Enter price");
            double price1 = scanner.nextInt();

            System.out.println("Enter brand name");
            String brand1 = scanner.next();

            System.out.println("Enter warranty period");
            int warranty1 = scanner.nextInt();

            productList1.add(new Electronics(productId1, productName1, price1, brand1, warranty1, quantityE, itemQuantityInCart));


        } else if (productType.equals("c")) {
            System.out.println("Enter product Id");
            String productId1 = scanner.next();

            int quantityC ;

            for (Product x : productList1) {
                if (x.getProductID().equals(productId1) && x.getClass().equals(Clothing.class)) {
                    quantityC = x.getQuantity() + 1;
                    x.setQuantity(quantityC);
                    return;
                } else {
                    break;
                }
            }

            quantityC = 1;
            System.out.println("Enter product name");
            String productName1 = scanner.next();

            System.out.println("Enter price");
            double price1 = scanner.nextInt();

            System.out.println("Enter color name");
            String colour1 = scanner.next();

            System.out.println("Enter size period");
            double size1 = scanner.nextDouble();
            productList1.add(new Clothing(productId1, productName1, price1, colour1, size1, quantityC, itemQuantityInCart));

        } else {
            System.out.println("Enter correct product type");
            addNewProduct();
        }


    }


    @Override
    public void deleteProduct() {
        if(!productList1.isEmpty()) {
            System.out.println("Enter product ID of item you need to remove");
            String productIDToRemove = scanner.next();

            int flag=0;

            for (Product x : productList1) {
                if (x.getProductID().equals(productIDToRemove)) {
                    productList1.remove(x);
                    System.out.println("Item removed");
                    flag = 1;
                    break;
                }
            }
            if (flag==0){
                System.out.println("Enter a valid ID");
                deleteProduct();
            }

        }else{
            System.out.println("No products to delete");
        }

        //System.out.println(productList.size());
    }

    @Override
    public void printProducts() {
        productList1.sort(Comparator.comparing(Product::getProductID));

        for(Product x:productList1){
            if (x instanceof Electronics){
                System.out.println("Product type:Electronics "+"Product ID:"+x.getProductID()+"  Product name:"+x.getProductName()+"  Product price:"+x.getPrice()+"   Product brand:"+((Electronics) x).getBrand()+" Warranty period:"+((Electronics) x).getWarranty()+" Quantity:"+x.getQuantity());
            }else{
                System.out.println("Product type:Clothing    "+"Product ID:"+x.getProductID()+"  Product name:"+x.getProductName()+"  Product price:"+x.getPrice()+"  Product colour:"+((Clothing) x).getColour()+" Size:"+((Clothing) x).getSize()+" Quantity:"+x.getQuantity());
            }
        }
        System.out.println();
    }

    @Override
    public void saveFile()  {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("File.dat"));
            output.writeObject(productList1);
            output.close();

        }
        catch (IOException ioe){
            System.out.println("Error saving file");
        }


    }

    @Override

    public void getID(int x){
        System.out.println(productList1.get(x).getProductID());
    }

    public List<Product> getList(){
        return productList1;
    }

    public void load(){
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("File.dat"));
            productList1 = (List<Product>)input.readObject();
        }catch (IOException ioe) {
            System.err.println("Error opening file");
        }catch (ClassNotFoundException cmfe){
            System.err.println("Object is not a List");
        }
    }
}







