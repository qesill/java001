package com.example.oop.basics;

class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

}
public class CarExapmle {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.manufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "Blue";
        ford.year = 1967;
        ford.topSpeed = 200.0f;

        Car chevrolet = new Car();
        chevrolet.manufacturer = "Chevrolet";

    }
}
