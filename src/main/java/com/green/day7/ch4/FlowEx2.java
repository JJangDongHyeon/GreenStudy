package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args){
        /*
        Scanner 객체를 이용하여 콘솔에서 문자열값을 가져온다.
        받은 문자열을 숫자로 파싱한다.
        파싱한 숫자가 0이라면 >> 입력하신 숫자는 0입니다. (출력)
        0이 아니라면 >> 입력하신 숫자는 0이 아닙니다.
                        입력하신 숫자는 ?입니다. (출력)
//         */
//        굳이 파싱 안써도 됨 예시를 든 것
//        Scanner scan = new Scanner(System.in);
//        System.out.println("숫자를 입력해주세요 >>");
//        String input = scan.nextLine();
//        String result = switch (input){
//            case "0" -> "입력하신 숫자는 0입니다.";
//            default -> String.format("입력하신 숫자는 0이 아닙니다. " +
//                                     "\n입력하신 숫자는 %s입니다.\n" ,input);
//        };
//        System.out.println(result);
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 >>");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        String result = switch (num){
            case 0 -> "입력하신 숫자는 0입니다.";
            default -> String.format("입력하신 숫자는 0이 아닙니다. " +
                    "\n입력하신 숫자는 %d입니다.\n" ,num);
        };
        System.out.println(result);
















  //printf 와 String.format은 인풋과 아웃풋의 목적이 다름

//        if (num == 0) {
//            System.out.println("입력하신 숫자는 0입니다.");
//        } else {
//            System.out.println("입력하신 숫자는 0이 아닙니다.");
//            System.out.printf("입력하신 숫자는 %d입니다.\n", num);
//        }
//
//        System.out.println("-- 종료 --");





//        int num = 1;
//        while(num != 0){
//            System.out.println("숫자를 입력해주세요 >>");
//            String input = scan.nextLine();
//            num = Integer.parseInt(input);
//            System.out.printf("입력하신 숫자는 %d입니다\n" , num);
//            System.out.println(num == 0 ? "---종료합니다---" : "입력하신 숫자는 0이 아닙니다.");
//        }













    }
}
