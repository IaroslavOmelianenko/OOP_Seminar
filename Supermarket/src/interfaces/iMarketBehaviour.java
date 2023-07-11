package interfaces;

import java.util.List;

import classes.Actor;

public interface iMarketBehaviour {

    void acceptToMarket(iActorBehaviour actor);

    void releaseFromMarket(List<Actor> actor);

    void update();
}