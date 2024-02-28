package Java_weekly_txt_practice_tasks.JD13_Inheritance.students;

public class StudentClients {

    public static void main(String[] args) {

    Student stud1 = new Student("Robert", 32, "m", "K774", "Computer Seance", 'B', "Boston Tech" );
    CydeoStudent stud2 = new CydeoStudent("Tracy Carlson", 40, "f", "T552", "Computer Seance", 'A', "Cydeo", 4, 2, "Java" );


        System.out.println(stud1);
        System.out.println(stud2);

        stud1.study();
        stud2.study();


    }





}
