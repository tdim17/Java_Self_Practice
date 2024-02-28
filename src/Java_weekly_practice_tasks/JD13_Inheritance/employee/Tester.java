package Java_weekly_txt_practice_tasks.JD13_Inheritance.employee;

public class Tester extends Employee  {

    public Tester(String employeeId, double salary, String companyName, String name) {
        super(employeeId, "Tester", salary, companyName, name);
    }


    // work(): Displays "[jobTitle] [name] is testing".

    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is testing" );
    }





}
