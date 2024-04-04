package com.green.day16.ch7;

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(10,11,12);
        System.out.printf("hour: %d\n", time.getHour());
        time.setHour(22);
        System.out.printf("hour: %d\n", time.getHour());
    }
}
//은닉화된 인스턴스 멤버필드에 값을 넣ㄴ느법 1. 생성자 사용 2.메소드를 통해(세터)
//값 빼내는건 게터 메소드
//세터 작성. 1. 무조건 set 2. 변수명(첫글자 대문자) 3. 세터는 전부 void
//게터 작성 1. 파라메터가 없음(값을 내뱉는 거기 때문) 2. 리턴타입 변수와 같음 3..this 안붙여도되고 해도되고
class Time{ //캡슐화 , 은닉화 , 멤버필드는 은닉화 // 상수는 안함
    private int hour ;
    private int minute;
    private int second;

    Time(int hour , int minute , int second){
        this.hour   = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public int getHour(){
        return hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public int getMinute(){
        return minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public int getSecond(){
        return second;
    }

}
