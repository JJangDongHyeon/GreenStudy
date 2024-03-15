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

        r1=10>=10;//10은 10보다 이상이냐?
        System.out.println(r1);

        r1=10<=10; //10은 10보다 이하이냐?
        System.out.println(r1);

        r1=10==10;//10은 10이랑 같냐?
        System.out.println(r1);

        r1=10!=10; //10은 10과 다르냐? >같으니까 false로 뜸
        System.out.println(r1);
    }
}
