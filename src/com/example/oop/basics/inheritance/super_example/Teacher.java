package com.example.oop.basics.inheritance.super_example;

public class Teacher extends Person {
    private String teachingSubject; // math
    Teacher(String name, String surname, String teachingSubject){
        super(name, surname);
        this.setTeachingSubject(teachingSubject);
    }
    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        teachingSubject = teachingSubject.toLowerCase();
        switch (teachingSubject) {
            case "math":
            case "eanglish":
            case "sport":
            case "biology":
                this.teachingSubject = teachingSubject;
                break;
            default:
                this.teachingSubject = "unknown";
        }
    }
}
