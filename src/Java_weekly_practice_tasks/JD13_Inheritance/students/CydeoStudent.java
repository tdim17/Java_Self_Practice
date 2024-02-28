package Java_weekly_txt_practice_tasks.JD13_Inheritance.students;

public class CydeoStudent extends Student {

    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.programmingLanguage = programmingLanguage;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber >= Integer.MIN_VALUE && batchNumber <= Integer.MAX_VALUE) {
            throw new RuntimeException("It only must be digit.");
        }   this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (batchNumber >= Integer.MIN_VALUE && batchNumber <= Integer.MAX_VALUE) {
            throw new RuntimeException("It only must be digit.");
        }   this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage.trim().isEmpty() || programmingLanguage.isBlank() || programmingLanguage == null) {
            throw new RuntimeException("Name must not be null, empty, or blank.");
        }   this.programmingLanguage = programmingLanguage;
    }

    public void study(){
        System.out.println(getName() + " from " + getSchoolName() + " is learning " + programmingLanguage + " language" );
    }


    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                ", studentName='" + getName() + '\'' +
                ", studentAge='" + getAge() + '\'' +
                ", studentGender='" + getGender() + '\'' +
                "studentId='" + getStudentId() + '\'' +
                ", fieldOfStudy='" + getFieldOfStudy()  + '\'' +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +

                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
