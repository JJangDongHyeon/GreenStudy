package com.green.day17.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try {
            throw new Exception("뭐 때문에 예외가 발생했음");
        } catch (Exception e){
            System.out.println("예외 발생: " + e.getMessage());
        }
        System.out.println("--종료--");
    }
}
