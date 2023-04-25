package com.example.javaproject2.javaproject2.week2.day2;

import java.util.Arrays;

public class ArrayDefineAndPrint {
    public static void main(String[] args) {
        //배열 선언
        int[] iArr = new int[3];
        System.out.println("iArr = " + iArr);

        //배열 값 넣기
        iArr[0] = 2;
        iArr[1] = 4;
        iArr[2] = 7;

        //배열 출력
        System.out.println(Arrays.toString(iArr));
    }
}
