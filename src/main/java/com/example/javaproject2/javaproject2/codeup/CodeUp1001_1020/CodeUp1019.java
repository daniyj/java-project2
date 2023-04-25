package com.example.javaproject2.javaproject2.codeup.CodeUp1001_1020;

import java.util.Scanner;
public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();

        String[] dateArr = date.split("\\.");

        System.out.printf("%04d.%02d.%02d",Integer.parseInt(dateArr[0]),Integer.parseInt(dateArr[1]),Integer.parseInt(dateArr[2]));
    }
}
