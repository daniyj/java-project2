package com.example.javaproject2.javaproject2.codeup.CodeUp1021_1040;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        //시:분:초 입력받아 분만 출력
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] timeArr = time.split(":");

        System.out.println(Integer.parseInt(timeArr[1]));
    }
}
