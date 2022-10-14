package com.bootcoding.oops.abstraction;

public class Dog extends Animal{

    public void sound(){
        System.out.println("BhaoBhao");
    }

    public void sleep(){
        //super(keyword)=parent object
        super.sleep();
        System.out.println("I am sleeping, I an Dog");
    }
}
