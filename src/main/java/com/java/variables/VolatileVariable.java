package com.java.variables;

public class VolatileVariable {
    volatile int e = 50;
    public static void main(String[] args) {
        VolatileVariable obj = new VolatileVariable();
        System.out.println("Value of E: "+obj.e);
    }
}
