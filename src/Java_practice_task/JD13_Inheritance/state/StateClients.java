package Java_practice_task.JD13_Inheritance.state;

public class StateClients {

    public static void main(String[] args) {

        California california = new California("CA", "Democracy", "Bob Dillan", "Eddie Merphie", 27_000_000);
        Florida florida = new Florida("FL", "Democracy", "Frank Sinatra", "Tonny Bennett", 15_000_000);
        Texas texas = new Texas("TX", "Republican", "George Bush", "Trump", 18_000_000);
        Virginia virginia = new Virginia("VA", "Democracy", "Jekkie Rubbi", "Archi Totto", 15_000_000 ) ;

        System.out.println(california);
        System.out.println(florida);
        System.out.println(texas);
        System.out.println(virginia);




    }







}
