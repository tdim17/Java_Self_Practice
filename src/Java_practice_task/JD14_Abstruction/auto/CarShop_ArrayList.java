package Java_practice_task.JD14_Abstruction.auto;

import java.util.ArrayList;
import java.util.List;

public class CarShop_ArrayList {

    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", 2010, 25000,"White"),
                new Audi("Q6",2014, 32000, "Red"),
                new Honda("Accord",2011, 20000, "White"  ),
                new Audi("Q4", 2015, 33000, "Blue"),
                new Audi("A7",2019, 35000, "Black"),
                new Audi("Q8",2018, 40000, "White"),
                new Audi("Q5",2009, 30000, "Purple"),
                new Audi("A4", 2011, 30000, "Black"),
                new Honda("Civic",2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V",2019, 35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X",2014, 48000, "Blue"),
        };

        // Новый лист объектов Honda
        List<Car> hondaCars = new ArrayList<>();

        // Заполняем список hondaCars объектами класса Honda:
        for (Car car : cars) {
            if (car instanceof Honda) {
                hondaCars.add(car);
            }
        }

        List<Car> recallHonda = new ArrayList<>();

        // Заполняем список recallHonda только объектами hondaCars в соответствии с условиями по году выпуска:
        for (Car car : hondaCars) {
            Honda hondaCar = (Honda) car;  // ПРОПРОБОТАТЬ ЭТОТ МОМЕНТ! ЭТО CASTING of TYPEs
            if (hondaCar.getYear() > 2009 && hondaCar.getYear() < 2012) {
                recallHonda.add(hondaCar);
            }
        }

        // Выводим список recallHonda:
        for (Car car : recallHonda) {
            System.out.println(car);
        }








    }
}
/*
1. Create a Class Named 'CarShop':
        - Given an array of Car objects:
Car[] cars = {
        new Honda("Pilot","White", 2010, 25000),
        new Audi("Q6", "Red",2014, 32000),
        new Honda("Accord", "White",2011, 20000  ),
        new Audi("Q4", "Blue", 2015, 33000),
        new Audi("A7", "Black",2019, 35000),
        new Audi("Q8", "White",2018, 40000),
        new Audi("Q5", "Purple",2009, 30000),
        new Audi("A4", "Black", 2011, 30000),
        new Honda("Civic", "Red",2018, 30000),
        new Honda("CR-V", "Red", 2012, 23000),
        new Honda("HR-V", "Blue",2019, 35000),
        new Tesla("Model 3", "White", 2015, 45000),
        new Tesla("Model Y", "Black", 2017, 65000),
        new Tesla("Model X", "White", 2016, 48000),
        new Tesla("Model X", "Blue",2014, 48000),
};

    - Tasks:
        1.2. Display all cars eligible for recall:
        - Honda: Years 2010 to 2011
        - Audi: Years 2015 to 2019
        - Tesla: Years 2015 to 2016
        1.3. Display the car with the highest price.
        1.4. Display the car with the lowest price.
        1.5. Create an ArrayList of Tesla named 'teslaCars' and store all Tesla cars from the cars array.
*/
