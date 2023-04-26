package com.example.javaproject2.javaproject2.week2.day3;

public class MinuteSecond {
    public static void main(String[] args) {
        //실습 분초구하기
        int seconds = 239;
        int minute = seconds / 60; //분을 구함
        int remainSeconds = seconds % 60; //남은 초를 구함
        System.out.printf("%d분 %d초",minute,remainSeconds);
    }
}
