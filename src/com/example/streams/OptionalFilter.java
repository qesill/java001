package com.example.streams;

import java.util.Optional;

public class OptionalFilter {
    public static void main(String[] args) {

        Optional<String> opt = Optional.ofNullable("tekst");
        opt.map( str -> str + " oraz informacje")
                .filter(str -> str.length() > 5)
                .or( () -> Optional.ofNullable("Nowy String"))
                .ifPresent(System.out::println);
    }
}
