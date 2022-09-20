package com.bootcoding.basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 18;
        boolean notPrime = false;
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                notPrime = true;
            }
        }
            if(notPrime){
                System.out.println("It is Not Prime number");
            }
            else{
                System.out.println("It is prime number");
           }

    }
}