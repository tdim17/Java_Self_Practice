package Java_weekly_txt_practice_tasks.JD10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveTheZeros {

    public static void main(String[] args) {

        Integer [] digits = {1,0,2,0,3,0,4,0};

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(digits)); // or numbers.addAll(Arrays.asList(1,0,2,0,3,0,4,0))

        // ArrayList<Integer> numbers2 = new ArrayList<>( Arrays.asList(1,0,2,0,3,0,4,0) );  // The alternative option to create the ArrayList

        System.out.println(numbers);

        Collections.sort(numbers);
        Collections.reverse(numbers);

        System.out.println(numbers);

        // Это неправильное решение задачи, потому что в данном решении мы развернули последовательность
        // вместо [1, 2, 3, 4] сделали [4, 3, 2, 1] а так бы да, было бы красиво.
        // Единственным правильным решением является альтернативное: удалить нули, а потом их добавить в хвост!


    }
}

/*
5. Create a class called MoveTheZeros and write a program with the following specifications:

5.1 Given an ArrayList, move all zeros to the last indexes of the ArrayList.

Example:
	                list: {1,0,2,0,3,0,4,0}

output:
	                [1, 2, 3, 4, 0, 0, 0, 0]
 */