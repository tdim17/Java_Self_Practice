package Java_weekly_txt_practice_tasks.JD08_StringClass;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word, please");
        String word1 = input.next();

        System.out.println("Enter your second word, please");
        String word2 = input.next();

        char last = word1.charAt(word1.length()-1);
        char first = word2.charAt(0);

        // System.out.println(last);
        // System.out.println(first);

        String result = "";  // МЕГА ВАЖНЫЙ МОМЕНТ!!!  Если этого не сделатьЮ то в блоке IF условий придется назначать переменную,
        // но в выводе на печать все равно проблема

        if (last == first) {
           result = word1+word2.substring(1);
        } else {
            result  = word1+word2;
        }
        System.out.println(result);

    }

}
