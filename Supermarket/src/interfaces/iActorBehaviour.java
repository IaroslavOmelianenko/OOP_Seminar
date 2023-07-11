package interfaces;

import classes.Actor;

public interface iActorBehaviour {

    boolean isTakeOrder();

    boolean isMakeOrder();

    void setTakeOrder(boolean takeOrder);

    void setMakeOrder(boolean makeOrder);

    Actor getActor();
}
