package Java_practice_task.JD14_Abstruction.device;

public class DeviceShop {

    public static void main(String[] args) {

        PersonalComputer pc = new PersonalComputer ("Lenovo", "IdeaPad", 1155, "grey", "Big", true, false);
        Decktop desktop = new Decktop("HP", "TDA", 999, "white", "small", false, true);
        Laptop laptop = new Laptop("Sony", "FX47", 1199, "Silver", "Small", true, true);
        Iphone iphone = new Iphone("Iphone", "17 Pro", 2999, "Brown", "Huge", true, false);
        Samsung samsung = new Samsung("Samsung", "Galaxy S77", 2599, "Crazy Bright", "Micro", true, false );
        Google google = new Google ("Google", "Pixel", 499, "Gold", "Not big", true, true);

        System.out.println(pc);
        System.out.println(desktop);
        System.out.println(laptop);
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(google);

        pc.turnOff();
        iphone.turnOn();
        iphone.downloadApp();


    }

}
