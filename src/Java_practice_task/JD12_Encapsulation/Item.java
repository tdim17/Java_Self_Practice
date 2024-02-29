package Java_practice_task.JD12_Encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);            // this.name = name;
        setUnitPrice(unitPrice); // this.unitPrice = unitPrice;
        setQuantity(quantity);  // this.quantity = quantity;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty() || name.isBlank()){
            throw new RuntimeException("Name cannot be empty or blank");
        } else if (!name.matches("^[a-zA-Z ]+$")){
            throw new RuntimeException("Name cannot contain any special characters other than space.");
        } else if (!Character.isLetter(name.charAt(0))) {
            throw new RuntimeException("Name must start with letters.");
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            throw new RuntimeException("The unitPrice cannot be negative.");
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new RuntimeException("The quantity cannot be negative.");
        }
        this.quantity = quantity;
    }

    public double calcCost() {
       return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", UnitPrice=" + unitPrice +
                ", Quantity =" + quantity +
                ", Total Cost =" + calcCost() +
                '}';
    }
}

/*
3. Create a custom class named Item with the following specifications:

Attributes:
name
unitPrice
quantity

Ensure encapsulation for all fields.
Conditions:
The name cannot be empty or blank.
The name cannot contain any special characters other than space.
The name must start with letters.
The unitPrice cannot be negative.
The quantity cannot be negative.

Add a constructor that enables the user to set all fields during object creation.

Actions:
calcCost(): Returns the total cost.
toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

Create another class named ItemClients, create multiple item objects, and test each function of the item object.
*/