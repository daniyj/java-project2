package com.example.javaproject2.javaproject2.week2.day3;

import java.util.Arrays;

public class SwapEx {

    public static void main(String[] args) {
        //실습 - 배열 인덱스간에 값 바꾸기
        int[] arr = {2,1,4,8,7,6};

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
