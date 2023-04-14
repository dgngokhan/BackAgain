package com.dogan.tests;

public class sumOfInt {

    public static int getSumOfNumbers(String s) {


        int sum = 0;

        String[] numbers = s.replaceAll("[\\D]+", " ").split(" ");

        for (String each : numbers) {
            sum += Integer.parseInt(each);
        }

        return sum;
    }
}
