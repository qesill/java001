package com.example.oop.basics.inheritance.super_example;

public class Student extends Person{
    private int grade; // rocznik np 1

    Student(){

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 8)
        this.grade = grade;
    }

    Student(String name, String surname, int grade) {
        super(name, surname);
        // this.name = name; // ok
        this.setType("Student");
        this.setGrade(grade);

    }
}
