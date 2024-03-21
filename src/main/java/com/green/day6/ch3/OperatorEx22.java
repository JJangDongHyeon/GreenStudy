package com.green.day6.ch3;
//p. 110
public class OperatorEx22 {

        public static void main(String[] args){
            float f = 0.1f;
            double d = 0.1;
            double d2 = f;

            System.out.printf("%f == %f %b\n" , 10.0 , 10.0f , 10.0 == 10.0f); //%b 는 불린
            System.out.printf("%f == %f %b\n" , f , d , f == d);  //float과 double은 유사치에 가까운것이지 같은 값이 아님
            System.out.printf("%f == %f %b\n" , f , d , (double)f == d);
            System.out.printf("%f == %f %b\n" , f , d , f == (float)d );

            //더블과 플롯을 비교할때는 더블을 플롯으로 바꾸는게 맞다
            //이미 망가진 플롯을 정상으로 고칠 수는 없으니 더블을 플롯으로 바꿔 둘다 망가진 값으로 비교 ㅇㅇㅇㅇㅇㅇㅇ
        }
}
