package com.bootcoding.oops.abstraction;

public abstract class Animal {

    public void sleep(){
        System.out.println("I am sleeping ,I am animal");
    }

    public void see(){
        System.out.println("I am Watching");
    }

    public abstract void sound();
}
