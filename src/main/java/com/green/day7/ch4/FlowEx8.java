package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args){
        System.out.println("당신의 주민번호를 입력하세요.(000000-0000000) >>");
        /*
            1, 3 남자
            2, 4 여자
         Scanner 객체를 통해 주민번호를 입력받으시고
         주민번호를 확인하여 여자인지 남자인지 유효하지않은 주민번호인지 출력
         switch

       */
        Scanner scan = new Scanner(System.in);
        String numVal1 = scan.nextLine();
        char numVal2 = numVal1.charAt(7);
        String resultval2 = switch (numVal2){
          case '1' , '3' -> "당신은 남자";
          case '2' , '4' -> "당신은 여자";
          default    -> "유요하지않은 주민번호입니다.";
        };
        System.out.println(resultval2);
        }








//        if (resultVal1 > 4 || resultVal1 <1){
//            System.out.println("유효하지않은 주민번호입니다.");
//        } else{
//        String resultval2 = switch (resultVal1){
//          case 1 , 3 -> "남자";
//          default    -> "여자";
//        };
//        System.out.printf("당신은 %s입니다." , resultval2);
//        }























    }

