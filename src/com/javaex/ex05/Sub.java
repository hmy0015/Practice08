package com.javaex.ex05;

public class Sub {
    private int a, b;
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate(int a, int b) {
    	System.out.println(">> " + (this.a - this.b));
    	return this.a - this.b;
    }
}
