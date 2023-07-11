import classes.*;
import interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {

        Market magnit = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new SpecialClient("president",10);
        iActorBehaviour client3 = new PensionerClient("Sergey Nikolayevich",11);
        iActorBehaviour client4 = new TaxService();
        iActorBehaviour client5 = new PromoClient("Johny", "2 по цене 1", 12);

//        magnit.acceptToMarket(client1);
//        magnit.acceptToMarket(client2);
//        magnit.acceptToMarket(client3);
//        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);

        magnit.update();
    }
}
