package com.green.day16.ch7;

public class PolyTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();
        Animal ani = new Animal();

//        dog = new BullDog();
        //이 메소드를 보고 알 수 있는 점.
        //void 타입 , 파라미터 1개씩 받음 ,static
        // 메소드 위치는 PolyTest2 , 메소드명 doCrying
        doCrying(dog); //각 동물이 울게하면됨 ,강아지가 잔다
        doCrying(bullDog); //각 동물이 울게하면됨 , 불독이 잔다.
        doCrying(cat); //각 동물이 울게하면됨


    }
    static void doCrying(Animal ani){
        ani.crying();
        // if ( ani instanceof Dog dog) {
        //dog.sleep();}
        if( ani instanceof Dog){  //  왼쪽이 instanceof 오른쪽으로 형변환이 되냐?
            Dog dog = (Dog) ani;
            dog.sleep();
        }

        }
    }
