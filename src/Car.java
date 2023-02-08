import java.util.ArrayList;

/**
 * write description
 *
 * @author Aikam Singh
 * @version 1/31/23
 */

public class Car {
    private static final int MAX = 3;
    ArrayList<Passenger> riders;
    private int dest;
    private int loc;
    private int passengerMiles;

    public Car(int dest, int loc){
        riders = new ArrayList<>();
        this.dest = dest;
        this.loc = loc;
        passengerMiles = 0;
    }

    public int getNumPassengers(){
        return riders.size();
    }


    public int getDest(){
        return dest;
    }
    public int getLoc(){
        return loc;
    }
    public int getPassengerMiles(){
        return passengerMiles;
    }

    public String getPassengers(){
        String result = "Passengers: ";
        for(Passenger passenger : riders){
            result += passenger + ", ";
        }

        return result;
    }

    public void setPassengerMiles(){

    }

    public String addPassenger(Passenger passenger){
        if(riders.size() < MAX){
            riders.add(passenger);
            return "successfully added passenger";
        }
        else{
            return "car is full";
        }
    }

    public String dropOffPassengers(){
        int peepsToStation = 0;

        for(Passenger passenger : riders){
            if(passenger.getDestination() == loc){
                peepsToStation++;
            }
        }
        if(peepsToStation > 0){
            riders.removeIf(passenger -> passenger.getDestination() == loc);
        }

        return "Dropped off " + peepsToStation + " passengers at station " + loc + ".";
    }

    public String pickUpPassengers(Station station){
        int numPassengers = 0;
        if(riders.size() < MAX){
            if(station.hasPassenger()){
                if(dest > loc){
                    for(int i = 0; i < station.getNumPassengers(); i++){
                        if(station.getWaitingPassengers().get(i).getDestination() > station.getWaitingPassengers().get(i).getStation()){//person going in positive direction
                            riders.add(station.getWaitingPassengers().get(i));
                            numPassengers++;
                            station.removePassenger(station.getWaitingPassengers().get(i));
                        }
                        else{
                            return "person is not going in the same direction";
                        }
                    }
                }
                else{
                    for(int i = 0; i < station.getNumPassengers(); i++){
                        if(station.getWaitingPassengers().get(i).getDestination() < station.getWaitingPassengers().get(i).getStation()){//person going in positive direction
                            riders.add(station.getWaitingPassengers().get(i));
                            numPassengers++;
                            station.removePassenger(station.getWaitingPassengers().get(i));
                        }
                        else{
                            return "person is not going in the same direction";
                        }
                    }
                }
                return "picked up " + numPassengers + " passengers from station " + loc + ".";
            }
            else{
                return "no passengers to pick up";
            }
        }
        else{
            return "car is full :(";
        }
    }

    public String move(){
        if(loc > dest){
            if(loc != dest){
                loc--;
                return "moved 1 station";
            }
            else{
                return "car already at destination";
            }
        }
        else{
            if(loc != dest){
                loc++;
                return "moved 1 station";
            }
            else{
                return "car already at destination";
            }
        }

    }

    public String toString(){
        return "Car: \n numPassengers = " + riders.size() + "\n location = " + loc + "\n destination = " + dest;
    }



}
