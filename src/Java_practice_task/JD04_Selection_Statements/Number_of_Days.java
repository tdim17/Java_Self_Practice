package Java_practice_task.JD04_Selection_Statements;

public class Number_of_Days {
    public static void main(String[] args) {

/* Create a class named NumberOfDays. An integer variable named month is given.
Write a program to determine the number of days in a given month.

Example:			        Output:
	month = 5				   31 days

(Assume that February has 28 days)

If the given month number is not between 1~12, then print "Invalid."

Hints:
	Months with 31 days: 1, 3, 5, 7, 8, 10, 12
	Months with 30 days: 4, 6, 9, 11
*/

        int month = 2;

        switch  (month) {
            case 1, 3, 5, 7, 8, 10,12 -> System.out.println("31 day");
            case 4 -> System.out.println("30 day");
            case 2 -> System.out.println("28 day");
            default -> System.out.println("Invalid");





        }



    }
}
