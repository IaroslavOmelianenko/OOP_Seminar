package classes;

public class PromoClient extends Actor{

    private String promoTitle;
    private int promoClientID;
    private static int promoClientsQuantity;

    public PromoClient(String name, String promoTitle, int promoClientID) {
        super(name+" (промо-клиент)");
        this.promoTitle = promoTitle;
        this.promoClientID = promoClientID;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    @Override
    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    // iReturnOrder methods

    @Override
    public boolean checkReturnAvailability(int daysFromOrder) {
        return daysFromOrder <= 3;
    }

    @Override
    public String getReturnStatus(int orderId) {
        return null;
    }

    @Override
    public float moneyReturn(int orderPrice) {
        return (float) (orderPrice * 0.25);
    }
}
