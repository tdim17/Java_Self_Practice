package Java_practice_task.JD10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {

    public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list.addAll(list);
        System.out.println(list);

        // The Solution was to add the current list into that own current list using Arraylist Class Method .addAll
    }
}
/*
3. Create a class called DuplicateElements and write a program with the following specifications:

3.1 Given an ArrayList, duplicate each element in the list.

Example:
                list = [1,2,3,4,5];

output:
            	[1,2,3,4,5,1,2,3,4,5];
 */