package com.green.day14.ch7;
//p.316 Is-A , Has-A 관계
public class CarTest {
    public static void main(String[] args) {

    }
}

//아반떼
//차  /차와 아반떼는 Is-A 관계 (상속관계)

//차
//스피커 /차와 스피커의 관계는 Has-A 관계 (포함관계)

class Car {
    int cc;
    String company;
    Speaker speaker;//Has-A 관계 (포함하다)

    void drive(){
        System.out.println("자동차가 붕붕");
    }
}

class Avante extends Car {

}

class Speaker{
    int volume;

    void play(){
        System.out.println("음악이 흘러나온다.");
    }
}
