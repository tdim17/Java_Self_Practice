package Java_weekly_txt_practice_tasks.JD06_Methods;

public class OddAndEven {

    public static void main(String[] args) {

        boolean result = isOdd(9);
        System.out.println("The number id ODD = " + result);

        result = isEven(9);
        System.out.println("The number id EVEN = " + result);




    }


    public static boolean isOdd(int number) {

   //  int number = 9;  - вначале я сделал ввод из кастомного метода, а потом уже перенес в main method

     if (number % 2 != 0) {
     return true;
     } else {
     return false;
    }
    }

    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }





}
