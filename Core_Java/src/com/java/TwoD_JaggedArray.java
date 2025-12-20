package com.java;

import java.util.Scanner;

public class TwoD_JaggedArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("Enter the no.of Classes");
		n = sc.nextInt();
		
		
		int a[][] = new int[n][];
		
		for(int i = 0; i<n;i++) {
			System.out.println("Please enter the  number of Students into the Class"+i+" ");
			int Students = sc.nextInt();
			a[i] = new int [Students]; 
		}
		
		      for(int i = 0;i<a.length;i++) {
		    	      for(int j = 0;j<a[i].length;j++) {
		    	    	  System.out.println("Please enter the marks of the Class"+i + "students"+j);
		    	    	  a[i][j]=sc.nextInt();
		    	      }
		      }
		
		for(int i= 0; i<a.length;i++) {
			for (int j= 0; j<a[i].length;j++) {
             	System.out.print(a[i][j]+" ");
		}
   
			System.out.println();
	}
  }	
}
