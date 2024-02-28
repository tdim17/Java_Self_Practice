package Java_weekly_txt_practice_tasks.JD12_Encapsulation;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        setQuantity(quantity);  // this.quantity = quantity;
        setPrice(price);        //this.price = price;
        this.hasPeanuts = hasPeanuts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0){
            throw new RuntimeException("The quantity of candy cannot be set to zero or a negative value.");
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <0) {
            throw new RuntimeException("The price of candy cannot be set to a negative value.");
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }



     public String toString() {
     return  getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + ((price == 0)? "Free" : price ) +
                ((hasPeanuts)? ", With Peanuts" : "" ) +
                '}';
    }
}


/*
4. Create a custom class named Candy with the following specifications:

Attributes:
brand
        quantity
price
        hasPeanuts

Ensure encapsulation for all fields.

Conditions:
The price of candy cannot be set to a negative value.
The quantity of candy cannot be set to zero or a negative value.

Add a constructor that allows the user to set all fields during object creation.

Actions:
toString(): Displays the brand, unit price, and quantity when the object is printed. If the price is zero, display "free" instead of 0.

Create another class named CandyClients, create multiple candy objects, and test each function of the candy object.
*/