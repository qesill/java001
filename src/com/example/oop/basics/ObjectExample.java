package com.example.oop.basics;

class CarObject {
    private String manufacturer;
    private String model;
    private int year;

    public CarObject(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarObject{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
public class ObjectExample {
    public static void main(String[] args) {
         CarObject car = new CarObject("Ford","Mustang",2020);
         CarObject car2 = new CarObject("Dodge","Charger",2005);
        System.out.println(car);
        System.out.println(car.hashCode());

        if(car.equals(car2)) {
            System.out.println("Car równe car2, wsjazują na tą samą referencję");
        } else {System.out.println("Różne referencje");
        }
    }
}

