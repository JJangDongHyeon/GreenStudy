package com.green.day9.ch5;

public class MissionArray2 {
    public static void main(String[] args){
        /*
        정수값 10개 저장할 수 있는 배열 새엇ㅇ
        10칸 초기화 하는데 10~30 랜덤값 값이 세팅될 수 있도록 해주세요.
        (중복 허용)
         */
        int[] newArray = new int[10];
        for ( int i = 0 ; i < newArray.length ; i++){
            int random = (int)(Math.random()*21)+10;
            newArray[i] = random;
        }
        for ( int i = 0 ; i < newArray.length ; i++){
            System.out.printf("newArray[%d]: %d\n", i , newArray[i] );
        }

    }
}
