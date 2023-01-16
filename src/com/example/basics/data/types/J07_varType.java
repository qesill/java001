package com.example.basics.data.types;

import com.sun.jdi.IntegerValue;

public class J07_varType {
    public static void main(String[] args) {
        int number = add(10, "5");
        System.out.println(number);

    }
    public static int add(int a, String b){
        var resoult = a + Integer.valueOf(b).intValue();
        return resoult;
    }
}
