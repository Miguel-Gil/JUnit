package org.example;

import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    public static int max(int[] a){
        int m = a[0];
        int i = 0;

        //Informa del error si el array es null o esta vacio
        if (a == null || a.length < 0){
            System.out.println("Error: se deben introducir números");
            return m;
        }

        else{
            for (i = 0; i < a.length; i++) {
                if (a[i] > m) {
                    m = a[i];
                }
            }
            return m;
        }
    }
}