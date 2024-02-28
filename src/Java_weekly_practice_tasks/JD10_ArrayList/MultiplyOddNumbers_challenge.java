package Java_weekly_txt_practice_tasks.JD10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumbers_challenge {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        // Tricky Task ...

        /*
        int newNumber = 1;

        for (Integer number : list) {
            if (number%2!=0) {
                newNumber = number * 2;
                list.set(number, newNumber);
            }
        }   */

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 !=0) {
                list.set(i, list.get(i)*2);
            }
        }
        System.out.println("List: " + list);

        /*list.get(i) = we receive the value of index (i)
        list.set(i, object) = we are replace the element under (i) index by value *2 (value was received above)
         */

    }
}

/*
6. Create a class called MultiplyOddNumbers_challenge and write a program with the following specifications:

6.1 Given an ArrayList, multiply each odd number by 2.

				Example:
					list = [1,2,3,4,5];

				output:
					[2,2,6,4,10]
 */


