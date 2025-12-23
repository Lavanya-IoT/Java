package com.java;

public class Compare_to_Method {

	public static void main(String[] args) {
		
		//String s1 = "SACHIN";
		//String s2 = "SAURAV";
		
		String s1 = "VIRAT";
		String s2 = "VIRU";
		
		int res = s1.compareTo(s2);
		System.out.println(res);
		
		if(res>0) {
			System.out.println("s1 is Greater");
			
		}
		else if(res<0) {
			System.out.println("s2 is Greater");
		
		}
		else {
			System.out.println("Both are equal");
		}
	}
}
