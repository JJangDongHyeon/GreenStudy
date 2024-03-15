package com.green.day2;

public class CompOpertator {

    public static void main(String[] args){
        //정수형 데이터 타입인 int형
        //불린형, true, false 값만 가질 수 있는 데이터 타입
        boolean b1= true;
        boolean b2=false;
        //boolean b3= 32; 오류

        boolean r1 =10>9; // 10이 9보다 초과이냐?
        System.out.println(r1);

        r1=10<9; //10이 9보다 미만이냐?
        System.out.println(r1);

        r1=10>=9;
        System.out.println(r1);
    }
}
