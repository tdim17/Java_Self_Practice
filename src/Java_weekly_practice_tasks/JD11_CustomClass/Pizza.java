package Java_weekly_txt_practice_tasks.JD11_CustomClass;

public class Pizza {

    public String size;

    public int quantity;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public  Pizza(String size, int quantity, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.quantity = quantity;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", quantity=" + quantity +
                ", size='" + size + '\'' +
                '}';
    }

    public double calcCost(){
        double totalCost = 0;
        // Pay attention! equalsIgnoreCase is necessary!!
        double unitPrice = (size.equalsIgnoreCase("Small"))?10 : (size.equalsIgnoreCase("Medium"))?12 : 14;

        double toppings = (numberOfCheeseTopping * 2) + (numberOfPepperoniTopping * 2);

        totalCost = (unitPrice + toppings) * quantity;

        return totalCost;

    }

}

/*
1. Create a custom class named Pizza with the following specifications:

Attributes:
size
numberOfCheeseTopping
numberOfPepperoniTopping

Actions:
calcCost(): returns the totalCost of the pizza
toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping

Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.
*/
