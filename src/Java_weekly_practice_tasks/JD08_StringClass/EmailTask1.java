package Java_weekly_txt_practice_tasks.JD08_StringClass;

public class EmailTask1 {

    public static void main(String[] args) {

        String email = "dmitry_tus@gmail.com";

        /* Логика:
        вычислить отдельные блоки part1, part1, and domain и затем уже проводить над ними эксперименты.
         */

        if (email.contains("_")){

            int index_ = email.indexOf("_");
            // System.out.println("index_ = " + index_);

            int index2 = email.indexOf("@");
            // System.out.println("index_ = " + index2);

            String part1 = email.substring(0,index_);
            // System.out.println(part1);

            String part2 = email.substring((index_+1),index2);
            // System.out.println(part2);

            String domain = email.substring(index2+1);
            // System.out.println("domain = " + domain);

            System.out.println("Original e-mail: " + email);
            System.out.println("Reverse e-mail: " + part2 +"_" + part1 + "@" + domain);

/*          // Это блок, объясняет логику действия. Данный код вошел в финальный out.print
            // Логика: Считываем первый символ строки part1 и конвертируем его в uppercase:
            String part1FirstLetterUp = part1.substring(0,1).toUpperCase();
            // После этого читаем остаток строки part1:
            String part1RestOfLetter = part1.substring(1);
            // объединяем обе эти части:
            System.out.println(part1FirstLetterUp + part1RestOfLetter);
*/
            /*
            Еще один способ - использовать метод replaceFirst. Этот метод у меня описан отдельно. Он очень хорош!!!!
            Заменяем первую букву в нижнем регистре на верхний регистр
            return input.replaceFirst("\\\\b\\\\p{javaLowerCase}", m -> m.group().toUpperCase());

             */



            String domainFinal = domain.replace(".com","");

            System.out.println("First name: " + (part1.substring(0,1).toUpperCase()) + part1.substring(1));
            System.out.println("Second name: " + (part2.substring(0,1).toUpperCase()) + (part2.substring(1)));
            System.out.println("Domain: " + domainFinal);

        }    else {
            System.out.println(email);
        }

    }
}

/*
Идея в том, чтобы
1. вычислить наличие _
2. если _ отсутствует, тогда напечатать как есть
3. если _ присутствует, тогда поменять местами тексты до _  и тексты после.

Для этого нужно воспользоваться методами
indexOf("_") - найти позицию _
substring(parameter) - return string before_ and after_

 */


/*
Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.
        Example:
              Input:
                 mike_tyson@gmail.com
              Output:
                  tyson_mike@gmail.com
 */