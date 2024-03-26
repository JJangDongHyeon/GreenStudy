package com.green.day9.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        /*
        1~n 까지 더하는데 100이 막 넘은 index값과 sum 값을 출력한다.
        i:14 , sum: 105
        while문으로 해결
        */
        int sum =0 , i = 0;
        while(true) {
            System.out.printf("i: %d , sum: %d\n", i, sum);
            if(sum > 100){
                System.out.println("i의 값은: " + i);
                break;
            }
//            sum += ++i;

            sum = sum + ++i ;
            //++i 을 하면 i가 1 일때 1=0+1 이 되지만
            //i++ 을 하면 i가 1 일때 0=0+0 이 된다.  0+0하고 i가 올라간다고 생각하면됨
        }
    }
}