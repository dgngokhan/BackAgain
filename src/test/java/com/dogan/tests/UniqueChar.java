package com.dogan.tests;

public class UniqueChar {

    public String unique(String str) {
        String[] arr = str.split("");
        String unique1 = "";

        for (String s : arr) {
            int num = 0;
            for (String value : arr) {
                if (value.equals(s)) {
                    num++;
                }
            }
            if (num == 1) {
                unique1 += s;
            }
        }

        return unique1;
    }
}
