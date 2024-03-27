package com.green.day9.ch5;

public class MissionArray1 {
    public static void main(String[] args){
        int []numArr = {10, 20, 30, 40};
        int lastindex = numArr.length-1;
        for(int i = 0  ; i < numArr.length ; i++ ){
            System.out.print(numArr[i]);
            System.out.print(i < lastindex ? ", " : "");
        }
        for(int i = 0  ; i < numArr.length ; i++ ){
            System.out.printf(", %d" , numArr[i]);
        }

        /*
        for문 활용
        10, 20 ,30, 40, (출력)
         */







    }
}
