package com.bootcoding.recursion;

public class RecursionExample {
    public static void main(String[] args) {
       RecursionExample r1=new RecursionExample();
       r1.printNumbers(10);
    }
    public void printNumbers(int n){
        if(n<1){
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
    }

}
