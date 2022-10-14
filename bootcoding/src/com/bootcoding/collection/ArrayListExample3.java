package com.bootcoding.collection;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> Str=new ArrayList<>();

        for(int i=1;i<=10;i++){
            Str.add(i*10+0.5 +" ");

        }
        for(int i=0;i<Str.size();i++){
            System.out.print(Str.get(i)+" ");
        }
       // System.out.println();
    }
}
