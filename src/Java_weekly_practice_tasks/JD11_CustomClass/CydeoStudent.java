package Java_weekly_txt_practice_tasks.JD11_CustomClass;

public class CydeoStudent {

    public String name;
    public int age;
    public String id;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    static String programmingLanguage;

    // Статик блок:
    // Можно с помощью статик блока инициализировать static variable:

    static {
        schoolName = "Cydeo";
    }
    static {
        programmingLanguage = "Java";
    }


    public CydeoStudent(String name, int age, String id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studying.");
    }
    public void attendClass(){
        System.out.println(name + " is attending the live class.");
    }

    public void printSchoolName(){
                System.out.println(schoolName);
    }
    public void printProgLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}



