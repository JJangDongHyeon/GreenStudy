package com.green.day14.ch6;
//p.294 매개변수 있는 생성자(오버로딩된 생성자), this를 배움.
public class CarTest {
    public static void main(String[] args) {
            Car c1 = new Car("White" , "auto" , 5);
            c1.color = "white";
        System.out.printf("c1.color: %s  c1.gearType: %s  \tc1.door: %s \n", c1.color ,c1.gearType ,c1.door);


            Car c2 = new Car("black" , "manual" , 3);
            c2.color = "black";
        System.out.printf("c2.color: %s  c2.gearType: %s  c2.door: %s \n", c2.color ,c2.gearType ,c2.door);

            Car c3 = new Car();
         System.out.printf("c3.color: %s  \tc3.gearType:%s  \tc3.door: %s \n", c3.color , c3.gearType ,c3.door);
        //red , manual , 5

            Car c4 = new Car(c2);//깊은 복사
            System.out.printf("c4.color: %s  c4.gearType: %s  c4.door: %s \n", c4.color ,c4.gearType ,c4.door);
                //black , manual , 3
    }
}

class Car{
    String color;
    String gearType;
    int door;

        Car(String color , String gearType , int door){
            this.color    = color;
            this.gearType = gearType;
            this.door     = door;
        }
        Car(){
            this("red","manual" , 5);//생성자 호출
//            this.color      = "red";
//            this.gearType   = "manual";
//            this.door       = 5;
            }

        Car(Car c2){ //깊은 복사
//            this.color    = c2.color ;
//            this.gearType = c2.gearType;
//            this.door     = c2.door;
              this(c2.color , c2.gearType ,c2.door);
        }

    void start() {

        System.out.println("차 시동을 건다.");
//            this("red","manual" , 5);//메소드에서는 생성자 호출 불가

    }

}
