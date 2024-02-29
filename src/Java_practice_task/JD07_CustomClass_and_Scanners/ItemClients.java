package Java_practice_task.JD07_CustomClass_and_Scanners;

public class ItemClients {

    public static void main(String[] args) {

        Item i1 = new Item();

        i1.itemName = "Bananas";
        i1.unitPrice = 12.0;
        i1.quantity = 10;

        System.out.println("i1 = " + i1);

        double price = i1.calcCost();
        System.out.println("Price: $" + price);

        System.out.println("Total " +  i1.itemName + " (from class): $" + i1.calcCost());

        Item i2 = new Item ();

        i2.itemName = "Tomatoes";
        i2.unitPrice = 5.0;
        i2.quantity = 5;

        System.out.println("Total " +  i2.itemName + " (from class): $" +i2.calcCost());









    }


}
