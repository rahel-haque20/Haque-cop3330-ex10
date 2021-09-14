/*
* UCF COP 3330 Fall 2021 Assignment 10 Solution
* Copyright 2021 Rahel Haque
 */


import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Scanner money = new Scanner(System.in);
        System.out.println("Enter the price of item 1: ");
        int p1 = money.nextInt();
        System.out.println("Enter the quantity of item 1: ");
        int q1 = money.nextInt();
        System.out.println("Enter the price of item 2: ");
        int p2 = money.nextInt();
        System.out.println("Enter the quantity of item 2: ");
        int q2 = money.nextInt();
        System.out.println("Enter the price of item 3: ");
        int p3 = money.nextInt();
        System.out.println("Enter the quantity of item 3: ");
        int q3 = money.nextInt();

        double subtotal = (p1*q1)+(p2*q2)+(p3*q3);
        double tax = subtotal * 0.055;
        double total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f%nTax: $%.2f%nTotal: $%.2f", subtotal, tax, total);
    }
}