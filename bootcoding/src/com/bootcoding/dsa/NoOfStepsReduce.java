package com.bootcoding.dsa;

public class NoOfStepsReduce {
    public static void main(String[] args) {
        NoOfStepsReduce o = new NoOfStepsReduce();
        int res = o.numberOfSteps(8);
        System.out.println("Number of steps to reduce " + 8 + " to zero is  " + res);
    }
    public int numberOfSteps(int num){

        int count=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
            }
            else{
                num=num-1;
            }
            count++;
        }
        return count;

    }
}

