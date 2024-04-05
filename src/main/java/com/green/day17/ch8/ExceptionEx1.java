package com.green.day17.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try{
            System.out.println("시작");
            int a = 10;
            int b = 20;
            int c = 10 / 0; //예외가 생길것을 잡음
            throw new Exception();
        } catch (ArithmeticException e){ //수학적 예외
            System.out.println("수학적 예외 발생!!!!");
        } catch (Exception s){//모든 예외를 잡기 때문에 catch가 여러개 있을 때 맨 위에 있으면 의미없음
            s.printStackTrace();//오류 사유 알려줌
            System.out.println("예외 발생!!!");
        } finally {//옵션 .예외가 텨져도 안텨져도 무조건!!!! 발생되는 친구
            System.out.println("finally");
        }
        System.out.println("---종료---");
    }
}
