package Java_weekly_txt_practice_tasks.JD09_Arrays;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int i = 0; i < arr1.length; i++) {
            // another loop inside the one loop:
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
    /*
7. Create a class named CommonElements and write a program that prints out the common elements from two integer arrays.
Example:
arr1: {1,2,3,4,5}
arr2: {4,5,6,7,8}

Output:
        4
        5
*/