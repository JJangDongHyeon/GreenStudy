package com.green.day15.ch7;

public class AbstractTest {
    public static void main(String[] args) {
//        Dog d = new Dog();  추상 클래스는 객체화 불가능
    }
}

abstract class Dog{ //추상 클래스 ,상속용(부모용)으로만 사용, 객체화 안쓸때

}
abstract class Cat{
    int age;
    //추상 메소드
    //추상메소드가 있으면 무조건 추상 클래스가 되어야함
   abstract void crying();

   void jump(){
       System.out.println("점프");
   }

}
class KoreaShortcat extends Cat{
    @Override
    void crying(){
        System.out.println("야옹");
    }
}

class AmericanShortCat extends Cat{
    @Override
    void crying() {
        System.out.println("미유");
    }
}