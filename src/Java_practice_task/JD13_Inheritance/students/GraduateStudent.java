package Java_practice_task.JD13_Inheritance.students;

public class GraduateStudent extends Student {


    public GraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public void study(){
        System.out.println(getName() + " is a graduate from " + getSchoolName() );
    }




}


