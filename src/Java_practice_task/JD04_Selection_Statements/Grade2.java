package Java_practice_task.JD04_Selection_Statements;

public class Grade2 {
    public static void main(String[] args) {
/* Create a class called Grade2. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade

Example:     			Output:
	grade = 'B'     		Great job
 */
        char grade = 'F';

        switch (grade) {
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Great Job");
            case 'C' -> System.out.println("Good");
            case 'D' -> System.out.println("Passed");
            case 'F' -> System.out.println("Failed");

            default -> System.out.println("Invalid Grade");
        }
    }
}
