package Java_practice_task.JD11_CustomClass;

public class Carpet {

    public double width, length;
    public int unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, int unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }

    public double calcCost(){
        double totalCost;

        double totalPrice =  (width * length) * unitPrice;

        totalCost = isPersian ? totalPrice + 200 : totalPrice;

        return totalCost;
    }

}

/*
2. Create a custom class named Carpet with the following specifications:

Attributes:
width
length
unitPrice
isPersian (boolean)

Actions:
calcCost(): calculate the total cost of the carpet and return it as a double.
toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

Price calculation formula:
Total price of carpet = (width * length) * unitPrice
If the carpet is Persian, add $200 to the totalPrice

Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.
*/