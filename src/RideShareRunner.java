/**
 * write description
 *
 * @author Aikam Singh
 * @version 1/23/23
 */

public class RideShareRunner {
    public static void main(String[] args) {
        //creates passengers
        Passenger p1 = new Passenger(1, 2);
        Passenger p2 = new Passenger(1, 2);
        //creates a new station
        Station s1 = new Station();
        Station s2 = new Station();
        //prints out information about the passenger
        System.out.println("p1 = " + p1.toString());
        //adds passengers
        s1.addPassenger(p1);
        s1.addPassenger(p2);
        //prints out number of passengers in the station
        System.out.println("Number of passengers in Station 1: " + s1.getNumPassengers()); //expects 2
        //prints out information about the station #1
        System.out.println(s1.toString());
        //prints out infor of station #2
        System.out.println(s2.toString());


    }
}
