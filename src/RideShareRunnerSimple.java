/**
 * write description
 *
 * @author Aikam Singh
 * @version 1/23/23
 */

public class RideShareRunnerSimple {
    public static void main(String[] args) {

        //creates passengers, cars, anc stations to set up testing scenario
        Passenger p1 = new Passenger(2, 0);
        Passenger p2 = new Passenger(2, 1);
        Passenger p3 = new Passenger(3, 1);
        Passenger p4 = new Passenger(4, 1);
        Passenger p5 = new Passenger(0, 3);
        Car car1 = new Car(4,0);
        Car car2 = new Car(4, 2);
        Car car3 = new Car(1, 4);
        Station s1 = new Station();
        Station s2 = new Station();
        Station s3 = new Station();
        Station s4 = new Station();
        Station s5 = new Station();

        System.out.println("Testing car at station 0: picking up passenger \n ----------------------------------------------------------------");
        System.out.println("adding p1 to station 0");
        s1.addPassenger(p1);
        System.out.println("Printing out s1 to see if there are any passengers");
        System.out.println(s1);
        System.out.println("Picking up passenger");
        System.out.println(car1.pickUpPassengers(s1));
        System.out.println("car1 toString to see if passenger was successfully picked up");
        System.out.println(car1);
        System.out.println("moving car since no more passengers to pick up");
        car1.move();

        System.out.println("Testing car at station 1: picking up passenger \n ----------------------------------------------------------------");
        System.out.println("adding 3 new passengers to station 1");
        s2.addPassenger(p2);
        s2.addPassenger(p3);
        s2.addPassenger(p4);
        System.out.println("Printing out station to see if there are any passengers");
        System.out.println(s2);
        System.out.println("Picking up passenger");
        System.out.println(car1.pickUpPassengers(s2));
        System.out.println("There should be 1 passenger left over since the car is full now");
        System.out.println(s2);
        System.out.println("car1 toString to see if passenger was successfully picked up");
        System.out.println(car1);
        System.out.println("moving car since no more passengers to pick up \n");
        car1.move();

        System.out.println("Testing car at station 2: picking up passenger \n ----------------------------------------------------------------");
        System.out.println("adding passenger to station");
        System.out.println("Printing out station to see if there are any passengers");
        System.out.println(s3);
        System.out.println("Picking up passenger");
        System.out.println(car2.pickUpPassengers(s3));
        System.out.println("No passengers should be picked up since station is empty");
        System.out.println(s3);
        System.out.println("checking car so see that no passengers have been picked up");
        System.out.println(car2);
        System.out.println("Moving car2 since no more passengers to pick up");
        car2.move();
        System.out.println("Continuing to move car1 since it is full and not at destination");
        car1.move();

        System.out.println("Testing car at station 3: picking up passenger \n ----------------------------------------------------------------");
        System.out.println("Printing out station to see if there are any passengers");
        s4.addPassenger(p5);
        System.out.println(s4);
        System.out.println("Picking up passenger");
        System.out.println(car2.pickUpPassengers(s4));
        System.out.println(car1.pickUpPassengers(s4));
        System.out.println("car2 should have picked up the passenger since car1 is full");
        System.out.println(s4);
        System.out.println("checking car1 and car2 so see that car2 has the passenger");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println("Moving car2 since no more passengers to pick up");
        car2.move();
        System.out.println("Continuing to move car1 since it is full and not at destination");
        car1.move();

        System.out.println("Testing car at station 4: moving backwards \n ----------------------------------------------------------------");
        System.out.println("Printing out station to see if there are any passengers");
        System.out.println(s5);
        System.out.println("Picking up passenger");
        System.out.println(car2.pickUpPassengers(s5));
        System.out.println(car1.pickUpPassengers(s5));
        System.out.println("there is a car at s5, so we expect it to not pick up anything but move in the opposite direction back to station 0");
        System.out.println(car3.pickUpPassengers(s5));
        System.out.println("should be no passengers to pick up");
        System.out.println(s5);
        System.out.println("Moving all the cars: c1 and c2 should move and not move again after this move");
        car2.move();
        car1.move();
        System.out.println("moving car3: should move to station3");
        car3.move();

        System.out.println("Testing car3 at station 3: moving backwards and picking up person\n ----------------------------------------------------------------");
        System.out.println("printing out station - should have 1 passenger");
        System.out.println(s4);
        System.out.println("picking up passenger");
        System.out.println(car3.pickUpPassengers(s4));
        System.out.println("checking station to make sure that passenger was successfully picked up");
        System.out.println(s4);
        System.out.println("moving cars - c3 should move backwards and c1 and c2 should not move at all");
        car1.move();
        car2.move();
        car3.move();
    }
}
