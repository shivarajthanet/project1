package com.java.extend.package1;

import com.java.classaccess.package1.A;

public class Child1 extends Parent{
    public static void main(String[] args) {
        Parent obj = new Parent();
        System.out.println("A = "+obj.a);
        //System.out.println("B = "+obj.b);
        System.out.println("C = "+obj.c);
        System.out.println("D = "+obj.d);
    }
}
