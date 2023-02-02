/**
 * write description
 *
 * @author Aikam Singh
 * @version 1/23/23
 */

public class RideShareRunner {
    public static void main(String[] args) {
        //creates a passenger
        Passenger p1 = new Passenger(1, 2);
        //creates a new station
        Station s = new Station();
        //prints out information about the passenger
        System.out.println("p1 = " + p1.toString());
        s.addPassenger(p1);
        //prints out number of passengers in the station
        System.out.println(s.getNumPassengers());


    }
}
