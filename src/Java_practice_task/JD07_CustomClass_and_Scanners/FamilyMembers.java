package Java_practice_task.JD07_CustomClass_and_Scanners;

import java.util.Scanner;

public class FamilyMembers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people You live with?");
        int people = input.nextInt();

       // input.nextLine(); Я не уверен в том, когда нужно эту строку применять. Пересмотреть учебное видео!!!

       input.close();

        if (people < 3) {
            System.out.println("Live with less than three people.");
        } else if (people < 6 ){
            System.out.println("Live with 3 - 6 people.");
        } else if (people >= 6) {  // Compiler подсказывает потому что в скобках не обязательно писать условие.
                                   // если вместо else if использовать просто else ()
            System.out.println("Live with more than six people.");
        }







    }



}
