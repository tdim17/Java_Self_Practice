package Java_weekly_txt_practice_tasks.JD04_Selection_Statements;

public class Calcularor {
    public static void main(String[] args) {

/* Create a class called Calculator. Given two double variables named n1 and n2 and a char
variable named mathOperator, write a program that calculates the result of n1 and n2 based on
the given math operator.

		char operator -> -, +, *, /

		When the operator is +: add n1, n2
		When the operator is -: subtract n1, n2
		When the operator is *: multiply n1, n2
		When the operator is /: divide n1, n2
		If the denominator is zero, then display "Cant not divide by Zero"
		для этого нужно добавить условие в блок "/"
		For any other operators, print "invalid operator."

Example:                                    Output:
  n1 = 10, n2 = 20, mathOperator = '+'         30
*/

        int n1 = 4;
        double n2 = 2;    // операторы имеют разный data type но ответ будет конвертирован в более высокий уровень
        char mathOperator = '/';

        switch (mathOperator) {
            case '+' -> System.out.println(n1 + n2);
            case '-' -> System.out.println(n1 - n2);
            case '*' -> System.out.println(n1 * n2);
            case '/' -> System.out.println(n1 / n2);
            default -> System.out.println("Invalid operator");

            /*
            case'/':
            if(n2 == 0) {
            System.out.print("Cant not divide by Zero"
            } Else {
            System.out.print("Division: " + (n1/n2));
            break;
            }
             */


        }
    }
}

