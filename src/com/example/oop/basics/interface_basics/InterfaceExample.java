package com.example.oop.basics.interface_basics;

public class InterfaceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        Vehicle vehicle = car;
        System.out.println(vehicle.getTopSpeed());
        vehicle.move();

        Vehicle car2 = new Car();
        car2.turn();
        Car someCar = (Car)car2;
        System.out.println(someCar.getTopSpeed());

        Plane plane = new Plane();
        Vehicle planeVehicle = plane;
        System.out.println(planeVehicle.getTopSpeed());

        Vehicle [] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = car2;
        vehicles[2] = plane;

        vehicles[2].move();

        if(vehicles[2] instanceof Plane) {
            Plane somePlane = (Plane)vehicles[2];
            somePlane.turn();

            Flying flyingVehicle = somePlane;
            flyingVehicle.increseHeight();
        }




    }
}
