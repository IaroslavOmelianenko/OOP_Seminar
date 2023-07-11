package classes;

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name) {
        super(name);
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
        return daysFromOrder <= 7;
    }

    @Override
    public String getReturnStatus(int orderId) {
        return null;
    }

    @Override
    public float moneyReturn(int orderPrice) {
        return (float) (orderPrice * 0.5);
    }
}
