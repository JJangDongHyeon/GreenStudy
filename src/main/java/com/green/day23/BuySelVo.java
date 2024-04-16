package com.green.day23;

public class BuySelVo {
    private String memId;
    private int buyCount;

   public BuySelVo(String memid , int buyCount){
        this.memId = memid;
        this.buyCount = buyCount;
    }

    public String getMemId() {
        return memId;
    }

    public int getBuyCount() {
        return buyCount;
    }

    @Override
    public String toString(){
        return "BuySelVo{" + memId + " :"
                + buyCount
                +"}";
    }
}
