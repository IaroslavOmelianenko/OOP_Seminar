import domen.Bottle;
import domen.HotDrink;
import domen.Product;
import services.CoinDispenser;
import services.Display;
import services.Holder;
import services.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float)1.5);
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);

        //Hot drinks
        Product item4 = new HotDrink(200, 4, "Cappuccino", 4, 60);
        Product item5 = new HotDrink(100, 5, "Tea", 5, 50);
        Product item6 = new HotDrink(125, 6, "Hot Chocolate", 6, 65);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);

        Holder hold1 = new Holder(3, 3);
        CoinDispenser coinDispenser = new CoinDispenser(0);
        Display display = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDispenser, assort, display);

        for(Product prod: venMachine.getProducts())
        {
            System.out.println(prod);
        }
    }
}
