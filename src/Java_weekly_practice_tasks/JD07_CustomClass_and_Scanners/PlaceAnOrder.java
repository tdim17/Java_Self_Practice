package Java_weekly_txt_practice_tasks.JD07_CustomClass_and_Scanners;

import java.util.Locale;
import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // !!! Установка локали для всего приложения - узнать как это сделать на весь IntelliJ

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the product name (multiple words)");
        String product = input.nextLine();  // input.nextLine() будет ждать ввода от пользователя до тех пор,
        // пока он не введет строку и не нажмет Enter. Затем введенная строка будет сохранена в переменной product.

        System.out.println("Please, enter the price");
        double price = input.nextDouble();  // по неведомой мне причине необходимо вводить значение через "," а не через точку!!!

        input.nextLine();

/* VERY IMPORTANT PART
Если у вас возникает ошибка при вводе значения 1.5, это может быть связано с тем, что после ввода числа 1.5
в консоли остается символ новой строки, который может быть считан при следующем вызове nextDouble().
Это может привести к тому, что nextDouble() прочитает пустую строку вместо числа, что вызовет исключение.
Чтобы избежать этой проблемы, можно добавить вызов input.nextLine() после nextDouble(), чтобы считать символ новой строки после ввода числа.
*/

        System.out.println("Please, enter the quantity");
        int quantity = input.nextInt();

        System.out.println("Enter your name, please");
        String customerName = input.next();

        double total = price * quantity;

        // System.out.println(input);  // уточнить что-то не так с этим выводом ((((

        System.out.println(customerName + " your order for " + quantity + " " + product + " has been placed. Your total is " + total);

        input.close();
    }
}
