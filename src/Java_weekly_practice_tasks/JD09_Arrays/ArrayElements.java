package Java_weekly_txt_practice_tasks.JD09_Arrays;

public class ArrayElements {

    public static void main(String[] args) {

        //1.1
        int[] numbers = new int[100];
        // int[] numbersRev = new int[100];
        
        //1.2
        for (int i = 0; i < 100; i++) {  //если использование переменной i планируется только в пределах цикла, то лучше объявить ее внутри цикла. Это делает код более понятным и легким
            numbers[i] = i + 1;
        //1.3    
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        //1.4 Reverse
        for (int i = numbers.length-1 ; i >= 0; i--) {  // !!! та же переменна i но loop уже другой!!!
            // В forr - вообще ничего не нужно менять, чтобы не сломать (I mean any boolean conditions)
            numbers[i] = i+1;
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("----------------------------");

        //1.5 Display all evenly divisible elements by 5 in a single line separated by spaces:
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
            if (numbers[i]%5==0){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
/*
1. Create a class named ArrayElements and write a program with the following specifications:
        1.1 Create an array of integers with a length of 100.
        1.2 Assign values from 1 to 100 to the indexes of the array.
        1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
*/