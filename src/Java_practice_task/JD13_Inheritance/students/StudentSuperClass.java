package Java_practice_task.JD13_Inheritance.students;

public class StudentSuperClass {

    private String name;
    private int age;
    private String gender;

    public StudentSuperClass(String name, int age, String gender) {
        setName(name); // this.name = name;
        setAge(age); // this.age = age;
        setGender(gender); // this.gender = gender;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty() || name.isBlank() || name == null) {
           throw new RuntimeException("Name must not be null, empty, or blank.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

        if (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F")) {
//            System.err.println("It only can be letters M or F");
//            System.exit(1);
            throw new RuntimeException("It only can be letters M or F");
        }
        this.gender = gender;
    }


    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}


/*
StudentSuperClass Task Requirements:
1. Create a class named "StudentSuperClass" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Actions:
       - toString(): Prints the information of the StudentSuperClass object.

2. Create a subclass named "Student" with the following specifications:
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

3. Create the following subclasses of the StudentSuperClass class:
   3.1 GraduateStudent:
       - Override the study method.
       - Add any additional fields and methods as necessary.

   3.2 UndergraduateStudent:
       - Same as GraduateStudent.

   3.3 CydeoStudent:
       - Additional Attributes:
           - batchNumber: int
           - groupNumber: int
           - programmingLanguage: String
       - Encapsulation:
           - Same as previous tasks.
       - Constructor:
           - Same as previous tasks.
       - Actions:
           - Override the study method.
           - Override the toString method.

4. Create a class named "StudentClients":
   - Create multiple objects representing different students.
   - Test the methods and attributes of each object.
 */
