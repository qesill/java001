package com.example.basics.operators;

public class Op3_relational_operators {
    public static void main(String[] args) {
        boolean b1 = 5 == 3; // false
        System.out.println(b1);

        boolean b2 = 7 == 7; //true

        boolean b3 = 7 != 7; //false
        boolean b4 = 7 != 5; //true

        boolean b5 = 10 > 4; //true
        boolean b6 = 10 < 8; //false

        boolean b7 = 8 >= 6; //true
        boolean b8 = 8 >= 8; //true
        boolean b9 = 8 > 8; //false

        boolean b10 = 10 <= 12; //true
        boolean b11 = 10 <= 10; //true
    }


}
