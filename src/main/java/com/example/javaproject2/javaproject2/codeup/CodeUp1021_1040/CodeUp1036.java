package com.example.javaproject2.javaproject2.codeup.CodeUp1021_1040;

import java.util.Scanner;

public class CodeUp1036 {
    //영문자 1개 입력받아 아스키 코드표의 10진수로 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpa = sc.nextLine().charAt(0);
        System.out.printf("%d",(int)alpa);
    }
}
