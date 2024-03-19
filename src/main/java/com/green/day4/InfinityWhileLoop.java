package com.green.day4;

import java.util.Scanner;

public class InfinityWhileLoop {
    public static void main(String[] args){

            Scanner scan= new Scanner(System.in);
            int input = 0; //while 과 if 를쓰면 dowhile을 쓸 필요가 없다.

            while(true) {
                System.out.print("숫자를 입력해 주세요. (종료:0) >> ");
                input = scan.nextInt();
               if(input == 0){


                break;
               }
            }
            System.out.println("ㄲㄲㄲㄲㄲㄲㄲㄲ끄ㅡㅡㅡㅡㅡㅡㅡㅌㅌㅌㅌㅌㅌㅌㅌㅌ");









        }
}
