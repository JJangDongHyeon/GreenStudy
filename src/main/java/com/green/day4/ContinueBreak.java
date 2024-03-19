package com.green.day4;

import java.sql.SQLOutput;

public class ContinueBreak {
    public static void main(String[] args){
        //continue , break 둘 다 반복문 안에서 사용 가능
        //continue > skip 에 가까움
        //break > stop 에 가까움
    for(int i = 0 ; i < 10 ; i++){
        System.out.println(i);
    }
        System.out.println("---------------------break");
    for(int i = 0; i < 10 ; i++) {
        if( i == 5 ) { break; }
        System.out.println(i);
    }
        System.out.println("---------------------continue");
        for(int i = 0; i < 10 ; i++) {
            if( i == 5 ) { continue; } //continue는 밑에 코드가 실행 안됐으면 좋겠다 할 때 사용
            System.out.println(i);

        }








    }
}
