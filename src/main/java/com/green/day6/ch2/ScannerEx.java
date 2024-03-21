package com.green.day6.ch2;

import java.util.Scanner;

public class ScannerEx {//p,41쪽
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력해주세요. >> ");
        String input = scan.nextLine(); //"123" > 123
//        int num = (int)input;  이거 안됨 레퍼런스와 프로머티브 타입 자체가 달라서 ㄴㄴ
        int num = Integer.parseInt(input);  //문자열을 인트로 바꾸고싶다할때 씀(문자열 안에 숫자만 이썽야 변경가능)
        System.out.println("num:" + num);
        System.out.println("num + 1: " + (num + 1));
    }
}
