package Java_weekly_txt_practice_tasks.JD05_loops;

public class FactorialNumber {

    public static void main(String[] args) {

        int number = 25;
        long factorial = 1;

        for (int i = number; i>0; i--) {

            factorial *=i;
        }

        System.out.println(factorial);


    }
}
