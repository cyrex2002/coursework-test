import java.io.Serializable;

public abstract class  Product implements Serializable {

    private String productID;
    private String productName;
    private Integer quantity;
    private double price ;

    private Integer itemQuantityInCart;



    Product(String productID,String productName,double price,Integer quantity,Integer ItemQuantityInCart){
        this.productID = productID;
        this.productName = productName;
        this.price = price ;
        this.quantity = quantity;
        this.itemQuantityInCart = ItemQuantityInCart;
    }

    public String getProductID(){
        return productID;
    }
    public String getProductName(){
        return productName;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }

    public Integer getItemQuantityInCart(){
        return itemQuantityInCart;
    }

    public void setProductID(String productID){
        this.productID=productID;

    }
    public void setProductName(String productName){
        this.productName=productName;

    }
    public void setQuantity(Integer quantity){
        this.quantity =quantity;


    }public void setPrice(double price){
        this.price=price;
    }

    public void setItemQuantityInCart(Integer itemQuantityInCart){
        this.itemQuantityInCart=itemQuantityInCart;}



}

