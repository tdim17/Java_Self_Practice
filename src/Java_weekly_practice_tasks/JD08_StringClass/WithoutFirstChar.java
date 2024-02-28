package Java_weekly_txt_practice_tasks.JD08_StringClass;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word, please");
        String word1 = input.next();


        System.out.println("Enter your second word, please");
        String word2 = input.next();


        String sentence = word1.substring(1) + word2.substring(1);
        System.out.println("The sentence = " + sentence);








    }

}
