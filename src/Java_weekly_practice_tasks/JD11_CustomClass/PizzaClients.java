package Java_weekly_txt_practice_tasks.JD11_CustomClass;

public class PizzaClients {

    public static void main(String[] args) {

        Pizza set1 = new Pizza("Small", 2, 2, 3);

        Pizza set2 = new Pizza("Medium", 3, 3, 4);

        Pizza set3 = new Pizza("Large", 1, 2, 1);



        System.out.println("Pizza1 = " + set1);
        System.out.println("Pizza2 = " + set2);
        System.out.println("Pizza3 = " + set3);

        System.out.println("Total price of pizza1 = $" + set1.calcCost());
        System.out.println("Total price of pizza2 = $" + set2.calcCost());
        System.out.println("Total price of pizza3 = $" + set3.calcCost());

    }


}
