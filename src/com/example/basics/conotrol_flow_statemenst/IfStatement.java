package com.example.basics.conotrol_flow_statemenst;

public class IfStatement {
    public static void main(String[] args) {

            int a = 1;
            if (a > 5) {
                System.out.println(" a jest większe od 5");
            } else if  (a ==2){
                System.out.println(" a jest równe 2");
            } else {
                System.out.println(" Wartośc a jest równa " +a);
            }

            if (9 < 20)
                System.out.println(" 9 < 20");
            else
                System.out.println(" nie jest spełniony warunek");

    }
}
