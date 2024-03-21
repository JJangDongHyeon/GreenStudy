package com.green.day6.ch3;
//p. 96
public class OperatorEx4 {
    public static void main(String[] args){
        int i = -10;
        i = +i;  //+ 부호 연산자는 무쓸모임!!!!!!!!!!!!!
        System.out.println("i: " + i);

        i = -10;
        i = -i;
        System.out.println("i: " + i);


    }
}
