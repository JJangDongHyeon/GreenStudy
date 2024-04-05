package com.green.day17.ch7;


public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(20);
        list.add(10);                //arr 기존 크기보다 1칸 더 큰 새로운 배열만들고
        list.add(30);
        list.add(50);
        System.out.println(list);    //   그 배열 마지막칸 에 파라미터값(10)을 집어 넣는다.
        int size = list.size(); //4                              //  새로운 배열의 주소값을 전역변수 arr에 대입한다.
        System.out.println("size: " + size);
        System.out.println(list.get(3)); //50
    }
}

class MyArrayList{
    private int[] arr;

    MyArrayList(){
        arr = new int[0];
    }
    void add(int num){
        int[] temp = new int[arr.length+1];
        temp[arr.length] = num;
        for (int i = 0 ; i < arr.length ; i++){
            temp[i] = arr[0];
        }
        arr = temp;
    }

    void showLength(){
        System.out.println("len: " + arr.length);
    }

    int size(){//void는 리턴값이 없다.(실행한다는 뜻~)
        return arr.length;
    }

    int get(int num){
        return arr[num];
    }

    public String toString() {
        //append 문자열 합치기  String str = "" ; str += "안녕" ; str += "하세요";
        //str.append("안녕") ; str.append("하세요");랑 같다.
        if(arr.length == 0) { return "[]" ;}
        StringBuilder str = new StringBuilder("[" + arr[0]);
        for(int i = 1 ; i < arr.length ; i++){
            str.append(", " + arr[i]);
        } str.append("]");
        return str.toString();


//              String rr = "[" + arr[0];
//                  for(int i = 1 ; i < arr.length ; i++){
//                    rr += ", " + arr[i];
//                 }  rr += "]";
//         return rr;

    }


}
