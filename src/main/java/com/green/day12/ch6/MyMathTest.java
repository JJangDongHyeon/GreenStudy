package com.green.day12.ch6;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath(); //스태틱이 안붙으면 사용하기위해 객체화를 무조건 시켜야함 (add메소드를 사용하기 위함)
        myMath.add(10, 20);
        myMath.add(100, 200);
        myMath.minus(100,50); // 100 - 50 = 50
        System.out.println(myMath.returnAdd(100, 50));
        int result = myMath.returnAdd(10 , 600);
        System.out.println(result);

        String n1 = "d";
        System.out.println(myMath.print(n1));

        System.out.println(myMath.mm);
        myMath.mm = 5000;
        System.out.println(myMath.mm);
    }

}
    class MyMath{
    //리턴 메소드 , void 메소드 크게 두가지로 나뉨 (공식용어 XXXXXXX)
     // 리턴타입 메소드명 파라미터(매개변수) > 메소드 선언부
        //{} 부분은 > 메소드 구현부
        void add ( int n1 , int n2){  //void 메소드에 return 안적어도 자동으로 넣어줌
            System.out.printf("%d + %d = %d\n" , n1 , n2 , n1 + n2);
        }
        void minus( int n1 , int n2){//void 메소드에서는 return옆에 값을 적을 수 없음
            System.out.printf("%d - %d = %d\n" , n1 , n2, n1 - n2);
        }
        //내가 결과로 던지는 타입
        int returnAdd(int n1 , int n2 ){
            if(n1 > 10) {
                return n1 + n2;
            }
            return 110;             //void가 아닌 메소드에서는 return 옆에 던질 값을 적어야함
        }
           String print(String n1){
            n1 = "아아 프린트 테스트";
            return n1;
        }
        int mm = 0;
    }
