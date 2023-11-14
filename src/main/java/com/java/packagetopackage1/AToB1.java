package com.java.packagetopackage1;

public class AToB1 {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    public static void main(String[] args) {
        AToB1 obj = new AToB1();
        System.out.println("A = "+obj.a);
        System.out.println("B = "+obj.b);
        System.out.println("C = "+obj.c);
        System.out.println("D = "+obj.d);

    }
}
