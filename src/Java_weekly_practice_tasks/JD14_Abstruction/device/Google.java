package Java_weekly_txt_practice_tasks.JD14_Abstruction.device;

public class Google extends Phone implements Downloadable, AndroidApps {
    public Google(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
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
