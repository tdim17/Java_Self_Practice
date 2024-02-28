package Java_weekly_txt_practice_tasks.JD07_CustomClass_and_Scanners;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Please, enter the number of cents");
        int number = input.nextInt();

        input.close();

        int wholeDollars = (number/100);
        int reminderCents = number - wholeDollars*100;

        // System.out.println("wholeDollars = " + wholeDollars);
        // System.out.println("reminderCents = " + reminderCents);

        System.out.println(number + " cents is equal to " + wholeDollars + " dollars and " + reminderCents + " cents");

    }
}
