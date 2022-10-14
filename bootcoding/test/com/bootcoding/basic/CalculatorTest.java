package com.bootcoding.basic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd()
    {
        Calculator c=new Calculator();
        double add = c.calculator(10, 20, "ADD");
        Assert.assertEquals(30,add,0.001);
    }
    @Test
    public void testSub()
    {
        Calculator c=new Calculator();
        double sub = c.calculator(10, 20, "SUB");
        Assert.assertEquals(-10,sub,0.001);
    }
    @Test
    public void testMul()
    {
        Calculator c=new Calculator();
        double mul = c.calculator(10, 20, "MUL");
        Assert.assertEquals(200,mul,0.001);
    }
    @Test
    public void testDiv()
    {
        Calculator c=new Calculator();
        double div = c.calculator(10, 20, "DIV");
        Assert.assertEquals(0.5,div, 0.001);
    }



}
