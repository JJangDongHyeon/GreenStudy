package com.green.day6.ch3;

import java.util.Scanner;

//p. 117
public class OperatorEx25 {
        public static void main(String[] args){
//            String str = "abcdefg";
//            System.out.println(str.charAt(0));
//            System.out.println(str.charAt(1));
//            System.out.println(str.charAt(2));
//            System.out.println(str.charAt(3));
//            System.out.println(str.charAt(4));
//            System.out.println(str.charAt(5));
//            System.out.println(str.charAt(6));
//            charAt(2); 문자열에서 해당되는 값 출력
            Scanner scan = new Scanner(System.in);
            char ch = ' ';
            System.out.print("문자를 하나 입력하세요 >> ");
            String input = scan.nextLine();
            ch = input.charAt(0);
            if('0' <= ch && ch <= '9') { //0~9      or을 주면 무엇이오든 true가 떠서 and 씀
                                        // char '0' 하면 아스키 코드로 변경되어 해석됨
                                            // 그래서 48번~57번으로 해석되니까 범위 지정 가능
                System.out.println("입력하신 문자는 숫자입니다.");
            } else if('a' <= ch && ch <= 'z') {
                System.out.println("입력하신 문자는 소문자입니다.");
            } else if('A' <= ch && ch <= 'Z') {
                System.out.println("입력하신 문자는 대문자입니다.");
            }
            System.out.println("-- 끝 --");
            //문자열 > 문자배열
            //{'h' , 'e' , 'l' , 'l' , 'o'}
        }
}
