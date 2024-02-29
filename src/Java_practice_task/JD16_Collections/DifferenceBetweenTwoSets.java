package Java_practice_task.JD16_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {

        ArrayList<Integer> set1 = new ArrayList<>(Arrays.asList( 1, 2, 3, 5 ));

        ArrayList<Integer> set2 = new ArrayList<>(Arrays.asList(2, 3, 4));

        ArrayList<Integer> set3 = new ArrayList<>();
        for (Integer element : set1) {
            if (!set2.contains(element)) {
                set3.add(element);
            }
        }

        System.out.println(set3);

    }
}

/*
4. Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of integers
(elements in the first set but not in the second) and displays the result.
         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}
         Output:
            {1, 5}
 */