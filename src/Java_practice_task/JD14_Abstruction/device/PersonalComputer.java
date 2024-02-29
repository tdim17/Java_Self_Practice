package Java_practice_task.JD14_Abstruction.device;

public class PersonalComputer extends Computer {
    public PersonalComputer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    void turnOn() {
        System.out.println(getBrand() + " " + getModel() + " is turning On");

    }

    @Override
    void turnOff() {
        System.out.println(getBrand() + " " + getModel() + " is turning Off");
    }
}
