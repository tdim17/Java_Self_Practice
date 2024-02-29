package Java_practice_task.JD10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters_lambdaTrash {

    public static void main(String[] args) {

        ArrayList <Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'));

        list.removeIf(p-> Character.isLetter(p));

        System.out.println(list);






    }
}
/*
10. Create a class called RemoveLetters_lambdaTrash and write a program with the following steps:

10.1 Given an ArrayList of characters, remove all the letters.

Example:
list = {'$', A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

output:
        ['$',  '1', '2', '@', '!', '3', '4']
*/