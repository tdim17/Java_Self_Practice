package Java_practice_task.JD14_Abstruction.device;

public abstract class Device {

    private final String brand ;
    private final String model ;
    private double price;
    private String color;
    private final String size ;
    private boolean hasBattery;
    private boolean hasPowerButton;


    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if (brand.isEmpty() || brand ==null ) {
            throw new RuntimeException("must not be null or empty.");
        } if (model.isEmpty() || model ==null ) {
            throw new RuntimeException("must not be null or empty.");
        } if (size.isEmpty() || size ==null ) {
            throw new RuntimeException("must not be null or empty.");
        }

        setPrice(price) ;
        setColor(color);
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <0) {
            throw new RuntimeException("must be positive");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {  // must not be null or empty.
        if (color.isEmpty() || color == null){
            throw new RuntimeException("must not be null or empty.");
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    abstract void turnOn();
    abstract void turnOff();


    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}

/*
1. Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - final size
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions:
        - brand, model, color, and size must not be null or empty.
        - price must be positive.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()
 */