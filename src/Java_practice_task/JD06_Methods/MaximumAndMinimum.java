package Java_practice_task.JD06_Methods;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        int m = max(30, 20);
        System.out.println(m);

        double n = max(20.0, 70.0);
        System.out.println(n);

        int a = min(2, 10);
        System.out.println(a);

        double b = min(5.0, 22.0);
        System.out.println(b);


    }

    public static int max (int num1, int num2)  {
        if (num2 > num1) {
            return num2;
        } else {
            return num1;
        }
    }

    public static double max (double num1, double num2)  {
        if (num2 > num1) {
            return num2;
        } else {
            return num1;
        }
    }

    public static int min (int num1, int num2)  {
        if (num2 > num1) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double min (double num1, double num2)  {
        if (num2 > num1) {
            return num1;
        } else {
            return num2;
        }
    }








}
