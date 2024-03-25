package com.green.day8;

public class FlowEx26 {
    public static void main(String[] args) {
        /*
        1~ 1000
        값들을 계속 더할건데 더한값이 100미만인 index값이 몇인지 구하시오.

         */
        int i = 0;
        int sum = 0;
        while(true) {
            int result = sum + i +1;

            if(result > 104) {
                break;
            }
            sum += ++i;
        }
        System.out.println(i);
    }
}