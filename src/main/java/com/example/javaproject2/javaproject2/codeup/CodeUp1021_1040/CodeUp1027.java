package com.example.javaproject2.javaproject2.codeup.CodeUp1021_1040;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        //년.월.일 입력받아 일-월-년 출력
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] dateArr = date.split("\\.");

        System.out.printf("%s-%s-%s",dateArr[2],dateArr[1],dateArr[0]);
    }
}
