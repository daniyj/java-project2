package com.example.javaproject2.javaproject2.codeup.CodeUp1041_1060;

import java.util.Scanner;

public class CodeUp1041 {
    //문자 한 개 입력받아 다음 문자 출력(아스키표의 다음 순서 a->b)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cVal = sc.next().charAt(0);
        System.out.printf("%c",cVal + 1);
    }
}
