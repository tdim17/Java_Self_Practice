package Java_practice_task.JD02_Variables;

public class ShippingAddress {

    /*      Create a class named ShippingAddress and write a program with the following requirements:

	Declare the following variables with appropriate data types:
 			fullName
			buildingNumber
			streetName
			city
			state
			zipCode

	Use concatenation to print the full shipping address

			Example:
				fullName = "Aaron Kissinger";
				buildingNumber = 13621;
				streetName = "Legacy Circle"
				city = "Fairfax;
				state = "VA";
				zipCode = 22030;

			Output:
	      		Your Shipping address is:
                			Aaron Kissinger
                			13621 Legacy Circle
                			Fairfax, VA 22030     */

    public static void main(String[] args) {

        String fullName;
        int buildingNumber;
        String streetName;
        String city;
        String state;
        int zipCode;

        fullName = "Aaron Kissinger";
        buildingNumber = 13621;
        streetName = "Legacy Circle";
        city = "Fairfax";
        state = "VA";
        zipCode = 22030;

        System.out.println("Your Shipping address is:");
        System.out.println("\t\t\t\t" + fullName);
        System.out.println("\t\t\t\t" + buildingNumber + " " + streetName);
        System.out.println("\t\t\t\t" + city + ", " + state + " " + zipCode);
    }
}
