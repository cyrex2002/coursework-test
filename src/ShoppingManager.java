import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface ShoppingManager  {
    public void addNewProduct();


    void deleteProduct();

    public void printProducts();
    public void saveFile() ;
    public void displayMenu();

    public void getID(int x);

//    public boolean exit(String exitcode);


}

