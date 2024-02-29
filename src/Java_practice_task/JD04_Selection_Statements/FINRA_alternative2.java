package Java_practice_task.JD04_Selection_Statements;

public class FINRA_alternative2 {
    public static void main(String[] args) {

/*  Create a class called FINRA. Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.
	Example:                			Output:
		number = 15             			FINRA
*/

        // Это Альтернативный вариант через создание переменной valid и предварительную проверку валидации:

        int number =15;

        boolean valid = number != 0;

        if (!valid) {
            System.out.println("Number is not correct");
        } else if (number % 3 == 0 && number % 5 == 0 ) {
            System.out.println("FIN & RA");
        } else if (number % 3 == 0) {
            System.out.println("FIN");
        } else if (number % 5 == 0) {
            System.out.println("RA");
        }

    }
}
