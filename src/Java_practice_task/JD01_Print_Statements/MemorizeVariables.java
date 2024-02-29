package Java_practice_task.JD01_Print_Statements;

public class MemorizeVariables {
    public static void main(String[] args) {

        // *************** Primitive Data Types *****************

        // Whole Numbers:

        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;  // Pau Attention to "L" !!!!!

        int justNumber = 44888577;
        int a, b, c;
        a = 10;
        b = 20;
        c = a;

        //Floating Numbers:

        float maxFloat = 3.14F; // 6-7 decimal digs - Attention to the necessary letter "F" !!!

        // double PI = 3.14159265358979; // 15 decimal digs
        final double PI = 3.14;       // Make a Constant value = Final (unchangeable below!)

        //Characters:

        char ch1 = 'A';       // assigning character literals
        char ch2 = 65;        // assigning decimal value of character
        char ch3 = 0x41;      // assigning hexadecimal value of character
        char ch4 = '\u0041';  // assigning as UTF-16 (Unicode)
        char ch5 = 45000;     // разобраться с этим моментом. Это decimal value - до 127 видимо
        char ch6 = '@';

        System.out.println("ch2 = " + ch2);


        //True or False:

        boolean isMarried = false;
        boolean isEmployed = true;

        // *************** Non Primitive Data Types *****************
        /*
        String
        Array
        Classes
        Interfaces
         */


        String firstName = "James",
                lastName = "Johnson";

        int birthYear = 1985;

        String emailPattern = firstName + "_" + birthYear;  //Pattern - the best example **


        /*
        	\t  - Tab вправо на той же строке
        	\n  - Перенос курсора на следующую строку
        	\b
         */







    }
}
