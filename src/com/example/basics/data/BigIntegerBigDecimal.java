package com.example.basics.data;

import java.math.*;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {

        BigInteger bigInt = new BigInteger("242345445605670598759837329842704928372094874098379853957");
                bigInt = bigInt.add(new BigInteger("9876543456786543234567654323456654"));
        System.out.println("Wynik: " + bigInt);

        BigDecimal decimal = new BigDecimal("1240983240932840934850394850438504390.28320498230493802984039842");
                decimal = decimal.pow(3);
        decimal = decimal.subtract(new BigDecimal("324234342.3243534534543"));
        System.out.println("Wynik: " + decimal.toString());

    }
}
