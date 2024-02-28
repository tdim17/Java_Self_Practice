package Java_weekly_txt_practice_tasks.JD16_Collections;

import java.util.*;

public class RemovePalindromes {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList(
                "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"
        ));


        List<String> noPalidromes = new ArrayList<>();

        for (String eachW : words) {
           // Giving each element of List "words" and compare first and last letter for each "words"
          // If it's not true - add this word to new List
            for (int i = 0, j = eachW.length()-1; i < eachW.length(); i++, j-- ){
                if (eachW.toLowerCase().charAt(i) != eachW.toLowerCase().charAt(j)) {    // Сделал ошибку, указал valueOf()
                    noPalidromes.add(eachW);
                }
            }
        }
        // Create new LinkedHashSet in order to get rid of duplicates
        Set<String> noDoubles = new LinkedHashSet<>(noPalidromes);
        System.out.println(noDoubles);

    }

}
/*
6. Create a class named RemovePalindromes and write a program that removes all palindrome strings from a given list of strings.
The removal should be performed without using the removeIf method.

Example:
list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
        "reviver", "racecar", "madam"}
Output:
        {"Java", "Python", "Cydeo", "Car"}
*/