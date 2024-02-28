package Java_weekly_txt_practice_tasks.JD04_Selection_Statements;

public class AgeGroups {
    public static void main(String[] args) {

/* Create a class named AgeGroups. An integer variable named age is given.
Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
        Senior  (55 or older)

If the age is negative or greater than 150, print "Invalid."

Example:            			Output:
	age = 42            			Young Middle-Aged Adult
*/

        int age = 21;
        boolean valid = (age > 0 && age <=150 );

        if (!valid) {
            System.out.println("Invalid");
        } else if (age <= 20) {
            System.out.println("Teenager");
        } else if (age <=55 ) {
            System.out.println("Adult" );
        } else if (age <=150 ) {
            System.out.println("Senior");
        }

    }
}
