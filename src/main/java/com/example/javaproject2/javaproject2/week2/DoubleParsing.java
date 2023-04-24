package com.example.javaproject2.javaproject2.week2;

public class DoubleParsing {
    public static void main(String[] args) {
        String val1 = "1.11111111";
        String val2 = "2.11111111";

        double dResult = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println(dResult);
    }
}
