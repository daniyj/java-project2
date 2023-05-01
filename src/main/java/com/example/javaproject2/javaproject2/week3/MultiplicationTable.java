package com.example.javaproject2.javaproject2.week3;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 2단 출력
//        for(int i = 1;i <= 9;i++){
//            System.out.printf("%d\n", 2 * i);
//        }

        //2~4단 출력
//        for(int j = 2;j < 5; j++){
//            for (int i = 1; i <= 9; i++) {
//                System.out.printf("%d * %d = %d\n", j, i, j * i);
//            }
//        }
        //[도전] 특정 단 선택해서 출력
        int [] dan = {2, 4, 8, 9};
        for (int j=0; j < dan.length; j++){
            for(int i = 1;i <= 9; i++){
                System.out.printf("%d * %d = %d\n",dan[j], i, j, i * dan[j]);
            }
            System.out.println("----------");
        }
    }//main
}
