package Java_weekly_txt_practice_tasks.JD07_CustomClass_and_Scanners;

public class Address {
    int buildingNumber = 7925;
    String street = "Jones Branch Dr";
    String city = "McLean";
    String state = "VA";
    String zipCode = "22012";

    public void addressPrint (){
        System.out.println(buildingNumber + " " + street);
        System.out.println(city + " " + state + ", " + zipCode);

    }

    @Override
    public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }


    public static void main(String[] args) {
       Address newAddress = new Address();
        newAddress.addressPrint();
    }

}
