package com.example.basics.data.string_class;

public class Functions_isEmpty_isBlank {
    public static void main(String[] args) {

        String emptyStr = "";
        String blankStr = "   \n     ";

        if (emptyStr.isEmpty()) {
            //true
            System.out.println("emptyStr jest pusty - isEmpty()");
        }

        if (blankStr.isEmpty()) {
            //true
            System.out.println("blankStr jest pusty - isEmpty()");
        } else {
            System.out.println("blankStr nie jest pusty - isEmpty()");
        }

        if (emptyStr.isBlank()) {
            //true
            System.out.println("blankStr ma 0 znaków lub same białe znaki - isBlank");
        }
        if (blankStr.isBlank()) {
            //true
            System.out.println("blankStr ma 0 znaków lub same białe znaki - isBlank");
        }
    }
}
