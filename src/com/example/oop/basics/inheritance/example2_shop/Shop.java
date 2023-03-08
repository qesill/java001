package com.example.oop.basics.inheritance.example2_shop;

/*
    klasa Shop
    klasa Product (zmienne: price, name, manufacturer, productionYear)
        klasa Mause extends Product (zmienne: numButtons = 3)
            klasa VerticalMouse extends Mouse (zmienne: -)
        klasa Monitor extends Product (zmienne: resolution = 1080)
        klasa Keyboard extends Product (zmienne: numKeys = 104) //w konstruktorze
        klasa Computer extends Product (zmienne: mouse, monitor, keyboard)

    dodajemy puty konstruktor do każdej klasy, ustawiamy na nich pola danej klasy
    Tworzymy egzemplarze klas w metodzie main
    Każda klasa w oddzielnym pliku java
 */

public class Shop {
    public static void main(String[] args) {
        Product product = new Product();
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Computer computer = new Computer();
        VerticalMouse vmouse = new VerticalMouse();
        System.out.println(computer.monitor.resolution);

        System.out.println("monior price: " + monitor.price);
        System.out.println("keyboard price: " + keyboard.price);
        System.out.println("computer price: " + computer.price);
    }
}
