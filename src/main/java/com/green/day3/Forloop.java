package com.green.day3;

public class Forloop {
    public static void main(String[] args){
        //       0       1       3          2
        //for( 초기화 ; 조건식 ; 증감식 ) { 반복코드 }
        // i 값 0 세팅 , 0<5 true > 반복코드 실행 > i증가 // 결국 i = 0 , 1 , 2 , 3 , 4 증가하며 총 5번 반복문 실행됨.
        for(int i=0 ; i<5 ; i++)
        {System.out.println("안녕");}

        for(int i = 5 ; i<11 ; i++)
        {System.out.println("Go");}

        for(int i = 5 ; i<11 ; i++)
        {
            System.out.println((i - 4)+ ".Hello");}

        for(int i=100; i > 96; i--) { //4번 반복
            System.out.println("Bye");}





    }
}
