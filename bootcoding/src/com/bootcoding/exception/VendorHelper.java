package com.bootcoding.exception;

public class VendorHelper {
    public void test() throws Exception {
        new VendorDAO().convertToInteger("abc");
    }
}
