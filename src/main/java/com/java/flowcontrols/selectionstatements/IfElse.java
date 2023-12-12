package com.java.flowcontrols.selectionstatements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ?");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Given number is even number");
        }else{
            System.out.println("Given number is odd number");
        }
    }
}
