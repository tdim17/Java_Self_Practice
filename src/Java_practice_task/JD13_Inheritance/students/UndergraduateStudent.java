package Java_practice_task.JD13_Inheritance.students;

public class UndergraduateStudent extends Student {


    public UndergraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public void study(){
        System.out.println(getName() + " is a undergraduate Student in " + getSchoolName() );
    }



}
