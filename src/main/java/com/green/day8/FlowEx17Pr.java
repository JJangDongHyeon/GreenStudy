package com.green.day8;

public class FlowEx17Pr {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i ++) {
            for (int z = 0; z <= 5; z++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
 /*
        Scanner를 이용하여 정수 입력
        가이드 내용 "*을 출력할 라인의 수를 입력하세요."

        만약 정수값이 3이라면
        __*
        _**
        ***
         */