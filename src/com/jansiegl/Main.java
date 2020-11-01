package com.jansiegl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String x = iterator.next();
            int cislo = Integer.parseInt(x);
            if (cislo % 3 == 0 && cislo % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (cislo % 3 == 0) {
                System.out.println("Fizz");
            } else if (cislo % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(cislo);
            }
        }
    }
}