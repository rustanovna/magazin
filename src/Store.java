import java.util.Arrays;
import java.util.Random;

public class Store {


    private Product[] products;
    public Store(Milk[] milk, Fish[] fish, Stew[] stews, Corn[] corns, Salt[] salts){

    }


    public Store(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }




    @Override
    public String toString() {
        return "Store{" +
                "products=" + Arrays.toString(products) +
                '}';
    }

    public String  placeProduct(Product product){
        Random random=new Random();
        int f = random.nextInt(1,2);
        if(f==1){
            product.setProductPlace("Icebox");

        }else {
            product.setProductPlace("ShowCase");
        }
        return product.getProductPlace();

    }


}
