package com.java;

import java.util.Scanner;

public class Two_D {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		int m;
		System.out.println("Enter the no.of Classes");
		n = sc.nextInt();
		System.out.println("Enter the no. of Students");
		m = sc.nextInt();
		
		int a[][] = new int[n][m];
		
		      for(int i = 0;i<n;i++) {
		    	      for(int j = 0;j<m;j++) {
		    	    	  System.out.println("Please enter the marks of the Class"+i + "students"+j);
		    	    	  a[i][j]=sc.nextInt();
		    	      }
		      }
		
		for(int i= 0; i<n;i++) {
			for (int j= 0; j<m;j++) {
             	System.out.print(a[i][j]+" ");
		}
   
			System.out.println();
	}

  }

}