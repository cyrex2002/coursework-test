import java.util.List;

public class Shoppingcart {
    private List<Product> productList;

    public Shoppingcart(List<Product> productList) {
        this.productList = productList;
    }

    public void add(Product product){
        productList.add(product);
    }

    public void remove(Product product){
        productList.remove(product);
    }

    public double cost(List<Product> productList){
        double cost=0;

        for(Product product: productList){
            cost+=product.getPrice();

        }
        return cost;
    }
}

