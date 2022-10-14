package com.bootcoding.oops.polymorphism;

public class Calculator {

    public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public int add(int []arr) {
        int sum=0;
        for (int i=0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    public double add(int d,double e){
        double c=d+e;
        return c;
    }
}
