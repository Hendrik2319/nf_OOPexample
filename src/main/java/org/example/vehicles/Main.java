package org.example.vehicles;

public class Main {

    public static void main(String[] args) {

        Vehicle veh1 = new Vehicle("brand A", "model A1", 2019);
        Vehicle veh2 = new Vehicle("brand B", "model B1", 1995);
        Car car1 = new Car("Ford", "Fiesta", 1994, 3);
        Car car2 = new Car("Ford", "Fiesta", 1996, 3);
        Car car3 = new Car("Nissan", "Primera", 2001, 5);

        veh1.writeInfo("Vehicle 1");
        veh2.writeInfo("Vehicle 2");
        car1.writeInfo("Car 1");
        car2.writeInfo("Car 2");
        car3.writeInfo("Car 3");
    }
}
