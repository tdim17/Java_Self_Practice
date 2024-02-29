package Java_practice_task.JD07_CustomClass_and_Scanners;

import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter the number of miles");
        double miles = input.nextDouble();

        input.close();

        double km = miles * 1.609;
        System.out.println(miles + " miles is equal to " + km + " kilometers");

    }
}
