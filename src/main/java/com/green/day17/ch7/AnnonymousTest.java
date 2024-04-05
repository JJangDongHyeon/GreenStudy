package com.green.day17.ch7;


public class AnnonymousTest {
    public static void main(String[] args) {
//클래스 안만들고
        Object obj = new Car();
        Object obj2 = new Object(){
            public String toString(){
                return "익명클래스";
            }
        };
        System.out.println(obj);
        System.out.println(obj2);
    }
}

class Car {
    void drive(){
        System.out.println("자동차가 씽씽");
    }
    public String toString(){
        return "Car";
    }
}