package Java_practice_task.JD09_Arrays;

import java.util.Arrays;

public class MoveTheZeros {

    public static void main(String[] args) {

        int[] row = {10, 0, 5, 0, 1, 0};
        int[] sorted = Arrays.copyOf(row,row.length); // копия оригинального Array = row потому что Arrays.sort - отсортирует оригинал
        Arrays.sort(sorted);

        System.out.println(Arrays.toString(sorted)); // отсортировано по возрастанию для контроля!

        // Обязательно нужно создавать новый ряд (копия была для подстраховки). Иначе при реверсе придется перезаписывать базовую переменную sorted
        int [] reversed = new int [sorted.length]; // ТАК И НЕ НАУЧИЛСЯ СОЗДВАВАТЬ новые ARRAY (((((  ЗАЗУБРИТЬ!!!!!!!!!!!!!!!
        for (int i = sorted.length - 1, k=0; i >= 0; i--, k++) {
            reversed[k] = sorted[i];
        }
        System.out.println(Arrays.toString(reversed));

        /*  // Можно было обойтись и без копирования резервного ряда row, но полезно потренироваться тоже!!!
        Arrays.sort(row);
        System.out.println(Arrays.toString(row));
        */

    }
}

/*
9. Create a class named MoveTheZeros and write a program that can move all the zeros to the end of the array.

Example:
array = {10, 0, 5, 0, 1, 0};

Output:
{10, 5, 1, 0, 0, 0};
*/