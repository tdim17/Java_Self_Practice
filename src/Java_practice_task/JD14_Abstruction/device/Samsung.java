package Java_practice_task.JD14_Abstruction.device;

public class Samsung extends Phone implements Downloadable, AndroidApps {
    public Samsung(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    void turnOn() {

    }

    @Override
    void turnOff() {

    }

    @Override
    public void downloadApp() {

    }
}
