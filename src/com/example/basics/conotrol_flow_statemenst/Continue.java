package com.example.basics.conotrol_flow_statemenst;

import java.sql.SQLOutput;

public class Continue {
    public static void main(String[] args) {
        for(int a = 0; a< 10; a++) {
            if (a==2 || a==5 || a==9) continue;
            System.out.println(a);

        }
    }
}
