package Java_practice_task.JD07_CustomClass_and_Scanners;

public class Item {

    String itemName; //used for storing the name of the item.
    double unitPrice; //used for storing the unit price of the item.
    int quantity; //used for storing the quantity of the item.

    public double calcCost(){
        double total = unitPrice * quantity;
        return total;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                // ", total=" + total +
                '}';




    }
}
