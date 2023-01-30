package com.example.basics.programs;

import java.util.Scanner;
// procent składany
// 1000 * (1 + 0.05)^3
public class CompoundIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double startCapital = 0;
        double yearlyIntrest = 0;
        int numYeras = 0;

        double finalCApital; //rezultat oszczędzania
        System.out.println("Wpisz kapitał początkowy:");
        startCapital = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz roczne oprocentowanie np 5 to 5%:");
        yearlyIntrest = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz ilość lat oszczędzania:");
        numYeras = in.nextInt();
        //numYeras = Integer.valueOf(in.nextLine()).intValue();

        finalCApital = startCapital * Math.pow(1 + (yearlyIntrest / 100.0d), numYeras);
        System.out.println("Efekt oszczędzania z procentem skłądanym: " + Math.round(finalCApital));
    }
}
