package Java_practice_task.JD11_CustomClass.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList <Server> servers;
    public ArrayList<Chef> chefs;


    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        servers = new ArrayList<>();

    }
    public void hireServer(Server server){  /// Что это вообще значит????? (про параметр метода)
        //hireServer(Server server): adds a server object to the Servers ArrayList
        servers.add(server);
    }

    public void hireChef(Server[] servers){
        this.servers.addAll(Arrays.asList(servers)); /// ЗВИЗДЕЦ !!!
    }

}

// Чтобы решить это задание, нужно КАПИТАЛЬНО СНОВА изучить тему Array and ArrayList.
    // В настоящий момент это моя самая слабая тема!!!


/*
Create a custom class named Restaurant with the following specifications:

	Attributes:
			Owner (String)
			Location (String)
			numberOfStars (int)
			Servers (ArrayList of Server objects)
			Chefs (ArrayList of Chef objects)

	Add a constructor that sets the owner, location, and number of stars.

	Actions:
(??)	hireServer(Server server): adds a server object to the Servers ArrayList
(??)	hireServer(Server[] servers): adds an array of Server objects to the Servers ArrayList
		hireChef(Chef chef): adds a chef object to the Chefs ArrayList
		hireChef(Chef[] chefs): adds an array of Chef objects to the Chefs ArrayList
		terminateChef(int employeeID): removes the chef with the matching ID from the Chefs ArrayList
		terminateServer(int employeeID): removes the server with the matching ID from the Servers ArrayList
		toString(): returns a string representation of the Restaurant object, including the number of Servers and Chefs alongside other information

Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information
 */
