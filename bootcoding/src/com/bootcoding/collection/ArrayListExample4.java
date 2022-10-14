package com.bootcoding.collection;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        
//        for(int i=1;i<=10;i++){
//            str.add(i*10+"");
//        }
        String[] name={"Aditi","Prajakta","Mayuri"};
        for(String number:name){
            System.out.println(number);
        }
    }
}
