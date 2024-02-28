package Java_weekly_txt_practice_tasks.JD13_Inheritance.state;

public class State {

    private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population;


    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(name);   // this.name = name;
        setAbbreviation(abbreviation); // this.abbreviation = abbreviation;
        setPoliticalParty(politicalParty);  // this.politicalParty = politicalParty;
        setGovernor(governor); // this.governor = governor;
        setSenator(senator); // this.senator = senator;
        setPopulation(population); // his.population = population;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty() || name.isBlank() ||  name == null){
            throw new RuntimeException("Name must not be null, empty, or blank");
        }   this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation.trim().isEmpty() || abbreviation.isBlank() ||  abbreviation == null){
            throw new RuntimeException("Abbreviation must not be null, empty, or blank");
        }   this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty.trim().isEmpty() || politicalParty.isBlank() || politicalParty == null){
            throw new RuntimeException("PoliticalParty must not be null, empty, or blank");
        }   this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor.trim().isEmpty() || governor.isBlank() || governor == null){
            throw new RuntimeException("Governor must not be null, empty, or blank");
        }   this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.trim().isEmpty() || senator.isBlank() || senator == null){
            throw new RuntimeException("Senator must not be null, empty, or blank");
        }   this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0) {
            throw new RuntimeException("Population must be greater than zero");
        }   this.population = population;
    }

    public String toString() {
        return  getClass().getSimpleName()  + "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
/*
State Task Requirements:
1. Create a class named 'State' with the following specifications:
   Attributes:
       - name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int

   Encapsulation Requirements:
       - Ensure attributes are private with getters and setters.
       - Conditions for Encapsulation:
           - 'name', 'abbreviation', 'politicalParty', 'Governor', and 'senator' must not be null, empty, or blank.
           - 'population' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Methods:
       - toString(): Prints the information of the State object.

2. Create the following subclasses of the State class:
      - Virginia
      - California
      - Texas
      - Florida
   - Add any additional fields and methods as necessary.

3. Create a class named 'StateClients':
   - Create multiple objects representing different states.
   - Test the methods and variables of each object.
 */