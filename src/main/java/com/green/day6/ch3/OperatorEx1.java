package com.green.day6.ch3;
//p.93~
public class OperatorEx1 {
    public static void main(String[] args){
        int n1 = 3 , n2 = 5;

        int r1 = (-n1) - n2 ;
        System.out.println("r1 : " + r1);

        int r2 = n1 + n2 * n1 / n2;
        System.out.println("r2: " + r2);

        int r3 = n1 + ((n2 * n1) / n2);
        System.out.println("r3: " + r3);

        System.out.println("-------------------------------------");

        //증감 연산자
        int i = 5,  z = 0;
        i++ ;  //쓰기만
        System.out.println("i: " + i);

        i = 5;
        ++i;  //쓰기만
        System.out.println("i: " + i);

        i = 5;
        z = i++; //읽기와 쓰기 다 할땐 읽기부터 먼저 처리함 읽기 처리하고 쓰기 가동
        System.out.printf("i: %d, z: %d\n", i, z);

        i = 5;
        z = 0;
                //읽기란 데이터 넘기기
        z = ++i; //쓰기 처리먼저하고 읽기
        System.out.printf("i: %d, z: %d\n", i, z);

        System.out.println("-----------------");
        int k = 10;
        System.out.println(k++); //10
        System.out.println(++k); //12
        System.out.println(++k); //13
        System.out.println(k++); //13
        System.out.println(k);  //14 k는 계속 올라가는 중임 출력만 이런것
    }
}
