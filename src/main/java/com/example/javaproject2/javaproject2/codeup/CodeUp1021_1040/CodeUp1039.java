package com.example.javaproject2.javaproject2.codeup.CodeUp1021_1040;

import java.util.Scanner;

public class CodeUp1039 {
    //정수 2개 입력받아 합 출력(int범위 넘어가서 long형 이용)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num1 = sc.nextLong();
        Long num2 = sc.nextLong();
        System.out.printf("%d",num1 + num2);
    }
}
