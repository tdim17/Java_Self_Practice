package Java_weekly_txt_practice_tasks.JD13_Inheritance.phones;

public class Iphone extends PhonesParent {

    public Iphone(String model, String size, double price, String color) {
        super("iPhone", model, size, price, color);
    }

    public void faceTime(String phoneNumber){
        System.out.println("Facetiming with the number: " + phoneNumber);
    }


}
