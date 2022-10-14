package com.bootcoding.oops.interfaces;

public class FireFox implements Cycle{
    @Override
    public void withgear() {
        System.out.println("FireFox with gear");
    }

    @Override
    public void getType() {
        System.out.println("Firefox");
    }
}
