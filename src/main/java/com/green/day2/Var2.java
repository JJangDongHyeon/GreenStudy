package com.green.day2;

public class Var2 {
    int globalnum;//전역 변수 전역변수는 초기화를 안해도 디폴트값이 있음.
    public static void main(String[] args){
        //지역 변수 지역변수는 초기화 무조건 필수
        //변수 선언과 동시에 초기화
        int num=10, num2=11, num3;
        num3=num+num2;
        //num3= 10 +11  num3= 21  순서.
        System.out.println(num3);
//쓰기는 값을 변경  읽기는 값을 가져오는 것
        num3=num3+3; //num3=21+3  num3=24;
        //변수의 값이 변하려면 대입연산자가 필요함 (유일하게 ++ 제외)
        System.out.println(num3);

        num3++;
        System.out.println(num3);


    }
}
