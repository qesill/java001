package com.example.basics.date;

import java.util.Date;

public class PrintExample {
    public static void main(String[] args) {

        System.out.printf("Hello %s %d %f - %b . %n / %tc , to była data.", "World", 12, 5.6f, true, new Date());

        System.out.printf("%n %n Hello %s %2$tY.%2$td.%2$tm", "World", new Date());

        String str = String.format("%n %1$tT", new Date());
        System.out.printf(str);

        str = String.format("%n %1$tH-%1$tM-%1$tS", new Date());
        System.out.println(str);
    }
}
