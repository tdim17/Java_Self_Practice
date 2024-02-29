package Java_practice_task.JD10_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements_lambdaTrash {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<> (Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        ArrayList<Integer> unique = new ArrayList<>(list);

        unique.removeIf(p->Collections.frequency(unique,p)>1);
        System.out.println(unique);

        /* Нам необходимо получить доступ к каждому элементу листа не используя Loop.
        LAMBDA EXPRESSION can help in that case!!!
        На сколько я понял, p - это каждый элемент коллекции, которой можно получить без всякого Loop!!!  ПРОВЕРИТЬ эту догадку!!!!!!!
        Мы получаем значение p, сравниваем его с list и если уникальность больше чем 1, тогда удаляем его из листа unique
        removeIf - is used to remove all the elements from the list that satisfies the given predicate.
        frequency(list, element): Returns the frequency of occurrence of a value in the collection.

         */

    }
}
/*
9. Create a class called UniqueElements_lambdaTrash and write a program with the following specifications:
        9.1 Given an ArrayList, display the unique elements without using any loops.

Example:
list = [1, 1, 2, 3, 3, 4, 5, 5]

output:
        [2, 4]
*/