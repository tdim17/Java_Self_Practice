package Java_practice_task.JD06_Methods;

public class SalaryCalculator {

    public static void main(String[] args) {

        double income = salary(45, 40);
        System.out.println(income);

    }

    public static double salary (double rate, double hours ) {

        double income = rate * hours * 52;
        return income;

    }



}
