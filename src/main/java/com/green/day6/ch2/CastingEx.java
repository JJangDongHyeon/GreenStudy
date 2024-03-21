package com.green.day6.ch2;
//p.75 ~ 84쪽
public class CastingEx {

    public static void main(String[] args){
        //primitive type와 reference type는 같은 카테고리끼리는 형변환이 된다.
        //primitive type >  reference type으로  형변환은 안 된다. (보통 int > String)(반대도 마찬가지)
        // 이때는 파싱처리 (Wrapper 클래스는 제외)
        int n1 = 10;
        Integer n2 = n1;

        double d1 = 10.0;
        Double d2 = d1;

        //강제형변환, 자동형변환

        //자동형변환되는 방향 (반대는 강제형변환) (p.83)
        //byte > short > int > long > faloat > double > (String + 연산자 일 때만)

        long l1 = 100000000L;
        float f1 = l1;
        System.out.println("f1: " + f1);

        long l2 = (long)f1;
        System.out.println("l2: " + l2);
    }
}
