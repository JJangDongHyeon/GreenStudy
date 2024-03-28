package com.green.day9.day11.ch6;

public class Tv {
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power; //toggle
    }
    void channelUp(){
        channel++;
    }
    void channelDown(){
        channel--;
    }
}
