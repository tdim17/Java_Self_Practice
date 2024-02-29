package Java_practice_task.JD14_Abstruction.auto;

public abstract class Car {
    private final String make; // must not be null or empty.
    private final String model;  // must not be null or empty.
    private final int year;  // year must not be less than 1886
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make.isEmpty() || make == null) {
            throw new RuntimeException( "Make must not be null or empty.");
        }
        if (model.isEmpty() || model == null) {
            throw new RuntimeException( "Model must not be null or empty.");
        }
        if (year < 1886) {
            throw new RuntimeException( "Year must not be less than 1886.");
        }
        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("price must not be negative.");
        }   this.price = price;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color == null) {
            throw new RuntimeException("Color must not be null or empty.");
        }   this.color = color;
    }

    public int getYear() {
        return year;
    }

    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println("This vehicle can stop!");
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + " Car {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }


    public String getModel() {
        return model;
    }
}

/*
1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()
 */
