package Java_practice_task.JD05_loops;

public class SumOfNumbers {

    public static void main(String[] args) {


        int number = 3;
        int sum = 0;

        for (int i = 1; i <= number ; i++) {
            sum += i;
            System.out.println("Each step = " + sum);
        }

        System.out.println("Summ = " + sum);




    }
}
