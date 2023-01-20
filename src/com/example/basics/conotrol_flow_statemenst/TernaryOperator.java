package com.example.basics.conotrol_flow_statemenst;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = (a > 3) ? 100 : 9;
        System.out.println("b: " + b);

// to samo co:
        if (a > 3) {
            b = 100;
        } else {
            b = 9;
        }
        System.out.println("b: " + b);
    }
}
