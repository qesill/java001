package com.example.oop.basics.inheritance.abstrect_classes;

public class AbstractExample {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Adam", "Kowalski", 32);
        worker1.printInfo();

        Manager manager = new Manager("Olek", "Zent", 35, "R&D");
        manager.printInfo();

        Person person = manager;
        System.out.println(person.getName());


            }
        }


