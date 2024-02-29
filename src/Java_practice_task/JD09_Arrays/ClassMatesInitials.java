package Java_practice_task.JD09_Arrays;

import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String [] names = new String[10];
        /* так тоже можно провести через объявление и последующую инициализацию.
        String [] names;
        names = new String[10]
         */

        String initials;


        names[0] = "John Dow";
        names[1] = "Nikki Perry";
        names[2] = "Chuck Norris";
        names[3] = "Silvester Stallone";
        names[4] = "Miki Rourke";
        names[5] = "Tom Cruz";
        names[6] = "Charlize Theron";
        names[7] = "Sharon Stone";
        names[8] = "Tanya Mose";
        names[9] = "Dick Cheney";
        // names[10] = "Julian Moore";  - это лишнее уже. Ряд всего 10 элементов!

        System.out.println(Arrays.toString(names));

        // initials =  names[0].charAt(0) + ".";  // Если не вклеить "", то будет char, а нужен String
        initials =  names[0].charAt(0) + "." + names[0].charAt( names[0].indexOf(" ") +1 ) + "."; // Attention to parentheses () !!!

        System.out.println(initials);

        /*
        Объяснение решения:
        1. Инициалы можно достать по индексу первого и второго слова.
        2. Мы знаем индекс полного имени, и индекс первого слова - певая буква не проблема = names[i].charAt(0)
        3. Вторая буква начинается после пробела. Пробел можно найти методом indexOf(" ") и прибавить +1 индекс для первой буквы след. слова: indexOf(" ") +1
        итого:  names[i].indexOf(" ") +1 - это индекс, а это character of that index: names[i].charAt( names[i].indexOf(" ") +1 )
        4. Далее строим LOOP для каждого names[i]
         */

        for (int i = 0; i < names.length; i++) {
            initials =  names[i].charAt(0) + "." + names[i].charAt( names[i].indexOf(" ") +1 ) + ".";
            System.out.println("In: " + initials);
        }


    }
}
/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.

 */