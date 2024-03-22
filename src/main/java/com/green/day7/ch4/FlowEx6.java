package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args){
        /*
        switch문으로 해결
        Scanner 객체를 사용하여 month(월) 값을 정수로 입력받는다.

        month 값이 3~5 라면 "현재의 계절은 봄입니다." (출력)
                  6~8 라면 "현재의 계절은 여름입니다." (출력)
                  9~11 라면 "현재의 계절은 가을입니다." (출력)
                  12, 1, 2 라면 "현재의 계절은 겨울입니다." (출력)
                  이외의 값은 "잘못입력하셨습니다." (출력)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("월을 입력해주세요 >>");
        int month = scan.nextInt();
        if(month < 1 || month > 12){
            System.out.println("다시 입력해주세요.");
        } else {
            String month2 = switch (month) {
                case 3, 4, 5   -> "봄";
                case 6, 7, 8   -> "여름";
                case 9, 10, 11 -> "가을";
                default        -> "겨울";
            };
            System.out.printf("현재의 계절은 %s입니다." , month2);
        }
        System.out.println("---ㄲㄲㄲㄲㄲㄲㄲ끝ㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌ---");









    }
}
