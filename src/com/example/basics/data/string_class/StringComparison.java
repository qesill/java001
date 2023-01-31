package com.example.basics.data.string_class;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLo";

        if (s2.equals(s1)) System.out.println("s2 równe jest s1");
        if (s3.equals(s1)) System.out.println("s3 równe jest s1"); //false
        if (s3.equalsIgnoreCase(s1)) System.out.println("s3 równe jest s1 z dokładnością do wielkości liter");}
}
