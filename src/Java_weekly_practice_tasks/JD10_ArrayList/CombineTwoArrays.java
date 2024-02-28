package Java_weekly_txt_practice_tasks.JD10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {

     String [] arr1 =  {"A", "B", "C"};
     String [] arr2 =  {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(arr1)); // Add elements of Array to list
        list.addAll(Arrays.asList(arr2)); // Add elements of Array to list


        System.out.println(list);









    }
}

/*
4. Create a class called CombineTwoArrays and write a program with the following specifications:

4.1 Given two String arrays, combine them into one ArrayList.

Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
