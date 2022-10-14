package com.bootcoding.oops;

public class Application {
    public static void main(String[] args) {

        Marker m1=new Marker();
        m1.company="Camlin";
        m1.color="Blue";
        m1.type="White Board Marker ";
        m1.price=125.00;
        System.out.println(m1.company);
        System.out.println(m1.color);
        System.out.println(m1.type);
        System.out.println(m1.price);

        Cat c1=new Cat();
        c1.run();
        c1.eat();
        c1.drink();

        System.out.println(c1.legs);
        System.out.println(c1.eyes);

    }
}
