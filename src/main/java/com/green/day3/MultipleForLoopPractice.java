package com.green.day3;

public class MultipleForLoopPractice {
    public static void main(String[] args){
        for(int i = 1 ; i < 10 ; i++) {
            for (int a = 1; a < 10; a++) {
                System.out.printf("%d x %d =%d\n", i , a , (i * a));
            }
                System.out.println("-----------------");
        }
    }
}
