package Java_practice_task.JD07_CustomClass_and_Scanners;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee person1 = new Employee();

        person1.name = "Johny";
        person1.age = 32;
        person1.gender = 'M';
        person1.jobTitle = "Manager";
        person1.salary = 150000.00;

        // Running the methods described in the Class Employee (template)
        person1.work();
        person1.salary();
        person1.age();

        System.out.println(person1);









    }





}
