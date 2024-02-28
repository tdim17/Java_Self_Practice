package Java_weekly_txt_practice_tasks.JD03_Operators;

public class Rectangle {

    /*
    Create a class named Rectangle with the following variables:
					length
					width
	Write a program that calculates the area and perimeter of the given rectangle.
	Example:                         Output:
		length = 4.5                    The area of the rectangle is 9.0
		width = 2                       The perimeter of the rectangle is 13.0
     */

    public static void main(String[] args) {

        double length = 4.5,
                width = 2;

        double arearesult = length * width;
        double perimeterresult = (length + width)*2;

        System.out.println("The area of the rectangle is " + arearesult);
        System.out.println("The perimeter of the rectangle is " + perimeterresult);


    }
}
