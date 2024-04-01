package com.green.day13.ch6;

public class OverloadingTest {
    public static void main(String[] args) {

    }
}
/*      오버로딩: 같은 이름의 메소드를 여러개  작성을 가능하게 해주는 기법
        오버로딩은 매개변수로 구분만 되면 작성 가능 (오로지 매개변수만 따진다)
        리턴타입은 상관x
 */
class Mymath3{
    int add(int n1 , int n2){
        return n1 + n2;
    }


    int add(int n1 , double n2){
        return 0;
    }

}