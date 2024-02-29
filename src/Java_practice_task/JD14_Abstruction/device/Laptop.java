package Java_practice_task.JD14_Abstruction.device;

public class Laptop extends Computer {

    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    void turnOn() {

    }

    @Override
    void turnOff() {

    }
}
