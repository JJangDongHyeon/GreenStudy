package com.green.day5;

public class Switch {
    public static void main(String[] args){
            int mon = (int) (Math.random()* 12.0)+1; //1~12
        System.out.println("mon:" + mon);

            switch (mon) {
                case 11:
                case 12:
                case 1:
                    System.out.println("겨울입니다.");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("봄입니다.");
                    break;
                case 5:
                case 6:
                case 7:
                    System.out.println("여름입니다.");
                    break;
                case 8:
                case 9:
                case 10:
                    System.out.println("가을입니다.");
                    break;
                default:
                    System.out.println("잘못된 값입니다.");
                    break;
            }






        /* 스위치는 정수때는 잘 안쓰고 문자열때 메리트ㅏ 있다
        cascade한 부분이 있다. case에 진입하면 break 문장을 만날때까지 전부 실행한다.
        switch(체크하고 싶은 값) {
            case 값1:
                 하고싶은 작업';
                 break;
            case 값2:
                 하고싶은 작업;
                 break;
            case 값3:
                 작업(1);
            case 값4:
                 작업(2);
                 break;
            ......case를 여러개 작성 가능
            default:
                 하고싶은 작업;
                 break;
        }

         */














    }
}
