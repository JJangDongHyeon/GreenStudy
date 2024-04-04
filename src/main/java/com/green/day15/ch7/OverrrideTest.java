package com.green.day15.ch7;

public class OverrrideTest {
    public static void main(String[] args) {
        Parent p = new Parent(55);
        System.out.println(p.age);
        Child child = new Child();
//        child.attack(); //메소드 자식먼저 찾고 있으면 자식꺼 쓰고 없으면 다시 위로 올라가서 부모님꺼에서 찾음.
        child.doubleattack();
    }
}

class Parent {
    int age;
   Parent(int age){
//       super();기본으로 있음
      this.age = age;
   }


     void attack() {
        System.out.println("부모가 적을 공격한다.");
    }

     void defense(){
         System.out.println("부모가 적의 공격을 방어한다.");
     }
}


class Child extends Parent{
    int mzPower;

        Child(){
         super(123);
        }

    @Override //애노테이션 Annotation //오버라이드 했는지 안했는지 알려줌
    void attack() {
        System.out.println("자식이 적을 공격한다.");
        super.attack();
    }

    void doubleattack(){
            this.defense();
            super.defense(); //지금은 this와 super가 차이가 없지만 super는 오버로딩떄는 차이가 있따.(super)는 바로 부모의 것을 사용
        System.out.println("-------");
            this.attack();
            super.attack();
            attack(); //this.attack();rhk
    }
}
