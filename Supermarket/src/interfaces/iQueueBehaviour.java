package interfaces;

public interface iQueueBehaviour {

    void takeInQueue(iActorBehaviour actor);

    void releaseFromQueue();

    void takeOrder();

    void giveOrder();
}