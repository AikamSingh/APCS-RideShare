import java.util.ArrayList;

/**
 * write description
 *
 * @author Aikam Singh
 * @version 1/31/23
 */

public class Station {
    ArrayList<Passenger> passengers;

    public Station(){
        passengers = new ArrayList<>();
    }

    public int getNumPassengers(){
        return passengers.size();
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }
}
