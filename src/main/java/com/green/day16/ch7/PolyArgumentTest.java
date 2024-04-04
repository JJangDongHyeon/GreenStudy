package com.green.day16.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
//        Product p = new Product(1000); //price = 1000, bonusPoint = 100
//        System.out.println(p);//p.tostring 으로 치환  주소값.tostring  - > 밑에 tostring으로 지정된걸로 출력
//        Product p2 = new Product(500); //price = 500, bonusPoint = 50
//        System.out.println(p2);
//        Tv tv = new Tv();
//        System.out.println(tv); // Tv price: 100 bonusPoint: 10
//
//        Computer pc = new Computer();
//        System.out.println(pc);
//
//        Sofa sofa = new Sofa();
//        System.out.println(sofa);
        Buyer buyer = new Buyer(20000);
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Sofa());
        buyer.showMeTheMoney();

    }
}

class Buyer {
    private int haveMoney;
    private int haveBonusPoint;

    Buyer(int haveMoney){
        this.haveMoney = haveMoney;
    }
    void buy(Product product){
        this.haveMoney -= product.getPrice();
        this.haveBonusPoint += product.getBounusPoint();
        System.out.println(product + " (을)를 구매하였습니다.");
    }
    public String toString() {
        return "haveMoney: " + haveMoney + " haveBonusPoint: " + haveBonusPoint;
    }
   public void showMeTheMoney(){
       System.out.println("haveMoney: " + haveMoney + " haveBonusPoint: " + haveBonusPoint);
   }
}

class Sofa extends Product {
    Sofa() {
        super(80);
    }

    @Override
    public String toString() {
        return "Sofa" + super.toString();
    }
}

class Computer extends Product{
    Computer() { super(200); }

    @Override
    public String toString(){
        return "Pc" + super.toString();
    }
}

class Tv extends Product {
    Tv() { super(100); }

    @Override
    public String toString() {
        return "Tv" + super.toString(); //String.format("Tv %s"  , super.toString();)
    }
}
class Product {
    private final int price;
    private final int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = price / 10;
    }
//    public void setPrice(int price)   { this.price = price ;
//                                        this.bounusPoint = price/10 ; }
    public int getPrice()             { return  this.price;           }
    public int getBounusPoint()       { return  this.bonusPoint;     }

    @Override
    public String toString() {
        return  " price: " +  this.price  + " bonusPoint: " + this.bonusPoint;
    }
}