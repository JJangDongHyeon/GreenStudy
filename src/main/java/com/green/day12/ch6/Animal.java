package com.green.day12.ch6;

public class Animal {
    public void run() {
        System.out.println("이건 동물이다");
    }
    int val(int a, int b){
       return a+b;
    }

}

class Bird extends Animal {
    public void run() {
        System.out.println("이거는 새다.");
    }
    int val(int a, int b){
        return a-b;
    }
}

class Fish extends Animal {
    public void run() {
        System.out.println("물고기는 헤엄친다.");
    }

    int val(int a, int b) {
        return a * b;
    }
}





