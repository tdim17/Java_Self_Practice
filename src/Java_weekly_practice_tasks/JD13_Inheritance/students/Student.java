package Java_weekly_txt_practice_tasks.JD13_Inheritance.students;

public class Student extends StudentSuperClass {

    private String studentId;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;


    public Student(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
        this.grade = grade;
        setSchoolName(schoolName); // this.schoolName = schoolName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName.trim().isEmpty() || schoolName.isBlank() || schoolName == null){
            throw new RuntimeException("The schoolName must not be null, empty, or blank.");
        }
        this.schoolName = schoolName;
    }

        public void study(){
            System.out.println(getName() + " from " + schoolName );
        }



    public String toString() {
        return  getClass().getSimpleName() + "{" +
                ", studentName='" + getName() + '\'' +
                ", studentAge='" + getAge() + '\'' +
                ", studentGender='" + getGender() + '\'' +
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }





}

/*
2. Create a subclass named "StudentSuperClass" with the following specifications:
Attributes:
        - studentId: String
       - fieldOfStudy: String
       - grade: char
       - schoolName: String

Encapsulation:
        - Same as previous tasks.

Actions:
        - study(): Displays a message stating the student's name and school.
        - toString(): Prints the information of the StudentSuperClass object (including all attributes).

*/