package DIP;

/***
 * PetrolEngine class replaced with Engine interface
 * now we can create Cars with different types of engine
 */
public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}
