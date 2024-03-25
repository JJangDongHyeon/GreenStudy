package com.green.day8;

import java.util.Scanner;

public class FlowEx11Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("당신의 주민번호를 입력하세요. (format: 000000-0000000) >> ");
        String id = scan.nextLine();
        char genderVal = id.charAt(7);
        String gender = "남";
        String direction = "전";
        switch(genderVal) {
            default:
                System.out.println("유효하지않은 주민번호입니다.");
                break;
            case '1': case '3':
                switch (genderVal){
                    case '3': direction = "후";
                }
                System.out.printf("당신은 2000년 이%s에 출생한 %s자입니다." , direction , gender);
                break;
            case '2': case '4':
                gender = "여";
                switch (genderVal){
                    case '4': direction = "후";
                }
                System.out.printf("당신은 2000년 이%s에 출생한 %자입니다." , direction , gender);
                break;


        }
    }
}
