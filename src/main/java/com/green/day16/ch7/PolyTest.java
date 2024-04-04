package com.green.day16.ch7;
/*
<다형성 대전제 3가지>
1. 부모 타입의 변수는 자식 객체 주소값 담을 수 있다. (자동형변환)
2. 자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
3. 타입은 알고 있는 메소드만 호출할 수 있고 실행되는 기준은 객체 기준이다.

 */
public class PolyTest {
    public static void main(String[] args) {
        //1. 부모 타입의 변수는 자식 객체 주소값 담을 수 있다. (자동형변환)
        Animal animal1_1 = new Dog(); //레퍼런스끼리의 형 변환은 상속끼리만 가능함
        Animal animal1_2 = new BullDog();//BullDog 이 Animal 타입으로 형변환
        Animal animal1_3 = new Cat();
        Dog dog_1 = new BullDog();
        //2.자식 타입의 변수는 부모 객체 주소값 담을 수 없다.
//        Dog dog = new Animal(); 컴파일 에러
//        Dog dog_2 = (Dog)new Animal(); 형변환 에러
        System.out.println("---종료---");
        /*자식이 부모보다 더 많은 양을 가지고 있기 때문에
        부모는 자식의 타입을 생성할수 있지만
        자식의 타입으로 부모를 생성할 수는 없다.
        자식이 더 많은 양을 가지고 있기 때문에 ... 자식에겐 있지만 부모에겐 없는게 있기때문

         */
        //3. 타입은 알고 있는 메소드만 호출할 수 있고 실행되는 기준은 객체 기준이다.
        animal1_1.crying();
//        animal1_1.sleep();
        Dog dog_2 = (Dog) animal1_1;
        dog_2.sleep();
        dog_1.sleep();      //BullDog은 Dog에게 상속을 받아서 Dog가 sleep을 알고있으니 BullDog도 sleep을 안다.
//        animal1_2.sleep(); // Animal은 sleep을 몰라서 호출 불가  Animal에서 BullDog의 sleep을 찾는다는 느낌
        Dog Dog_3 = (Dog)animal1_2; //BullDog이라는 정체성은 사라지지 않음.
        Dog_3.sleep();

    }
}
  class Animal{
    void crying(){ System.out.println("동물...운다"); }

}

class Dog extends Animal{
    void crying() { System.out.print("강아지가...운다"); }
    void sleep()  { System.out.println("강아지가...잔다"); }
}

class BullDog extends Dog {
    void crying() { System.out.print("불독이....운다"); }
    void sleep()  { System.out.println("불독이...잔다"); }
}

class Cat extends Animal{
    void crying() { System.out.println("고양이가....운다"); }
}
