package com.bootcoding.basic;

public class FibonacciSeries {

    public static void main(String[] args){

        int prev1=1,prev2=1,i;
        int n=100;
        int result=1;

//       if(n==1||n==2){
//            System.out.println(n);
//       }
        for(i=1;i<=n;i++){
            System.out.println(result);
            prev2=prev1;
            prev1=result;
            result=prev1+prev2;
          // a++;
           //b++;
         //   System.out.println(result);

        }
    }
}
