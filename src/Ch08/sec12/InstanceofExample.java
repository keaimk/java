package ch08.sec12;

import Ch08.sec12.Bus;
import Ch08.sec12.Taxi;
import Ch08.sec12.Vehicle;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        ride(bus);
    }

    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus bus) {
            bus.checkFare();
        }

        vehicle.run();
    }
}