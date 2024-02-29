package Java_practice_task.JD09_Arrays;

public class EvenOddNumbers {

    public static void main(String[] args) {
        
        int [] numbers = {1, 3, 4, 5, 6, 7, 9 , 10 ,12, 13};

       int countEven = 0;
       int countOdd = 0;

        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];

            if (x%2==0) {
                countEven += 1;
            }  else if (x%2!=0) {
                countOdd += 1;
            }
            /* Если эти объявления вывести здесь, то они будут печатать сообщения в конце каждого цикла FOR Loop, которых 10!  (numbers.length = 10)
            System.out.println("EVEN = " + countEven);
            System.out.println("ODD = " + countOdd);
            */

       }

//        System.out.println("EVEN = " + countEven);
//        System.out.println("ODD = " + countOdd);
        System.out.println("The Array has " + countOdd + " ODD number and " + countEven + " EVEN numbers.");


        /*
        Если переменная выводится за пределы loop, то создавать ее внутри Loop НЕЛЬЗЯ!
        Поэтому строка 9 и 10!
         */

    }
}

/*
3. Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.
Example:
array = {1, 2, 3, 4, 5, 6, 7};
Output:
The array has 4 odd numbers and 3 even numbers.
*/
