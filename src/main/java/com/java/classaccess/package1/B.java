package com.java.classaccess.package1;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("A = "+obj.a);
        //System.out.println("B = "+obj.b);// b is not accessed from one class to another within same package because of private
        System.out.println("C = "+obj.c);
        System.out.println("D = "+obj.d);
    }
}
