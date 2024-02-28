package Java_weekly_txt_practice_tasks.JD14_Abstruction.device;

public abstract class Phone extends Device {


    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    void call(long phoneNum) {
        System.out.println("Calling");
    }

    void text(long phoneNum){
        System.out.println("texting");
    }




}
