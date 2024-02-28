package Java_weekly_txt_practice_tasks.JD14_Abstruction.device;

public class Iphone extends Phone implements Downloadable, AppleApps {
    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " can't be turned On");
    }

    @Override
    void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " can't be turned Off");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " downloaded");
    }
}
