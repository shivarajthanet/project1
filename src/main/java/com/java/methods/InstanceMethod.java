package com.java.methods;

public class InstanceMethod {
    //without return type (user defined)
    public void greet(){
        System.out.println("Hello");
    }
    //return type (user defined)
    public int add(int i, int j){
        return i+j;
    }

    public static void main(String[] args) {
        InstanceMethod obj = new InstanceMethod();
        obj.greet();
        System.out.println(obj.add(10,20));

    }
}
