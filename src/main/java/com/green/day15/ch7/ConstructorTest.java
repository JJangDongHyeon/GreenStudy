package com.green.day15.ch7;

public class ConstructorTest {
    public static void main(String[] args) {

    }
}

class Animal{
    int age;

    Animal(int age){
        super();
        this.age = age;
    }

    Animal(){

    }

}

class Tiger extends Animal{
    String name;

    Tiger(){

    }

    Tiger(int age){
        super(age);
    }


    Tiger(int age , String name){
        super(age);
    }

}