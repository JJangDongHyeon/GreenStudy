package com.green.day15.ch7;

import com.green.day13.ch6.Card;//같은 클래스명 두개는 임포트 불가
import static com.green.day14.ch6.MyArrays.printArr;

/*             패키지
        1.자바 파일을 관리하기위한 분류 용도
        2.똑같은 이름의 클래스를 구분하기 위해해해해햏헤ㅔ헿헤ㅔ헿헤
 */
public class PackageTest {
    public static void main(String[] args) {
        Card c = new Card();
        com.green.day12.ch6.Card card2 = new com.green.day12.ch6.Card();

        int[] arr = {1, 2, 3, 4, 5};
        printArr(arr);
    }
}
