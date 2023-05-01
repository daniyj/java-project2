package com.example.javaproject2.javaproject2.week3;

public class ForLoopReverse {
    public static void main(String[] args) {

        for(int i =10;i >0;i--){
//            System.out.println(i);
            System.out.printf("%d ",i);
        }

        // 틀린케이스 i++이므로 i는 무한대로 증가하여 무한루프.
        for(int i =10;i >0;i--){
            System.out.println(i);

        }
    }
}
