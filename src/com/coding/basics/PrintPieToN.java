package com.coding.basics;
/*
Question 2
Given an integer n (n ≤ 15), print π to n digits after the decimal point (rounded).
(e.g. for n = 2, print 3.14; for n = 4, print 3.1416; for n = 5, prints 3.14159.)
 */

import java.util.Scanner;

public class PrintPieToN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(String.format("%." + num +"f", Math.PI));
    }
}
