package Java_practice_task.JD13_Inheritance.phones;

public class PhoneClients {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("iPhone15 Pro Max", "7.7", 1_250,"Green");
        Samsung samsung1 = new Samsung ("Galaxy 29 QH", "6.99", 999, "Silver");
        Nokia nokia1 = new Nokia("6610", "3.5", 199, "Black");
        Iphone iphone2 = new Iphone("iPhone17 Crazy world", "6.7", 799, "Blue Night");


        System.out.println("Iphone:");
        System.out.println(iphone1);
        iphone2.faceTime("+19175875452");
        iphone1.text("+19175875452");
        iphone1.call("+19175875452");

        System.out.println("Samsung:");
        System.out.println(samsung1);
        samsung1.text("+19175875452");
        samsung1.call("+19175875452");

        System.out.println("Nokia:");
        System.out.println(nokia1);
        nokia1.text("+19175875452");
        nokia1.call("+19175875452");





    }


}
