package Java_practice_task.JD06_Methods;

public class DayAndMonth {

    public static void main(String[] args) {

        day(3);
        monthName(1);
        daysInMonth(5);
    }


    public static void day (int number) {

        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wendesday");
            case 4 -> System.out.println("Thuersday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sanday");
            default -> System.out.println("Invalid Number");
        }
    }

    public static void monthName (int number) {

        switch (number) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid Number");
        }
    }


    public static void daysInMonth (int numOfmonth) {

        switch (numOfmonth) {
            case 1 -> System.out.println("January has 31 days");
            case 2 -> System.out.println("February has 28 days");
            case 3 -> System.out.println("March has 31 days");
            case 4 -> System.out.println("April has 30 days");
            case 5 -> System.out.println("May has 31 days");
            case 6 -> System.out.println("June has 30 days");
            case 7 -> System.out.println("July has 31 days");
            case 8 -> System.out.println("August has 31 days");
            case 9 -> System.out.println("September has 30 days");
            case 10 -> System.out.println("October has 31 days");
            case 11 -> System.out.println("November has 30 days");
            case 12 -> System.out.println("December has 31 days");
            default -> System.out.println("Invalid Number");
        }
    }



}
