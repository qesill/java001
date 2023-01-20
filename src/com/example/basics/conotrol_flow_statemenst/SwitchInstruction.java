package com.example.basics.conotrol_flow_statemenst;

public class SwitchInstruction {
    public static void main(String[] args) {

        int num = 10;

        switch (num) {
            case 1:
                System.out.println(1);
                System.out.println(" ok");
                break;
            case 3:
                System.out.println(3);
                break;
            case  10:
                System.out.println(10);
                break;
            case 11:
                System.out.println(11);
                break;
            default:
                System.out.println("Default: " + num);
        }

        String str = "Ania";
        switch (str) {
            case "Ola":
                System.out.println("Ola");
                break;
            case "Ania":
                System.out.println();
        }
    }
}
