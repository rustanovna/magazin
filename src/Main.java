import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Milk milk1=new Milk("milk",60 );
        Milk milk2=new Milk("milk", 90 );
        Milk milk3=new Milk("milk", 80 );
        Milk milk4=new Milk("milk", 70 );
        Milk milk5=new Milk("milk", 60 );
        Milk[]milk={milk1,milk2,milk3,milk4,milk5};

        Fish fish1=new Fish("farel",3);
        Fish fish2=new Fish("seletka",3);
        Fish fish3=new Fish("farel",2);
        Fish fish4=new Fish("farel",4);
        Fish fish5=new Fish("kilka",5);
          Fish[]fish={fish1,fish2,fish3,fish4,fish5};

        Stew stew1=new Stew("stew",180);
        Stew stew2=new Stew("stew",180);
        Stew stew3=new Stew("stew",180);
        Stew stew4=new Stew("stew",180);
        Stew stew5=new Stew("stew",180);
        Stew[]stews={stew1,stew2,stew3,stew4,stew5};

        Corn corn1=new Corn("кукуруза",150);
        Corn corn2=new Corn("кукуруза",150);
        Corn corn3=new Corn("кукуруза",150);
        Corn corn4=new Corn("кукуруза",150);
        Corn corn5=new Corn("кукуруза",150);
        Corn[]corns={corn1,corn2,corn3,corn4,corn5};

Salt salt1=new Salt("соль");
Salt salt2=new Salt("соль");
Salt salt3=new Salt("соль");
Salt salt4=new Salt("соль");
Salt salt5=new Salt("соль");
Salt[]salts={salt1,salt2,salt3,salt4,salt5};

  Store store=new Store(milk,fish,stews,corns,salts);

  Product[] products = {milk1,milk2,milk3,milk4,milk5,fish1,fish2,fish3,fish4,fish5,stew1,stew2,stew3,stew4,stew5,corn1,corn2,corn3,corn4,corn5,salt1,salt2,salt3,salt4,salt5};

        System.out.println("|-----Product-----|----Produced on-----|------Storage place------|---s.life days-----|----fresh---|");
        System.out.println("|-----------------+--------------------+-------------------------+--------------------+------------|");

        for (int i = 0; i < products.length ; i++) {
            if(products[i].getClass()==Salt.class){
                System.out.printf("     %s        |       %s     " +
                                "  |       %s        |        %s       |       %s     | \n",
                        products[i].getName(), products[i].productionDate(),products[i].placeProduct(products[i]),products[i].getSrockGodaSalt(), products[i].isFresh());
            }else{
        System.out.printf("     %s        |       %s     " +
                        "  |       %s        |        %d       |       %s     | \n",
                products[i].getName(), products[i].productionDate(),products[i].placeProduct(products[i]),products[i].getSrockGoda(), products[i].isFresh());
        }

            }







    }
}