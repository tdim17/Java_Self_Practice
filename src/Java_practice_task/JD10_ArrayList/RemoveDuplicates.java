package Java_practice_task.JD10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));
        System.out.println(numbers);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println( numbers.get(i));
            if (!result.contains(numbers.get(i))) {   // допустил ошибку в этом месте. Поставил зачем-то символ ";"
                result.add(numbers.get(i));
            }
        }
        System.out.println(result);

        // Потренироваться и сделать все тоже самое через For Each Loop !!!!!!!! Код будет значительно компактней


    }
}
/*
8. Create a class called RemoveDuplicates and write a program with the following specifications:

8.1 Given an ArrayList of integers, remove duplicated numbers.

Example:
list = [1,1,2,2,3,3,4,4,5,6,7]

Output:
        [1,2,3,4,5,6,7]
*/