package com.green.day9.ch5;

public class ArrayStudy {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20 , n3 = 30 , n4 = 40 , n5 = 50;

        int[] numArr = new int[10] ;
        System.out.println(numArr[0]);
        numArr[0] = 11;
        System.out.println(numArr[0]);
//        System.out.println("numArr[11]: " +  numArr[11]); 빈방을 출력할수 없으니 에러가 뜸


        int[] numArr2 = { 10 , 20 , 30 , 40 , 50 };
        System.out.println(numArr2[1]);
        numArr2[1] = 25;
        System.out.println(numArr2[1]);

        int[] numArr3 = new int[] { 10 , 20 , 30 , 40 , 50 };

        String[] strArr = new String[5];
        System.out.println("strArr[0]: " + strArr[0]);
        System.out.println("strArr[1]: " + strArr[1]);
        /*
        배열을 사용하는 이유? 같은 타입의 여러 값을 편하게 쓰기/읽기 하기 위해서
        배열의 특징? 크기는 고정(생성후 크기 변경 X)
        index로 사용한다.
        index는 0번부터 시작된다.
        마지막 index값을 배열크기 -1읻.
        for문이랑 궁합이 굉장하다.
         */
    }

}
