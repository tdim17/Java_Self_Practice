package Java_practice_task.JD07_CustomClass_and_Scanners;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = info.nextInt();

        System.out.println("Enter your gender (one word only)");
        String gender = info.next(); // until the space, но в памяти останется Enter как часть строки!

        info.nextLine();  // ВОЛШЕБНАЯ ТАБЛЕТКА!!!!!!!!!!!!!!   EnterEnter
/*
Каждый раз перед методом nextLine(); нужно вставлять доп. строку nextLine(); для очистки информации в буфере памяти
потому что nextLine(); обладает уникальным свойством читать всю "заразу", которая только имеется ))
 */

        System.out.println("Enter your full name");
        String name = info.nextLine(); // until the new line

        System.out.println("Enter your phone number");
        long phone = info.nextLong();

        System.out.println("Enter your zip code");
        int zip = info.nextInt();

        info.nextLine();

        System.out.println("Enter your School name (multiple)");
        String school = info.nextLine();

        System.out.println("Enter your City name (multiple)");
        String city = info.nextLine();

        System.out.println("Enter your State name (one word only)");
        String state = info.next();

        info.nextLine();

        System.out.println("Enter your Building number");
        int building = info.nextInt();

        info.nextLine();

        System.out.println("Enter your Street name (multiple)");
        String street = info.nextLine();

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phone);
        System.out.println("Address:" + "\n\t" + building + " " + street + "\n\t" + city + ", " + state + " " + zip);
    }
}

