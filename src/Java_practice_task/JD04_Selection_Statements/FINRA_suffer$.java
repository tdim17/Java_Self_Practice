package Java_practice_task.JD04_Selection_Statements;

public class FINRA_suffer$ {
    public static void main(String[] args) {

/*  Create a class called FINRA. Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.
	Example:                			Output:
		number = 15             			FINRA
*/
        int number =15;

        if (number ==  0 ) {     // Можно было решить так же и через предварительную проверку валидации: (boolean valid = number !=0;) см. пример FINRA_alternative2.java
            System.out.println("Number is not correct");
        } else if (number % 3 == 0 && number % 5 == 0 ) {       // Chat GPT подсказал мне
            System.out.println("FIN & RA");
        } else if (number % 3 == 0) {
            System.out.println("FIN");
        } else if (number % 5 == 0) {
            System.out.println("RA");
        }

/* Проблема этого задания была в том, что нужно было int превратить в boolean и не просто в boolean, а еще и с условием,
что остаток от деления должен быть = 0. ChatGPT подсказал мне решение:
int number = 15;
boolean fin = (number % 3 == 0);  <=== В этом примере fin будет true, потому что остаток от деления 15 на 3 равен нулю.
*/
    }
}
