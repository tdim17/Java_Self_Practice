package Java_weekly_txt_practice_tasks.JD17_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MultiplyOdds {

    public static void main(String[] args) {

        Map<Character, Integer> pairs = new LinkedHashMap<>();

        pairs.put('a',1);
        pairs.put('b',2);
        pairs.put('c',3);
        pairs.put('d',4);
        pairs.put('e',5);

       System.out.println("Origin: " + pairs);

        for (Map.Entry<Character, Integer> eachEntry : pairs.entrySet()) {
            if ((eachEntry.getValue()) %2 !=0){
                int x = eachEntry.getValue()*2;
                eachEntry.setValue(x);
            }
        }
        System.out.println("Modified: " + pairs);

    }
}

/*
1. Create a class named MultiplyOdds and write a program that takes a map with characters as keys and integers as values.
The program will iterate through the map and, for each entry where the value is an odd number, it will multiply this value by two.

         Example:
               map = {'a'=1, 'b'=2, 'c'=3, 'd'=4, 'e'=5}

         Output:
            {'a'=2, 'b'=2, 'c'=6, 'd'=4, 'e'=10}
 */
