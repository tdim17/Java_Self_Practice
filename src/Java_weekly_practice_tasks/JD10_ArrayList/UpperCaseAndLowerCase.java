package Java_weekly_txt_practice_tasks.JD10_ArrayList;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";
        int lowerLetter =0;
        int upperLetter = 0;


        for (char letters : str.toCharArray()) {
            // System.out.println(letters);
            if (Character.isLowerCase(letters)) {
                lowerLetter ++;  // Изначально я написал lowerLetter += letters; что было большой ошибкой! Я добавлял символы к lowerLetter
            }else if (Character.isUpperCase(letters)) {
                upperLetter++;
            }
        }

        // System.out.println(lowerLetter);
        // System.out.println(upperLetter);

        System.out.println(lowerLetter == upperLetter);




    }
}

/*
2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:

2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.
Eamplex:
	 str = "JAVA java";
output:
	 true
 */
