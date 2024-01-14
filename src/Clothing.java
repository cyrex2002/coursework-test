public class Clothing extends Product{

    double size;
    String colour;

    Clothing(String productID,String productName,double price,String colour,double size){
        super(productID,productName,price);

        this.size=size;
        this.colour=colour;
    }

    public String getColour(){
        return colour;
    }

    public  double getSize(){
        return size;
    }

    public void setColour(String colour){
        this.colour=colour;

    }

    public void setSize(double size){
        this.size=size;
    }

}

