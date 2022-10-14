package com.bootcoding.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {
    public static void main(String[] args) {
        //ArrayList<Integer> str=new ArrayList<>();
        List<Integer> str=new ArrayList<>();
        for(int i=1;i<=10;i++) {
            str.add(i * 10 );
        }


        ArrayListExample5 a1=new ArrayListExample5();
        a1.reduceNumberToZero(str);
    }

    public void reduceNumberToZero(List<Integer> numbers){
        for(int num:numbers){
            int r=numberOfSteps(num);
            System.out.println(num +" number of steps to zero :"+r);
        }
    }

    public int numberOfSteps(int num) {

        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            count++;
        }
        return count;

    }
}

