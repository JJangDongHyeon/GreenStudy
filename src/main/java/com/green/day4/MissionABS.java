package com.green.day4;

public class MissionABS {
    public static void main(String[] args) {

        int val = (int) (Math.random() * 21) - 10; //0 ~ 20 > -10 ~ 10
        System.out.println(val);
        //방법 1.
        if (val > 0) {
            System.out.println(val);
        }else {
            System.out.println(-val);
        }
            //음수를 양수로 바꿀때 *-1 , 혹은 -val

        /*방법 2. val 값 수정
       if(val < 0) {
            val=-val;
            }
            System.out.println(val);

         방법3. 3항식 사용.
         System.out.println("결과값: " + (val < 0 ? -val : val));



         */

    }
}

