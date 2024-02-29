package Java_practice_task.JD07_CustomClass_and_Scanners;

public class AddressClients {

    public static void main(String[] args) {

        Address add1 = new Address();

        add1.buildingNumber = 1885;
        add1.street = "Bay Parkway";
        add1.city = "Brooklyn";
        add1.state = "NY";
        add1.zipCode = "11214";

        add1.addressPrint ();

        Address add2 = new Address();

        add2.buildingNumber = 2025;
        add2.street = "Mantrous";
        add2.city = "Chicago";
        add2.state = "Il";
        add2.zipCode = "55248";

        add2.addressPrint ();




    }
}
