package Java_weekly_txt_practice_tasks.JD04_Selection_Statements;

public class Grade {
    public static void main(String[] args) {

        /* Create a class called Grade. A char variable named grade is given.
        Write a program to print the following messages:

        'A': Excellent
        'B': Great job
        'C': Good
        'D': Passed
        'F': Failed
        Otherwise: Invalid Grade

        Example:                         Output:
        grade = 'B'                      Great job

        */

        char grade = 'A';

        switch (grade) {
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Great job");
            case 'C' -> System.out.println("Good");
            case 'D' -> System.out.println("Passed");
            case 'F' -> System.out.println("Failed");

            default -> System.out.println("Invalid Grade");
        }


    }

}
