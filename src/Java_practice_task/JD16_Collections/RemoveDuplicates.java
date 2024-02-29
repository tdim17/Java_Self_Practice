package Java_practice_task.JD16_Collections;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();  // TreeSet() doesn't allow Null value, but sort the list

        numbers.addAll( Arrays.asList(
                20, 15, 10, 20, 30, 10, 20, 15, 0
        ));

        System.out.println(numbers);


    }
}



/*
1. Create a class named RemoveDuplicates and write a program that takes a list of integers, removes any duplicate values, and returns the elements in sorted order.
Example:
        {20, 15, 10, 20, 30, 10, 20, 15, 0}
Output:
        {0, 10, 15, 20, 30}
*/