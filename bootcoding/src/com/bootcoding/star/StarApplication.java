package com.bootcoding.star;

import java.util.Date;


public class StarApplication {

    public static void main(String[] args) {
        int n = 4;
        //System.out.println("*\n");
        //System.out.println("* *\n");
        //System.out.println("* * *\n");

       /* for(int i=0; i<n;i++){

            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*for(int i=0; i<=n;i++){

            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        Date st=new Date();

        Date et=new Date();
        System.out.println(et.getTime()-st.getTime()+"ms");

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            for(int p=0;p<i*2;p++) {
                System.out.print(" ");
            }
            for (int a = 0; a <= n-i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
