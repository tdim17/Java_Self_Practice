package Java_weekly_txt_practice_tasks.JD09_Arrays;

import java.util.Arrays;

public class ReverseArray {

    // REVERSE OF ARRAY

    public static void main(String[] args) {

        int [] numbers =  {1,2,3,4,5};
        int [] reversed = new int[numbers.length]; // Зная длину array мы легко можем создать новый array for reverse
        // ????? вопрос: а что будет, если не создать именно здесь этот ряд, а создать переменную в FOR-Loop?

        for (int i = numbers.length - 1, r = 0; i >= 0; i--, r++) {
            reversed[r] = numbers[i];
            System.out.println(reversed[r] + " "); // вывод элементов по одному
            System.out.println(Arrays.toString(reversed) ); // Очень интересный блок этих двух строк, который наглядно показывает процесс!!!
        }
        System.out.println("---------- reverse ------------");

        System.out.println(Arrays.toString(reversed) );
        System.out.println(reversed); // HASH-CODE!
    }
}

/*
8. Create a class named ReverseArray and write a program to reverse an array of integers and return it as a new one.
Example:
array = {1,2,3,4,5};

Output:
reversedArray = {5,4,3,2,1};
*/
