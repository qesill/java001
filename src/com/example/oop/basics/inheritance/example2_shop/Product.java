package com.example.oop.basics.inheritance.example2_shop;

public class Product {
    Float price;
    String name;
    String manufacturer;
    int productionYear;

    Product(){
        manufacturer = "unknown";
        name = "unknown";
        price = 100.0f;
    }

    public void printInfo(){
        System.out.println("name: " + name
                + " manufacturer: " + manufacturer
                + " productionYear " + productionYear);
    }

}

