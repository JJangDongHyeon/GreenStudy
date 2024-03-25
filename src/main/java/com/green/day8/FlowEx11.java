package com.green.day8;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("주민등록번호를 입력해주세요 >> 000000-0000000");
        String num = scan.nextLine();
        char numVal = num.charAt(7);
        String result = switch (numVal){
          case '1'  -> "당신은 2000년 이전에 출생한 남자입니다.";
          case '2'  -> "당신은 2000년 이전에 출생한 여자입니다.";
          case '3'  -> "당신은 2000년 이후에 출생한 남자입니다.";
          case '4'  -> "당신은 2000년 이후에 출생한 여자입니다.";
            default -> "유효하지않은 주민번호입니다.";

        };
        System.out.println(result);
    }
}
        /*
        1, 3 > 남
        2, 4 > 여
        Scanner 객체
        '1' > "당신은 2000년 이전에 출생한 남자입니다."
        '3' > "당신은 2000년 이후에 출생한 남자입니다."
        '2' > "당신은 2000년 이전에 출생한 여자입니다."
        '4' > "당신은 2000년 이후에 출생한 여자입니다."
        이외 값 > "유요하지않은 주민번호입니다." 출력
        switch만 사용 가능

         */
