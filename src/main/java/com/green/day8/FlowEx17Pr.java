package com.green.day8;

public class FlowEx17Pr {
    public static void main(String[] args) {
        int star = 10;
        for(int i = 1 ; i <= star ; i ++){
           for(int z =star-i ; z > 0  ; z--){
               System.out.print("_");
           }for(int x=0; x<i ; x++){
                System.out.print("*");
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