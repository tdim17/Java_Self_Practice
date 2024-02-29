package Java_practice_task.JD13_Inheritance.employee;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String employeeId, double salary, String companyName, String name, String programmingLanguage) {
        super(employeeId, "DevelopeR", salary, companyName, name);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void work(){
        System.out.println(getJobTitle()  + " " + getName() + " is coding in " + getProgrammingLanguage() );
    }






}



/*
   2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".
 */
