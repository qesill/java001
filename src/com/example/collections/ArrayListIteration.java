package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Car {
    private String name;
    private int year;
    private String manufacturer;

    public Car(String name, int year, String manufacturer) {
        this.name = name;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}

public class ArrayListIteration {
    public static void main(String[] args) {

        ArrayList<Car>cars = new ArrayList<>();
        cars.add(new Car("Charger", 2020,"Dodge"));
        cars.add(new Car("T", 1920,"Ford"));
        cars.add(new Car("Viper", 1997,"Dodge"));

        System.out.println("Pętla for:");
        for(int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.println(car);
        }

        System.out.println("\nPętla for each:");
        for (Car car: cars
             ) {
            System.out.println(car);
        }

        System.out.println("\nIterator:");
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car);
        }
    }
}
