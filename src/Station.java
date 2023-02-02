import java.util.ArrayList;

/**
 * write description
 * @author Aikam Singh
 * @version 1/31/23
 */

public class Station {
    ArrayList<Passenger> passengers;
    private boolean hasPassenger;
    private int stationNum;
    private static int lastStationNum = 0;

    public Station(){
        passengers = new ArrayList<>();
        hasPassenger = false;
        lastStationNum++;
        stationNum = lastStationNum;
    }

    public int getNumPassengers(){
        return passengers.size();
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public boolean hasPassenger(){
        if(passengers.size() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        String result = "Station #" + stationNum + " with size "+ passengers.size() + ":\n";

        for(int i = 0; i < passengers.size(); i++){
            if(i < passengers.size() - 1){
                result += "passenger #" + i + " with destination " + passengers.get(i).getDestination() + ", \n";
            }
            else{
                result += "passenger #" + (i + 1) + " with destination " + passengers.get(i).getDestination();
            }

        }

        return result.trim();
    }
}
