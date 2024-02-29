package Java_practice_task.JD17_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {

        String string = "aabcccdeeeef";

        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for (char elF : string.toCharArray()) {
            frequencyMap.put(elF, frequencyMap.getOrDefault(elF, 0)+1); // GRET FOCUS!!!
        }
       // System.out.println(frequencyMap);

        Map<Character, Integer> newMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> unic : frequencyMap.entrySet()) {
            if (unic.getValue() == 1) {
                newMap.put(unic.getKey(), unic.getValue());
            }
        }
        System.out.println(newMap);
    }

}

/*
5. Create a class named UniqueCharacters and write a program that
returns the unique characters from a given string as a map,
with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}
 */
