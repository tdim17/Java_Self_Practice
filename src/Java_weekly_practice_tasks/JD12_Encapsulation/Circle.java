package Java_weekly_txt_practice_tasks.JD12_Encapsulation;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    // Constructor:
    public Circle(double radius) {
        this.radius = radius;
    }


    public void setRadius(double radius) {
        if (radius <= 0){
            System.err.println("The radius cannot be set to a negative or zero value.");
            System.exit(1);
            // вместо блока из двух строк System мы можем использовать одну строку:
            // throw new RuntimeException("The radius cannot be set to a negative or zero value.");
        }
        this.radius = radius;
    }




    public double calcArea() {
        // calcArea(): Calculates and returns the area of the circle object.
       return radius * radius * Math.PI;
    }

    public double calcPerimeter() {
        // calcPerimeter(): Calculates and returns the perimeter of the circle object.
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "radius=" + radius +
                ", perimeter=" + calcPerimeter() +
                ", area=" + calcArea() +
                '}';
    }
}


/*
1. Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.

 */
