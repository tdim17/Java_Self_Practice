package Java_weekly_txt_practice_tasks.JD09_Arrays;

public class Items {

    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,     150.0,     9.99,      250.0 ,    439.50,    39.99};
        int[] itemIDs =   {12345 ,     12346,     12347,    12348,     12349,      12350};

        int index = -1;

        System.out.println("5.2");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {    // НАПУТАЛ С CURLEY BRACES здесь !!!
                index = i;
                System.out.println("Index of Gloves is " + index);
                break;
            }
        }

        boolean answer = false;

        for (String goods : items) {
            if (goods.equals("iPad")) {
                answer = true;
                break;
            }
        }

        System.out.println("5.3");

        if (answer) {
            System.out.println("\"iPad\" is contained in the item list.");
        } else {
            System.err.println("\"iPad\" is not contained in the item list.");
        }

        System.out.println("5.4");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
        }
    }

}
/*
5. Create a class named Items and write a program with the following specifications:

5.1 Given arrays with the same length:
String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

5.2 Find the first index number of "Gloves".
5.3 Check if "iPad" is contained in the item list.
5.4 Print the report for each shopping item in the format:
name - price - #ID
*/