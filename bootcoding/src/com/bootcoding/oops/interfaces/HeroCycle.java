package com.bootcoding.oops.interfaces;

public class HeroCycle implements Cycle{
    @Override
    public void withgear() {
        System.out.println("Hero Cycle with gear");
    }

    @Override
    public void getType() {
        System.out.println("Hero");
    }
}
