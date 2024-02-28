package Java_weekly_txt_practice_tasks.JD13_Inheritance.employee;

public class EmployeeClients {

    public static void main(String[] args) {

    Developer dev1 = new Developer("TD1824", 120_000, "Microsoft", "Chee Ho", "Java");

    Tester tes1 = new Tester ("TT9723xD", 150_000, "IBM", "Dmitry Tulyankin");

        System.out.println(tes1);
        System.out.println(dev1);

        tes1.work();
        dev1.work();


    }



}
