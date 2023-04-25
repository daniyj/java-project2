package com.example.javaproject2.javaproject2.codeup.CodeUp1021_1040;

import java.util.Scanner;

public class CodeUp1035 {
    //16진수 입력받아 8진수 출력
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String HexaNum = sc.nextLine();

        System.out.printf("%o",Integer.parseInt(HexaNum,16));
    }
}
