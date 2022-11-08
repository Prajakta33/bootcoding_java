package com.bootcoding.exception;

public class NumberExceptionExample {
    public static void main(String[] args) {
        NumberExceptionExample c1 = new NumberExceptionExample();
        int result=c1.convertToInteger("123");
        System.out.println(result);

    }

    public int convertToInteger(String n) {
        try {
            int l=2/1;
            int m = Integer.parseInt(n);
            return m;
        }catch (NumberFormatException ex){
            System.err.println("Please provide integer number");
            ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            System.out.println("I will execute");
        }
        return 0;

    }

}