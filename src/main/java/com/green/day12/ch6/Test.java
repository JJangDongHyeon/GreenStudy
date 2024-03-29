package com.green.day12.ch6;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Bird();
        Animal c = new Fish();
        List<String> gh = new ArrayList<>();
        a.run();
        b.run();
        c.run();
        System.out.println(a.val(4,4));
        System.out.println(b.val(4,4));
        System.out.println(c.val(4,4));



    }
}
