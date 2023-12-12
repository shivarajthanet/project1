package com.java.extend.package1;

import com.java.classaccess.package1.A;

public class Parent {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    public static void main(String[] args) {
        Parent obj = new Parent();
        System.out.println("A = " + obj.a);
        System.out.println("B = " + obj.b);
        System.out.println("C = " + obj.c);
        System.out.println("D = " + obj.d);
    }
}
