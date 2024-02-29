package Java_practice_task.JD11_CustomClass;

public class EmployeeClients {

    public static void main(String[] args) {

     Employee person1 = new Employee("John Dow", 37);

     Employee person2 = new Employee("Nikki Healey", 29, 'M'  );

     Employee person3 = new Employee("Roberto Tocci", 42, "Manager", 120_000);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        person3.work();

//        System.out.println(person1.work()); // Не нужно дополнительно на печать выводить,
//        потому что метод сам по себе уже есть System.out.println(jobTitle + " " + name + " is working.");


    }

}
