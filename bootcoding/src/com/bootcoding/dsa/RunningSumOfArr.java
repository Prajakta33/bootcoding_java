package com.bootcoding.dsa;

public class RunningSumOfArr{

    public static int[] main(String[] args){

        int[] n={1,2,3,4,5};
        int sum=0;
        int b[]=new int[n.length];
        for(int i=0;i<n.length;i++) {
            sum = sum + n[i];
            b[i] = sum;
        }
        return b;

    }
}