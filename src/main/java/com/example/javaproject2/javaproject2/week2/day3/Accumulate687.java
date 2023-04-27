package com.example.javaproject2.javaproject2.week2.day3;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        answer = answer + (num % 10); // 나머지 먼저 구하고
        num = num / 10; // 그 뒤에 몫 구해야 한다.
        System.out.printf("num:%d, answer:%d\n",num, answer);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.printf("num:%d, answer:%d\n",num, answer);

        answer = answer + (num % 10);
        num = num / 10;
        System.out.printf("num:%d, answer:%d\n",num, answer);

        // 반복문으로 만들기
//        while(num > 0){
//            answer = answer + (num % 10);
//            num = num / 10;
//            System.out.printf("num:%d, answer:%d",num, answer);
//        }
    }
}
