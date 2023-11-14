package com.java.packagetopackage1;

public class AtoB2 {
    public static void main(String[] args) {
        AToB1 obj = new AToB1();
        System.out.println("A = "+obj.a);
        //System.out.println("B = "+obj.b);// b is not accessed from one class to another within same package because of private
        System.out.println("C = "+obj.c);
        System.out.println("D = "+obj.d);
    }
}
