package Java_practice_task.JD17_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters_crazy {

    public static void main(String[] args) {

        String string = "bbcccaaaaa";

        ArrayList<Character> keys = new ArrayList<>();  // for storing keys
        ArrayList<Integer> values = new ArrayList<>();  // for storing values

        for (char k : string.toCharArray()) {  // get each char from string="bbcccaaaaa"
           if (!keys.contains(k)) {    // if List "keys" doesn't contain this char
               keys.add(k);           // add this char to List "keys"
               values.add(1);       // technical initializing List "values" by value = 1
           } else {                 // If list "keys" contains this char
               int index = keys.indexOf(k); // getting Index of character and assigning it to a variable "index"
               int currentCount = values.get(index); // get value (element) by given index
               values.set(index, currentCount + 1); // replace the element List count by value "currentCount + 1"
           }
        }

        System.out.println(keys);
        System.out.println(values);

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }

        System.out.println(map);

    }
}

/*
4. Create a class named FrequencyOfCharacters_crazy and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
Example:
       string = "bbcccaaaaa"

Output:
      {b=2, c=3, a=5}
 */
