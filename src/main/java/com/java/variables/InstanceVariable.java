package com.java.variables;

public class InstanceVariable {
    int b = 20;

    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();
        System.out.println("Value of B: "+obj.b);
    }
}
