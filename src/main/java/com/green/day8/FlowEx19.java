package com.green.day8;

public class FlowEx19 {
    public static void main(String[] args) {
        for (int i = 1 ; i < 4; i++){
            for(int z = 1 ; z < 4; z++){
                for (int x = 1 ; x < 4; x++){
                    System.out.printf("%d%d%d\n",i,z,x );
                }
            }
        }
    }
}
        /*
        반복문을 활용하여 이렇게 출력해 주세요.
        111
        112
        113
        121
        122
        123
        131
        132
        133
        211
        212
        213
        ...
        333
         */
