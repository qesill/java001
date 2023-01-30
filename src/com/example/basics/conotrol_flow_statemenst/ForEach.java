package com.example.basics.conotrol_flow_statemenst;

public class ForEach {
    public static void main(String[] args) {
        String [] strArr = {"Ola", "Adam", "Kasia", "Olek"};

        for (String str : strArr) {
            if (str.equalsIgnoreCase("Kasia")) continue;
            System.out.println(str);
        }
    }
}
