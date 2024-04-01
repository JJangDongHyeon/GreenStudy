package com.green.day13.ch6;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] intArr = { 10 , 20 }; //배열은 주소값을 가짐
//        int num = 1;
        System.out.printf("intArr[0]: %d, intArr[1]: %d\n", intArr[0] , intArr[1] );
//        changeNum(num);
//        System.out.println(num);
        change(intArr);

        System.out.printf("intArr[0]: %d, intArr[1]: %d\n", intArr[0] , intArr[1] ); //11 , 21
    }
    public static void change(int[] l){ //배열은 주소값을 가져서 중괄호 벗어나도 값이 안사라짐
        for(int i = 0 ; i < l.length ; i++){
            l[i]+=1;
        }
//    public static void changeNum(int num){
//            num = 100;
        }
    }

