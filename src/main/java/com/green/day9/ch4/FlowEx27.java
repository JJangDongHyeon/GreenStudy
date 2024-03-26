package com.green.day9.ch4;

import java.util.Scanner;

//p.172
public class FlowEx27 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        while(true){
            System.out.println("합계를 구할 숫자를 입력하세요. (종료:0) >>");
            int input = scan.nextInt();
            sum+=input;
            if(input==0){
                scan.close();
                System.out.println("최종합계:" + sum);
                break;}
                System.out.println("현재 합계: " + sum);
        }
        /*

        가이드 출력: "합계를 구할 숫자를 입력하세요. (종료: 0) >> "
        가이드 출력이 계쏙된다. 0을 입력할때 까지....
        입력한 모든 숫자를 더한 값을 마지막에 출력한다.
         */

    }
}
