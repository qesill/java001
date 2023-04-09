package com.example.basics.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime()); //timestamp

        SimpleDateFormat dateformat = new SimpleDateFormat("HH:mm:ss dd.MM.YYYY");
        System.out.println(dateformat.format(date));
    }
}
