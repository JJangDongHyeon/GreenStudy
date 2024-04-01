package com.green.day13.ch6;

public class PrimitiveRefEx {
    public static void main(String[] args) {
        int num = 5;

        Numbox nb = new Numbox();
        nb.num = 10;

        chanegeNum(num);
        //void , 같은 클래스 안에 존재, static , 메소드명:changeNum , 파라미터 정수값 1개
        System.out.println("num: " + num);

        changeNum(nb);
        System.out.println("nb.num: " + nb.num);
    }

    public static void chanegeNum(int num){
        num = 100; //중괄호 벗어나서 사라짐
        }

    public static void changeNum(Numbox n){
//        n = new Numbox();
        n.num=100; //받아온 주소값의 num변수에 값을 넣음.
    }
    }



class Numbox{
    int num;
}