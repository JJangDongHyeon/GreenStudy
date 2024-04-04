package com.green.practice.day16;

public class rrr {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal aniDog = new Dog();
        Animal aniCat = new Cat();
        Animal aniBullDog = new Bulldog();

//        Dog dog = (Dog)animal;
//       animal.sleep();
        animal.dosleep(aniDog);//각각동물들이 자고 달리는 애들이 있으면 뛰게
//        animal.dosleep(aniCat);
//        animal.dosleep(aniBullDog);
    }

}

class Animal {
    void sleep() {
        System.out.println("동물은 잔다.");
    }

    void dosleep(Animal ani){
        ani.sleep();
        if (ani instanceof Dog) {
            Dog dog = (Dog) ani;
            dog.run();
        }
        if (ani instanceof Cat) {
            Cat cat = (Cat) ani;
            cat.run();
        }
    }
}

class Dog extends Animal{
    void sleep(){
        System.out.println("강아지는 잔다.");
    }
    void run(){
        System.out.println("강아지 달린다.");
    }

}

class Cat extends Animal{
    void sleep(){
        System.out.println("고양이 잔다.");
    }
    void run(){
        System.out.println("고양이 달린다.");
    }
}

class Bulldog extends Dog{
    void sleep(){
        System.out.println("불독 달린다.");
    }
    void run(){
        System.out.println("불독 달린다.");
    }
}