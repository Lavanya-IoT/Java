package com.java;

public class trime_TO_Size {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); 
		System.out.println(sb.capacity());
		sb.append("Ronaldo");
		sb.trimToSize();
		System.out.println(sb.capacity());
	}

}
