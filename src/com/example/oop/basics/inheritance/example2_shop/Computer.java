package com.example.oop.basics.inheritance.example2_shop;

public class Computer extends Product {
    public Mouse mouse;
    public Keyboard keyboard;
    public Monitor monitor;

    Computer() {
        mouse = new Mouse();
        keyboard = new Keyboard();
        monitor = new Monitor();

        price = 1000.0f;
    }
}