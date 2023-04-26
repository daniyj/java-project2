package com.example.javaproject2.javaproject2.week2.day3;

import java.util.Arrays;

public class ArrayLine {
    //행 번호를 넣으면 그 행을 1로 값을 넣어주는 static method
    // 캡처해놨음
//    public static void inputRow(int lineNum, int arr[][]){
//        for(int i=0;i<arr.length;i++){
//            arr[lineNum][i] = 0;
//        }
//    }
//
//    public static void inputCol(int rowNum, int arr[][]){
//        for(int i=0;i<arr.length;i++){
//            arr[i][rowNum] = 0;
//        }
//    }
    public static void main(String[] args) {
        //실습 가로 한 줄,세로 한 줄 값 넣기
        int[][] arr = new int[3][3];

        arr[1][0] = 1;
        arr[1][1] = 1;
        arr[1][2] = 1;

        System.out.println(Arrays.toString(arr));

        arr[0][1] = 1;
        arr[1][1] = 1;
        arr[2][1] = 1;

        System.out.println(Arrays.toString(arr));


    }
}
