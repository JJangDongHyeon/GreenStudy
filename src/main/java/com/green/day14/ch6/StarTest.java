package com.green.day14.ch6;

public class StarTest {
    public static void main(String[] args) {
        Star star = new Star();
        star.singlePrint(5); //***** (개행)
        star.singlePrint(7); //******* (개행)
        System.out.println("----------------");
        star.squarePrint(5);
        star.trianglePrint(4);
        //*
        //**
        //***
        //****
    }
}

class Star {
    void singlePrint(int starNum) {
        for (int i = 1; i <= starNum; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void squarePrint(int starNum) {
        for (int i = 1; i <= starNum; i++) {
            singlePrint(starNum);
        }
    }

    void trianglePrint(int starnum){
        for(int i = 1; i <= starnum ; i++){
            singlePrint(i);
        }
    }
}