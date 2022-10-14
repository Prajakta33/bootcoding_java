package com.bootcoding.practice;

public class PercentageInCgpa {
    public static void main(String[] args) {
        float sub1=45;
        float sub2=95;
        float sub3=48;
        float per=(sub1+sub2+sub3)/300*100;
        System.out.println("Percentage is:"+per);
        double cgpa=per/9.5;
        System.out.println("CGPA is :"+cgpa);
    }
}
