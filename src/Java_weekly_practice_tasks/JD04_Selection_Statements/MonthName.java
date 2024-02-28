package Java_weekly_txt_practice_tasks.JD04_Selection_Statements;

public class MonthName {
    public static void main(String[] args) {

/* 11. Create a class named MonthName. Given an integer variable named number representing the number
of the month, write a program that displays the month's name based on the given number.

Example 1:              Output:
	 number = 10            October

Example 2:              Output:
	number = -20        	No such month
*/

        int month = 12;

        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("Febuary");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.err.println("error");
        }



    }
}
