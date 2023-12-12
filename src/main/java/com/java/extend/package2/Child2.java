package com.java.extend.package2;

import com.java.extend.package1.Parent;

public class Child2 extends Parent {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        System.out.println("A = "+obj.a);
        //System.out.println("B = "+obj.b);
        System.out.println("C = "+obj.c); //if any relationship (child extends parent), we can access protected class among packages level
        //System.out.println("D = "+obj.d);
    }
}
