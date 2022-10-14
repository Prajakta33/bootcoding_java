package com.bootcoding.practice;
import java.util.Scanner;

public class MarkInpercentage {

    public static void main(String[] args) {

        System.out.println("Enter Your Marks Out of 100");
        Scanner scr=new Scanner(System.in);//System.in=keyboard se input leta hai
        System.out.println("Marks of English Subject");
        float a= scr.nextInt();
        System.out.println("Marks of Marathi Subject");
        float b= scr.nextInt();
        System.out.println("Marks of Hindi Subject");
        float c= scr.nextInt();
        System.out.println("Marks of Math Subject");
        float d= scr.nextInt();
        System.out.println("Marks of Science Subject");
        float e= scr.nextInt();
        System.out.println("Marks of Social Sci Subject");
        float f= scr.nextInt();


        float sum=a+b+c+d+e+f;
        float per=sum/600*100;
        System.out.println("Your Percentage is :"+per+"%");


    }
}
