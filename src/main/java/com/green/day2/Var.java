package com.green.day2;

public class Var {
    public static void main(String[] args){
        int num; //변수 선언 , 값을 담기위해
        num = 10; // 대입 연산자, 오른쪽에 있는 값을 복사하여 왼쪽에 준다.
        System.out.println(num);

        num=20; //리터럴
        System.out.println(num);

        num=20+30;
        System.out.println(num);

        num=10*40;
        System.out.println(num);

        num=10/2;
        System.out.println(num);

        num=10/3;
        System.out.println(num);

        num=10-3;
        System.out.println(num);

        num=10%2; //% 모드
        System.out.println(num);

        num=9%2;
        System.out.println(num);


    }
}
/*void 리턴타입
main 메소드명
(String[] args) 매개변수
int 데이터 타입
num 변수명(변수명은 숫자로 시작 ㄴㄴ, 특수기호 _&만 가능 , 중간에 띄어쓰기 x)
 */