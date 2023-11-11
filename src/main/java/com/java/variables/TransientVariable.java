package com.java.variables;

public class TransientVariable {
    transient  int f = 60;

    public static void main(String[] args) {
        TransientVariable obj = new TransientVariable();
        System.out.println("Value of F: "+obj.f);
    }
}
