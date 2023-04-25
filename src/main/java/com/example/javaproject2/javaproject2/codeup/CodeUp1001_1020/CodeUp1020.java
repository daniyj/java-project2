package com.example.javaproject2.javaproject2.codeup.CodeUp1001_1020;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        //주민번호 123456-123456 입력받아 하이픈없이 이어출력하기 123456123456
        Scanner sc = new Scanner(System.in);
//        String residentNum = sc.next();
//        String[] residentNumArr = residentNum.split("\\-");
//
//        System.out.printf("%s%s",residentNumArr[0],residentNumArr[1]);

        //substring으로도 해결가능
        String residentNum2 = sc.nextLine();
        String firstNum = residentNum2.substring(0,6);
        String secondNum = residentNum2.substring(7);
        System.out.printf("%s%s",firstNum,secondNum);

    }
}
