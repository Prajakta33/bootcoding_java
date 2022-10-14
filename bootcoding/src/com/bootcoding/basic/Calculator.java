package com.bootcoding.basic;

import java.util.Date;

public class Calculator {
    public static void main(String[] args) {

//       // System.out.println(calculator(10, 20, "ADD"));
//        System.out.println(calculator(10, 20, "MUL"));
//        System.out.println(calculator(10, 20, "SUB"));
//        System.out.println(calculator(10, 20, "DIV"));
        // int mul = calculator(10, 20, "MUL");
        //int sub = calculator(10, 20, "SUB");
        // int div = calculator(10, 20, "DIV");
        // System.out.println(add);
        // System.out.println(mul);
        // System.out.println(sub);
        //System.out.println(div);

        long st=System.nanoTime();
        Calculator c1 = new Calculator();
        long et=System.nanoTime();
        System.out.println((et-st)/1000+"ms");

    }

    double calculator(int n, int m, String action) {
        if (action == "ADD") {
            return n + m;
        } else if (action == "MUL") {
            return n * m;
        } else if (action == "SUB") {
            return n - m;
        } else if (action == "DIV") {
            return n / (double) m;
        } else {
            return n;
        }
    }

}