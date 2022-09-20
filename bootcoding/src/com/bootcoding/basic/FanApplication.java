package com.bootcoding.basic;

import com.bootcoding.oops.*;

public class FanApplication {

    public static void main(String[] ards) {

        FanEncapsulation fe = new FanEncapsulation();
        //fe.speed = 2;
        fe.setSpeed(2);
        System.out.println(fe.getSpeed());
        //fe.no_of_plates=3;
        fe.setNo_of_plates(3);
        System.out.println(fe.getNo_of_plates());
        //fe.price=1700.0;
        fe.setPrice(1700.0);
        System.out.println(fe.getPrice());
        //fe.company="Bajaj";
        fe.setCompany("Bajaj");
        System.out.println(fe.getCompany());
    }

}
