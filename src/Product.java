import java.time.LocalDate;
import java.util.Random;

public abstract class Product {
    public Product product;
    private String productPlace;
    private String name;
    private int  srockGoda;
    private int  b;
    private String srockGodaSalt="не меняется";

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, int srockGoda) {
        this.name = name;
        this.srockGoda = srockGoda;
    }

    public String getSrockGodaSalt() {
        return srockGodaSalt;
    }

    public void setSrockGodaSalt(String srockGodaSalt) {
        this.srockGodaSalt = srockGodaSalt;
    }

    public String getProductPlace() {
        return productPlace;
    }

    public void setProductPlace(String productPlace) {
        this.productPlace = productPlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSrockGoda() {
        return srockGoda;
    }

    public void setSrockGoda(int srockGoda) {
        this.srockGoda = srockGoda;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", srockGoda=" + srockGoda +
                '}';
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean isFresh() {

        return b>=srockGoda?false:true;
    }

    public LocalDate productionDate() {
        Random random =new Random();
        b= random.nextInt(1,200);
        LocalDate producedOn=LocalDate.now().minusDays(b);
        return producedOn;
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