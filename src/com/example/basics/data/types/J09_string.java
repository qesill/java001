package com.example.basics.data.types;

public class J09_string {
    public static void main(String[] args) {
        String s1 = "String #1";
        String s2 = new String (" str #2");

        String s3 = s1 + s2;
        System.out.println(s3.toUpperCase());

        String s4 = "wiersz #1 \n \r \t wiersz #2 \n \\ \" \u263A";
        System.out.println(s4);
    }
}
