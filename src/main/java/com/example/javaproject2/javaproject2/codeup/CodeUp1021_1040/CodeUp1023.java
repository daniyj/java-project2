package com.example.javaproject2.javaproject2.codeup.CodeUp1021_1040;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.next();
        String[] valArr = val.split("\\.");

        System.out.printf("%s\n%s",valArr[0],valArr[1]);
    }
}
