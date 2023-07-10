package domen;

public class HotDrink extends Product {

    // Поля
    private int drinkTemperature;

    // Свойства
    public int getDrinkTemperature() {
        return drinkTemperature;
    }

    public void setDrinkTemperature(int drinkTemperature) {
        this.drinkTemperature = drinkTemperature;
    }

    // Конструкторы
    public HotDrink(int price, int place, String name, long id, int drinkTemperature) {
        super(price, place, name, id);
        this.drinkTemperature = drinkTemperature;
    }

    @Override
    public String toString() {
        return super.toString() + "temperature = " + drinkTemperature + "°C";
    }
}
