package com.green.day12.ch6;

public class MyMethodTest {
public static void main(String[] args) {
    MyMethod mm = new MyMethod();
    mm.cheakOddEven(10); //(콘솔입력)짝수입니다.
    mm.cheakOddEven(11); //(콘솔입력)짝수입니다.
    mm.cheakOddEven(100); //(콘솔입력)짝수입니다.
    mm.cheakOddEven(13); //(콘솔입력)짝수입니다.

    int r = mm.abs(10);
    System.out.println(r); //10

    r = mm.abs(-8);
    System.out.println(r); //8

    int randomValue = mm.getRandomValue(10); // 0~9 사이의 랜덤값 리턴
    randomValue = mm.getRandomValue(100); //0~99 사이의 랜덤값 리턴

    mm.printGugudan(1);
/*
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9



*/
    int randomValue2 = mm.getRandomValue(10 , 20); //10~19
    System.out.println("randomValue2: "+randomValue2);
    randomValue2 = mm.getRandomValue(5 , 31); //5~30
    System.out.println("randomValue2: "+randomValue2);

    mm.printGugudans(1,9);

}
}

    class MyMethod {
    void cheakOddEven(int a) {
    System.out.printf("%s수입니다.\n", a % 2 == 0 ? "짝" : "홀");
}

    int abs(int a) {
    return (a < 0 ? -a : a);
}

    int getRandomValue(int a) {
    return (int) (a * Math.random());

}

    int getRandomValue(int a, int b) {
    return (int) ((Math.random() * (b - a)) + a);
    }

    void printGugudan(int a) {
    System.out.println("------구구단------ ");
    for (int i = 1; i < 10; i++) {
    System.out.printf("%d x %d = %d\n", a, i, a * i);
}
}

    void printGugudans(int startNum, int endNum) {
    System.out.println("-----구구단-------");
    while (startNum <= endNum) {
    for (int i = 1; i < 10; i++) {
    System.out.printf("%d x %d = %d\n", startNum, i, startNum * i);
}
    startNum++;
    System.out.println("-----------------");
}







}
}