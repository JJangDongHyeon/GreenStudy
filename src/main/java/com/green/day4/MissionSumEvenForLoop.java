package com.green.day4;

public class MissionSumEvenForLoop {
    public static void main(String[] args){
        //1~100까지 짝수만 더한 값 출력
          int a=0;
        for(int i = 0 ; i < 101 ; i++) {
            if (i % 2 == 0) {
                a = a + i;
            }
        }
            System.out.print(a);













    }
}
