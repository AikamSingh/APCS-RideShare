/**
 * This is the main runner of the rideshare program.
 *
 * @author Aikam Singh
 * @version 2/8/23
 */

public class RideShareRunner {
    public static void main(String[] args) {
        int NUMBER_OF_ITERATIONS = 10;
        int MAX_NUM_CARS = 10;
        int MAX_NUM_PEOPLE = 200;

        //creating 31 stations
        int numStations = 31;
        Station[] stations = new Station[numStations]; //array of all the stations
        for(int i = 0; i < numStations; i++){
            stations[i] = new Station();
        }

        //creating cars
        int numCars = (int) (Math.random() * MAX_NUM_CARS) + 1;
        int dest;
        int loc;
        Car[] cars = new Car[numCars];
        System.out.println("Printing out all cars created and their information: \n");
        for(int i = 0; i < numCars; i++){
            dest = (int) (Math.random() * 31) + 1; //theoretically should give random dest to each car
            loc = (int) (Math.random() * 31) + 1; //theoretically should give random loc to each car
            cars[i] = new Car(dest, loc);
            System.out.println("car #" + i + " with dest " + dest + " with loc " + loc + ".");
        }
        System.out.println("-----------------------------------------------------\n");

        //creating passengers
        int numPass = (int) (Math.random() * MAX_NUM_PEOPLE) + 1;
        int destPass;
        int locPass;
        System.out.println("Printing out all passengers created and their information: \n");
        System.out.println("Number of total passengers: " + numPass);
        for(int i = 0; i < numPass; i++){
            destPass = (int) (Math.random() * 31) + 1; //theoretically should give random dest to each car
            locPass = (int) (Math.random() * 31) + 1; //theoretically should give random loc to each car
            stations[locPass-1].addPassenger(new Passenger(destPass, locPass));
            System.out.println("Passenger #" + i + " with dest " + destPass + " with loc " + locPass + ".");
        }
        System.out.println("-----------------------------------------------------\n");

        System.out.println("Printing out all the stations to see how many passengers they have to check if the distribution of the passengers worked as intended. \n");
        for(Station s : stations){
            System.out.println(s);
        }
        System.out.println("-----------------------------------------------------\n");

        System.out.println("Iterating through multiple scenarios of the program \n");
        for(int i = 0; i < NUMBER_OF_ITERATIONS; i++){
            System.out.println("Iteration #" + (i + 1));
            for(Car c : cars){
                c.pickUpPassengers(stations[c.getLoc() - 1]);
                c.dropOffPassengers();
                c.move();
            }
            for(Station s : stations){
                System.out.println(s);
            }
            System.out.println("\n");
        }
        System.out.println("-----------------------------------------------------\n");

        System.out.println("Getting total passenger miles...");
        int totalPass = 0;
        for(Car c : cars){
            totalPass += c.getPassengerMiles();
        }
        System.out.println("TOTAL PASSENGER MILES: " + totalPass + "\n");
        System.out.println("-----------------------------------------------------\n");

        System.out.println("Getting total car miles driven...");
        int totalCar = 0;
        for(Car c : cars){
            totalCar += c.getCarMiles();
        }
        System.out.println("TOTAL CAR MILES: " + totalCar + "\n");
        System.out.println("-----------------------------------------------------\n");

        System.out.println("Calculating average revenue per mile(passengerMiles/carMiles)...");
        double avg = (totalPass * 1.0)/totalCar ;
        avg = Math.round(avg * 100)/100.0;

        System.out.println("Assuming $1 per mile per passenger...");
        System.out.println("Average revenue per mile: $" + avg);


    }
}
