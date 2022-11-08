package com.bootcoding.exception;

public class Application {
    public static void main(String[] args)  {
        VendorService s1=new VendorService();
        try {
            s1.test();
        } catch (Exception e) {
            e.printStackTrace();
            throw new VendorServiceException(e.getMessage());
        }
    }
}
