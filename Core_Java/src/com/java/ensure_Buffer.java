package com.java;

public class ensure_Buffer {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); 
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(31);
		System.out.println(sb.capacity());
		
	}

}
