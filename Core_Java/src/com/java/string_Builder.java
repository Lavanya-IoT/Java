package com.java;

public class string_Builder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(10); 
		System.out.println(sb.capacity());
		
		sb.append("Ronaldo");
		System.out.println(sb.capacity());
		
		sb.append("is a great footballer");
		System.out.println(sb.capacity());

	}

}
