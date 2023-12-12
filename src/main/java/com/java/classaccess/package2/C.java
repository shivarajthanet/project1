package com.java.classaccess.package2;

import com.java.classaccess.package1.A;

public class C {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("A = "+obj.a); // only public is accessed from one package class to another package class
        /*System.out.println("B = "+obj.b);
        System.out.println("C = "+obj.c);
        System.out.println("D = "+obj.d);*/
    }
}
