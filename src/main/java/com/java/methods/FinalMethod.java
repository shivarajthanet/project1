package com.java.methods;


public class FinalMethod {
    public final void m2(){
        System.out.println("Final method");
    }

    public static void main(String[] args) {
        FinalMethod obj = new FinalMethod();
        obj.m2();
    }
}
