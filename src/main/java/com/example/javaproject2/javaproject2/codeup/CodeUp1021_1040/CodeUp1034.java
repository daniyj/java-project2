package com.example.javaproject2.javaproject2.codeup.CodeUp1021_1040;

import java.util.Scanner;

public class CodeUp1034 {
    //8진수 정수 1개 입력받아 10진수 출력
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String octalNum = sc.next();
        System.out.println(Integer.parseInt(octalNum,8));
    }
}
