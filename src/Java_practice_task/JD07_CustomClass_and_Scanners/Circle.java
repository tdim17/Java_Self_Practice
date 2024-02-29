package Java_practice_task.JD07_CustomClass_and_Scanners;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner radius = new Scanner(System.in);

        System.out.println("Please, enter the radius of the Circle");
        double r = radius.nextDouble();

        radius.close();

        double area = r*r*3.14;  // r*=r*3.14; - это было ошибкой! Я переназначил r !!! ))))))
        System.out.println(area);

        double perimeter = (2*r)*3.14159265;
        System.out.printf("Perimeter: %.1f\n", perimeter); // В этом коде %.1f в строке форматирования printf означает, что мы хотим вывести значение с плавающей точкой (f), оставив одну цифру после запятой (.1)


    }

}
