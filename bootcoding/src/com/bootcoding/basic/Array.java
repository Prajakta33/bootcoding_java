package com.bootcoding.basic;

public class Array {
    public static void main(String[] ards){
        int[] a={1,2,3,4,5,6,7};
        System.out.println(a[3]);

        int b[]=new int[5];
        b[0]=30;
        b[1]=33;
        b[2]=23;
        //System.out.println(b[2]);

        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
