package com.example.javaproject2.javaproject2.codeup.e1000.CodeUp1061_1080;

import java.util.Scanner;

public class CodeUp1071 {
    //0 입력될 때까지 무한 출력하기1(자바에는 goto문이 없다.)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //for문
        for (;;) {
            int num = sc.nextInt();
            if (num == 0)
                break;
            System.out.println(num);
    }
        //while문
//        while (true) {
//            int num = sc.nextInt();
//            if (num == 0)
//                break;
//
//            System.out.println(num);
//        }
    }
}
