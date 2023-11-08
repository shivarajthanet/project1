package com.java.basic;

import java.util.Scanner;

public class AddNumSc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int FirstNumber = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int SecondNumber = sc.nextInt();
        int sum = FirstNumber+SecondNumber;
        System.out.println("Sum of two numbers = "+sum);
    }
}
