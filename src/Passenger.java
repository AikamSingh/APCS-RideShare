/**
 * write description
 *
 * @author Aikam Singh
 * @version 1/31/23
 */

public class Passenger {
    private int destination;
    private int station;

    public Passenger(int destination, int station){
        this.destination = destination;
        this.station = station;
    }

    public int getDestination(){
        return destination;
    }

    public int getStation(){
        return station;
    }

    public void setStation(int station){
        this.station = station;
    }

    public String toString(){
        return "Destination: " + destination + ", station: " + station;
    }

}
