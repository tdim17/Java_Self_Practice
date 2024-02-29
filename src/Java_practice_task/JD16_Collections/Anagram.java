package Java_practice_task.JD16_Collections;

import java.util.HashSet;
import java.util.Set;

public class Anagram {

    public static void main(String[] args) {

     String str1 = "abcd";
     String str2 = "ccddabaa";

     Set<Character> set1 = new HashSet<>();
     // set1.add("silent");   // Неверное решение! Был бы добавлен единый объект а не набор символов

        for (char el1 : str1.toCharArray()) {
        set1.add(el1);
     }

     Set<Character> set2 = new HashSet<>();

        for (char el2 : str2.toCharArray()) {
            set2.add(el2);
        }

        boolean ifItsTrue = set1.equals(set2);

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(ifItsTrue);


    }
}



/*
5. Create a class named Anagram and write a program that checks if two strings are anagrams of each other,
considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false
 */
