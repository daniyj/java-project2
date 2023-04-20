package com.example.javaproject2.javaproject2.week1;

public class FloatFormatEx {
    public static void main(String[] args) {
        System.out.printf("%d",0.5); //에러 출력
        //에러 메시지에서 Double / Float 이 다름. 0.5는 기본실수, double/0.5f는 float
        //Java의 기본 실수 표현은 Double, Float는 f(F)를 붙여 표현
    }
}
