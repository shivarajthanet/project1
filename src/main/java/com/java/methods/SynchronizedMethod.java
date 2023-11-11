package com.java.methods;

public class SynchronizedMethod {
    public synchronized void m3(){
        System.out.println("Synchronized method");
    }

    public static void main(String[] args) {
        SynchronizedMethod obj =new SynchronizedMethod();
        obj.m3();
    }
}
