package Java_weekly_txt_practice_tasks.JD11_CustomClass;

public class CarpetClients {

    public static void main(String[] args) {

        Carpet unit1 = new Carpet(3, 2, 300, true);

        Carpet unit2 = new Carpet(2, 1.5, 250, false);


        System.out.println(unit1);
        System.out.println(unit1.calcCost());

        System.out.println(unit2);
        System.out.println(unit2.calcCost());






    }



}
