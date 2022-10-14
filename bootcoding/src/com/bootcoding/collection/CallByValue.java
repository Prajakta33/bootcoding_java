package com.bootcoding.collection;

public class CallByValue {
    static int b;
    public static void main(String[] args) {
        //int b=10;
        b=10;
        add(b);
        System.out.println(b);
    }

    public static void add(int b) {
         b=20;
    }
}
