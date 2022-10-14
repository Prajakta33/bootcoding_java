package com.bootcoding.practice;

public class OpratorsRough {
    public static void main(String[] args) {
        //arithmatic oprators
        int f=4;
        int g=6%f;
        System.out.println(g);
        System.out.println(4.8%1.1);//returns decimal remainder
        //assingement oprators
        int h=9;
        h+=3;
        System.out.println(h);

        //comparision oprators
        System.out.println(6==8);
        System.out.println(64>=9);

        //logical oprators
        System.out.println(65>85 && 65>8);
        System.out.println(65>85 || 65>8);
        System.out.println(65!=67);

        //bitwise oprators
        System.out.println(2&3);// in binary( 2=10 ,3=11)
     //        10
     //        11
    //      --------
     //        10

    //Precedence & Associativity
    int d=6*5-34/2;
        System.out.println(d);
        /*
        =30-34/2
        =30-17
        =13
         */
    int e=60/5-34*2;
        System.out.println(e);
        /*
        =12-34*2
        =12-68
        =-56
        */
        /*
        .......Highest precedance goes to * and /.They are then evaluatend on the basis of
        left to right associativity.BDMOS is not applied here in some conditions only........
         */
    int b = 1;
    int c=4;
    int a=5;
    int k=b*b-(4*a*c)/(2*a);
        System.out.println(k);
    }
}
