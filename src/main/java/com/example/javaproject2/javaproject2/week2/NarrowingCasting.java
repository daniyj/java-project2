package com.example.javaproject2.javaproject2.week2;

public class NarrowingCasting {
    public static void main(String[] args) {
        double dVal = 123.456;

        //NarrowingCasting 강제형변환
        int iVal = (int) dVal;
        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + iVal);

        //파싱 문자열->정수형
        String str = "1";
        int num = Integer.parseInt(str);

        int result = 1 + Integer.parseInt("1");
        System.out.println(result);

        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println(val1 + val2);
    }
}
