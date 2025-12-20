package com.java;

import java.util.Scanner;
public class Three_D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of Colleges");
		int n= sc.nextInt();
		System.out.println("Enter the no. of Classes");
		int m= sc.nextInt();
		System.out.println("Enter the no. of Students");
		int l= sc.nextInt();
		
		int a[][][] = new int[n][m][l];
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				for(int k=0; k<a[i][j].length;k++) {
					System.out.println("Please Enter the no. of Colleges"+i+"Classes"+j+"Students"+k);
					a[i][j][k]= sc.nextInt();				
				}
				
				System.out.println();
			}
			}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			    System.out.println();
		}
		


	}

}
