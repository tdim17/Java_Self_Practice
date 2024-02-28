package Java_weekly_txt_practice_tasks.JD05_loops;

public class FINRA {

    public static void main(String[] args) {

        for (int i=1; i <=20; i++) {

            if (i % 3 == 0 && i%5 !=0) {
            System.out.print("FIN ");
            }
            if (i % 5 == 0 && i%3 !=0) {
                System.out.print("RA ");
            }
            if (i % 3 == 0 && i % 5 == 0 ) {
                System.out.print("FINRA ");
            }
            else {
            System.out.print(i + " ");
            }
        }

    }
}
