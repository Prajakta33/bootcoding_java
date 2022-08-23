package com.bootcoding.basic;

public class MinutesToSeconds {

    public static void main(String[] args){
        MinutesToSeconds in=new MinutesToSeconds();
        in.conv();
    }

    void conv(){
        int sec=60;
        int min=4;
        int c=sec*min;
        System.out.println("Coverted into seconds\n" +c+" "+"sec");
    }
}
