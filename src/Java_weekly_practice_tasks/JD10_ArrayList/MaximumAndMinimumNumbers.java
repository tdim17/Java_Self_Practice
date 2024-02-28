package Java_weekly_txt_practice_tasks.JD10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumAndMinimumNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,7,4,5));

        int min = list.get(0);
        int max = list.get(0);

        for (Integer i : list) {

            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}

/*
7. Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1
 */
