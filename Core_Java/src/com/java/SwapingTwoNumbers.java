package com.java;

import java.util.Scanner;

public class SwapingTwoNumbers {

	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter first number:");
		        int a = sc.nextInt();

		        System.out.println("Enter second number:");
		        int b = sc.nextInt();

		        int temp;

		        // Swapping using third variable
		        temp = a;
		        a = b;
		        b = temp;

		        System.out.println("After swapping:");
		        System.out.println("a = " + a);
		        System.out.println("b = " + b);

		        sc.close();
		    }
	    
       }