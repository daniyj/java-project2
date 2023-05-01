package com.example.javaproject2.javaproject2.codeup.e1000.CodeUp1061_1080;

import java.util.Scanner;

public class CodeUp1075 {
    //정수 1개 입력받아 카운트다운 출력하기2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num > 0){
            System.out.println(--num);
        }
    }
}
