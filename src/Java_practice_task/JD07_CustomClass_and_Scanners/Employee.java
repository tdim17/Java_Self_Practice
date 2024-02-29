package Java_practice_task.JD07_CustomClass_and_Scanners;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;


    public void work () {
        System.out.println(jobTitle + " " + name + " is working");
    }

    public void salary (){
        System.out.println(name + " salary is $" + salary);
    }

    public void age () {
        System.out.println(name + " is " + age + " years old");
    }




    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
