package Java_weekly_txt_practice_tasks.JD11_CustomClass.restaurant;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void takeOrder(){
        System.out.println(name+" is taking order");
    }

    public void cleanTable(){
        System.out.println(name+" is cleaning table");
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + (isFullTime? "Full-time" : "Part-time") +
                '}';
    }
}
/*
Create a custom class named Server with similar specifications:

Attributes:
name (String)
employeeID (int)
hourlyRate (double)
fullTime (boolean)

Add A constructor that can set all the fields.

Actions:
takeOrder(): prints server's name + " is taking order"
cleanTable(): prints servers's name + " is cleaning table"
toString(): returns a string representation of a Chef, including full-time or part-time status
*/