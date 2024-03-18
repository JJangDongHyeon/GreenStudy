package com.green.day2;

public class ConditionalOperator {
    public static void main(String[] args){
        //삼항식,조건식
        //식 ? true 일때: false 일떄;
        int num = (int) (Math.random() * 10) + 1;
//        String s;
        //s = num % 2 == 0 ? "짝" : "홀";
        System.out.print(num + "은(는)" + (num % 2 == 0 ? "짝수입니다." : "홀수입니다."));
        //System.out.print() ;

     }
}
