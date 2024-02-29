package Java_practice_task.JD13_Inheritance.phones;

public class PhonesParent {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;


    public PhonesParent(String brand, String model, String size, double price, String color) {

        setBrand(brand); // this.brand = brand;
        setModel(model); // this.model = model;
        this.size = size;
        setPrice(price); // this.price = price;
        setColor(color); // this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.trim().isEmpty() || brand.isBlank() || brand == null) {
           throw new RuntimeException("Brand must not be null, empty, or blank.");
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.trim().isEmpty() || model.isBlank() || model == null) {
            throw new RuntimeException("The Model must not be null, empty, or blank.");
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <=0) {
            throw new RuntimeException("The Price must be greater than zero.");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.trim().isEmpty() || color.isBlank() || color == null) {
            throw new RuntimeException("The Color must not be null, empty, or blank.");
        }
        this.color = color;
    }

    public void call(String phoneNumber){
        System.out.println("calling the number: " + phoneNumber);
    }

    public void text(String phoneNumber){
        System.out.println("texting to the number: " + phoneNumber);
    }



    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
1. Create a custom class named 'PhonesParent' with these specifications:
Attributes:
        - brand: String
       - model: String
       - size: String
       - price: double
       - color: String

Encapsulation:
        - All fields must be private with getters and setters.
Conditions for Encapsulation:
        - The 'brand', 'model', and 'color' must not be null, empty, or blank.
        - The 'price' must be greater than zero.

        Constructor:
        - Add a constructor to initialize all fields.

        Actions:
        - call(phoneNumber): Display "calling the number [phoneNumber]".
        - text(phoneNumber): Display "texting to the number [phoneNumber]".
        - faceTime(phoneNumber): Display "facetiming with the number [phoneNumber]".
        - toString(): Prints the information of the PhonesParent object.
*/