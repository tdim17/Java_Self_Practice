package Java_weekly_txt_practice_tasks.JD14_Abstruction.auto;

public class CarClients {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Corolla", 2021, 19390, "White" );
        Mercedes mercedes = new Mercedes("E300", 2020, 39000, "Black");
        Honda honda = new Honda ("Accord", 2022, 29000, "Red");
        BMW bmw = new BMW("320", 2019, 25000, "Silver");
        Audi audi = new Audi("A6", 2023, 55000, "Green salad");
        Tesla tesla =new Tesla ("S", 2018, 35000, "Black");
        CydeoCar cydeocar = new CydeoCar("Kuzat23", 2023, 79000, "Dream Star");
        Nio nio = new Nio ("NX", 2024, 19999, "Grey");

        System.out.println(toyota);
        toyota.drive();








    }







}
