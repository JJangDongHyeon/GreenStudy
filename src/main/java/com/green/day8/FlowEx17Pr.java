package com.green.day8;

public class FlowEx17Pr {
    public static void main(String[] args) {
        int range = 1000;
        int sum = 0;
        for(int i = 1 ; i < range ; i++){
            if (i%3==0 || i%5 == 0){
                sum+=i;
            }

        }
        System.out.printf("%d미만의 자연수에서 3과 5의 배수의 합:%d" ,range , sum );
    }
    }
//        10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
//        1000미만의 자연수에서 3,5의 배수의 총합을 구하라.







 /*
        Scanner를 이용하여 정수 입력
        가이드 내용 "*을 출력할 라인의 수를 입력하세요."

        만약 정수값이 3이라면
        __*
        _**
        ***
         */