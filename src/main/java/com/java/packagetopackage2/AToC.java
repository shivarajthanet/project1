package com.java.packagetopackage2;

import com.java.packagetopackage1.AToB1;

public class AToC {
    public static void main(String[] args) {
        AToB1 obj = new AToB1();
        System.out.println("A = "+obj.a); // only public is accessed from one package class to another package class
        /*System.out.println("B = "+obj.b);
        System.out.println("C = "+obj.c);
        System.out.println("D = "+obj.d);*/
    }
}
