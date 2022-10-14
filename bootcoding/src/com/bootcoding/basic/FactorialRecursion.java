package com.bootcoding.basic;

public class FactorialRecursion {

    public static void main(String[] args) {

        FactorialRecursion f1=new FactorialRecursion();
        long result=f1.fact(8);
        System.out.println(result);}
       public long fact(int n){
        if(n==1){
            return 1;
        }
        return fact(n-1)*n;

        }

}
