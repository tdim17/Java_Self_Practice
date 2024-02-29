package Java_practice_task.JD07_CustomClass_and_Scanners;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your Score");
        int score = input.nextInt();

        input.close();

        System.out.println("score = " + score);

        if (score < 0 || score > 100){
            System.out.println("Invalid Score.");
        } else if (score > 90) {
            System.out.println("Your grade is A");
        } else if (score > 80) {
            System.out.println("Your grade is B");
        } else if (score > 70) {
            System.out.println("Your grade is C");
        } else if (score > 60) {
            System.out.println("Your grade is D");
        }else {
            System.out.println("Your grade is F");
        }



    }


}
