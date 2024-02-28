package Java_weekly_txt_practice_tasks.JD11_CustomClass;

public class CydeoStudentClients {

    public static void main(String[] args) {

        CydeoStudent stud1 = new CydeoStudent("James Bond", 42, "A007", 'A', 3, 4);
        CydeoStudent stud2 = new CydeoStudent("Mario Smetana", 32, "X002", 'B', 7, 2);

        System.out.println(stud1.schoolName);
        System.out.println(stud1.programmingLanguage);

        System.out.println(stud1);
        System.out.println(stud2);

        stud1.study();
        stud1.attendClass();

        System.out.println(CydeoStudent.schoolName);

        stud1.printSchoolName();
        stud1.printProgLanguage();





    }
}