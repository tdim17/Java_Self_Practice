package Java_practice_task.JD10_ArrayList;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";
        String digits = "";
        String letters = "";
        String specials = "";


        for (char each : str.toCharArray()) {

            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isLetter(each)) {
                letters += each;
            }  else   {
                specials += each;
            }
        }
        System.out.println("Digits: " + "\"" + digits + "\"" + " ");
        System.out.println("isLetter: " + "\"" + letters + "\"" + " ");
        System.out.println("isSpecial: " + "\"" + specials + "\"" + " ");




        /*  The first variant (draft)

        for (char each : str.toCharArray()) {

            if (Character.isDigit(each)) {
                digits += each;
            }
        }
        System.out.println("Digits: " + "\"" + digits + "\"" + " ");

        for (char each : str.toCharArray()) {

            if (Character.isLetter(each)) {
                letters += each;
            }
        }
        System.out.println("isLetter: " + "\"" + letters + "\"" + " ");

        for (char each : str.toCharArray()) {

            if (!Character.isLetterOrDigit(each))   {
               specials += each;
            }
        }
        System.out.println("isSpecial: " + "\"" + specials + "\"" + " ");

        */
    }
}

/*
1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:

1.1 Given a string, retrieve and display the letters, digits, and special eachs separately.
Example:

Example:
str = "Wooden Spoon123!"

output:
letters= "WoodenSpoon";
Digits = "123";
specialChars = " !";
*/
