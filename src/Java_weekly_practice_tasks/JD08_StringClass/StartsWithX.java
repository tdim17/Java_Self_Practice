package Java_weekly_txt_practice_tasks.JD08_StringClass;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a word");
        String word = input.next();

/*
        if (word.charAt(0) == 'x' || word.charAt(0) == 'X') {  // Этот фокус не удался. Все равно чувствительность к раскладке осталась!
            word = word.replaceFirst("x", "a");                // удалось полечить двумя блоками IF
        }
 */

        if (word.charAt(0) == 'x') {
            word = word.replaceFirst("x", "a");
        }
        if (word.charAt(0) == 'X') {
            word = word.replaceFirst("X", "A");
        }
        System.out.println("New word = " + word);
    }
}
