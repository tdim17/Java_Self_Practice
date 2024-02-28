package Java_weekly_txt_practice_tasks.JD03_Operators;

public class SalaryCalculator {

    /*  Create a class named SalaryCalculator. Given the following variables:
				hourlyRate (double)
				weeklyHours (int)
				stateTaxRate (double)
				federalTaxRate (double)

	Use the given information above to calculate the following:
				salaryBeforeTax
				stateTax
				federalTax
				totalTax
				salaryAfterTax

	Display each of the above in the following format:

	Example:                                            Output:
		hourlyRate = $50					                      Gross pay is: $117000.0
		weeklyHours = 45                                          Federal tax is: $30420.0
		stateTaxRate = 6  (given as a percentage)                 State tax is: $7020.0
		federalTaxRate = 26 (given as a percentage)               Total tax is: $37440.0
                                                                  Net income is: $79560.0
     */

    public static void main(String[] args) {

        double hourlyRate = 50,
               stateTaxRate = 6, // given as a percentage
               federalTaxRate = 26;  // given as a percentage

        int weeklyHours = 45;
        int weekAmount = 52;

        double gross = hourlyRate * weeklyHours * weekAmount;
        double federalTax = gross / 100 * federalTaxRate;
        double stateTax = gross / 100 * stateTaxRate;


        System.out.println("Gross pay is: $" + gross);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("Federal tax is: $" + stateTax);
        System.out.println("Total tax is: $" + (federalTax + stateTax));
        System.out.println("Net income is: $" + (gross - (federalTax + stateTax)));


    }

}
