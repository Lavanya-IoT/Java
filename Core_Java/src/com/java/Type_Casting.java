package com.java;

public class Type_Casting {

	public static void main(String[] args) {
		byte a = 10;
		int b = a;
		System.out.println(a);
		System.out.println(b); //Implicit 
		double c = 25.17;
		int d;
		d = (int)c;
		System.out.println(c);
		System.out.println(d); //Explicit
		
		
		float e = (float)10.25;
		System.out.println(e);
		
		
		
	}

}
