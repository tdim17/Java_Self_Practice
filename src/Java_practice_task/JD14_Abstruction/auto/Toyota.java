package Java_practice_task.JD14_Abstruction.auto;

public class Toyota extends Car {


    public Toyota( String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " " + getModel() + " is well driven");
    }
}
