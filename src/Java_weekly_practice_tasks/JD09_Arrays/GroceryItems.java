package Java_weekly_txt_practice_tasks.JD09_Arrays;

public class GroceryItems {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        System.out.println(" 10.2 ------------------");

        /*
        for (String[] category : items) {
            // System.out.println(Arrays.toString(category));
            System.out.println();
            for (String goods : category) {
                System.out.print(goods + "\t");
            }
        }
        */

        // Более интересное и наглядное решение:

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();System.out.println();

        System.out.println(" 10.3 -------- REVERSED inside single arrays:");

        for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();System.out.println();


        System.out.println(" 10.4 ---------REVERSED single arrays:");

        // System.out.println(Arrays.toString(items[2])); // вызов отдельной строки (row) of array

        // Шикарное решение которое мне и близко в голову не пришло!
        // получить в обратном порядке ряды (i) а потом проиндексировать их определить на выводе = items[i][j]

        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }

        // ВАЖНО:
        /*
        items.length - предоставляет количество строк (или подмассивов) в двумерном массиве.
        items[i].length - предоставляет количество элементов в i-той строке (или подмассиве) двумерного массива.

         */





        
        


    }
}

/*
10. Create a class named GroceryItems and write a program with the following specifications:

10.1 Given the following array:
String[][] items = {
        {"Apple", "Banana", "Grape", "Avocado"},
        {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
        {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
};

    10.2 Print the following output: (add \t between two words)
Apple    Banana   Grape    Avocado
Paper Towels     Toilet Papers   Tissues    Diapers
Coke   Fanta   Arizona Tea   Pepsi   Water

    10.3 Print the following output: (add \t between two words)
Avocado   Grape    Banana    Apple
Diapers   Tissues   Toilet Papers   Paper Towels
Water    Pepsi    Arizona Tea    Fanta   Coke

    10.4 Print the following output: (add \t between two words)
Coke   Fanta   Arizona Tea   Pepsi   Water
Paper Towels     Toilet Papers   Tissues    Diapers
Apple    Banana   Grape    Avocado
*/