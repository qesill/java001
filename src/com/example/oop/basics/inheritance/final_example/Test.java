package com.example.oop.basics.inheritance.final_example;

class Emploee {
    String name;
    String surname;
    String jobTitle;
    float salary;

}

class Manager extends Emploee {
    String responsibility;
}

class Director extends Manager {
    String department;
}

class VicePresident extends Director {

}

final class CEO extends VicePresident {
    String companyName;
}

/*class Saomething extends CEO {
    // nie można rozszerzyć klasy final
}
*/

public class Test {
    public static void main(String[] args) {

    }
}
