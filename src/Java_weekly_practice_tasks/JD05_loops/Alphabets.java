package Java_weekly_txt_practice_tasks.JD05_loops;

public class Alphabets {

    public static void main(String[] args) {

        char letterrow;
        char letcolumn;

        for (letterrow = 'A'; letterrow<='Z'; letterrow++) {
            for (letcolumn = 'a'; letcolumn<='z'; letcolumn++) {
                System.out.print(letterrow + ("") + letcolumn); // ОЧЕНЬ ВАЖНО значение String "" в строке! Иначе символы не преобразуются в бцквы, а складываются как значения
                System.out.print(" ");  // создает пробел в строке между блоками из 2х букв типа Aa Ab

            }
            System.out.println();  // переход на новую стоку после выполнения блока от A - Z
        }









    }

}
