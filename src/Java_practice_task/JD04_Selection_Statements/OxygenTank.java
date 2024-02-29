package Java_practice_task.JD04_Selection_Statements;

public class OxygenTank {
    public static void main(String[] args) {
/*Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain
level (number), and you must print a message based on the level:
		Above 90 - Your tank is full
		Above 80 - Still okay
		Above 70 - Don't go too far
		Above 60 - Start to head back
		Above 50 - Be careful, you're at 50%
			Example:                            Output:
				   oxygenLevel = 75;				  Don't go too far
*/
        int level = 32;
        // String statement;  - я не уверен, что оно мне понадобится

        // Switch method can't be applied, because we need the "boolean" to be used!!!
        // That is why the IF-ELSE-IF should be used

        if (level>90) {
            System.out.println("Your tank is full");
        } else if (level>80) {
            System.out.println("Still okay");
        } else if (level>70) {
            System.out.println("Don't go too far");
        } else if (level>60) {
            System.out.println("Start to head back");
        } else if (level>50) {
            System.out.println("Be careful, you're at 50%");
        } else  if (level<=50) {
            System.out.println("You are in dangerous!");
        }






    }
}
