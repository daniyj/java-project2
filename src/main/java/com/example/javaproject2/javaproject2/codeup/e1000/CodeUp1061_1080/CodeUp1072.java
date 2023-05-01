package com.example.javaproject2.javaproject2.codeup.e1000.CodeUp1061_1080;

import java.util.Scanner;

public class CodeUp1072 {
    //(ing...)정수 입력받아 계속 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr = new int[num];

        for(int i=0;i<num;i++){
            numArr[i] = sc.nextInt();
            System.out.println(numArr[i]);
        }

    }
}
