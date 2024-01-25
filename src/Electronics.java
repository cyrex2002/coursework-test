public class Electronics extends Product
{
    private String brand;
    private int warranty;

    Electronics(String productID,String productName,double price,String brand,int warranty,Integer quantity,Integer itemQuantityInCart){
        super(productID,productName,price,quantity,itemQuantityInCart);


        this.brand=brand;
        this.warranty=warranty;

    }


    public String getBrand(){
        return brand;
    }

    public  int getWarranty(){
        return warranty;
    }

    public void setBrand(String brand){
        this.brand=brand;

    }

    public void setWarranty(int warranty){
        this.warranty=warranty;
    }

}
