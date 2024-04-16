package com.green.day23;
//객체 vs 개체
//Entity는 주로 String 아니면 int 이다
//member에 있는 컬럼 하나하나에 해당하는 데이터를 담는
public class BuyEntity {
        private int num;
        private String memId;
        private String prodName;
        private String groupName;
        private int price;
        private int amount;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
