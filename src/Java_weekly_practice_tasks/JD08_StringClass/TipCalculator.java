package Java_weekly_txt_practice_tasks.JD08_StringClass;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Split your Check (Yes or No) ?");
        String splitAnswer = input.nextLine().toLowerCase();

        System.out.println("Enter the number of people (number)");
        int peopleNum = input.nextInt();

        System.out.println("Enter the check amount (number)");
        double check = input.nextDouble();  // Probably that is double

        input.nextLine();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = input.nextLine().toLowerCase();



        double totalTip;

        switch (quality) {
            case "poor" -> totalTip = check * 0.05;
            case "fair" -> totalTip = check * 0.10;
            case "good" -> totalTip = check * 0.15;
            case "great" -> totalTip = check * 0.20;
            case "excellent" -> totalTip = check * 0.25;
            default -> totalTip = check * 10;
        }

        double totalPayment = check + totalTip;

        System.out.println("Number of people entered: " + peopleNum);
        System.out.println("Check amount: " + check);
        System.out.println("Quality Service was: " + quality);
        System.out.println("Total Tip = " + totalTip);
        System.out.println("Total to Pay = " + totalPayment);

        if (splitAnswer.equals("yes")) {
            System.out.println("Total per person: " + (totalPayment / peopleNum));
            System.out.println("Tip per person: " + (totalTip / peopleNum));
        }

        input.close();
    }

}
