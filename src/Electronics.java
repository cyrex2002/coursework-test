public class Electronics extends Product
{
    private String brand;
    private int warranty;

    Electronics(String productID,String productName,int availableItems,double price,String brand,int warranty){
        super(productID,productName,availableItems,price);


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
