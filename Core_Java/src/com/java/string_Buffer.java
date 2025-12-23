package com.java;

public class string_Buffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); 
		System.out.println(sb.capacity());
		
		sb.append("Ronaldo");
		System.out.println(sb.capacity());
		
		sb.append("is a great footballer");
		System.out.println(sb.capacity());
	}

}
