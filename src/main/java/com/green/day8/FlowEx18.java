package com.green.day8;

public class FlowEx18 {
    public static void main(String[] args) {//마지막에 ------안나오게
        for (int i = 2 ; i < 10 ; i++){
            if(i>2){
                System.out.println("---");
            }
            for ( int x = 1 ; x < 10 ; x++){
                System.out.printf("%d x %d = %d\n", i , x , i * x);
            }
        }

        /*
        2~9단 구구단 출력
        2 x 1 = 2
        2 x 2 = 4
        .....
        2 x 9 = 18
        -----
        3 x 1 = 3

         */
    }
}
