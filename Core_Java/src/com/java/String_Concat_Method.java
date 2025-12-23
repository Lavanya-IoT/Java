package com.java;

public class String_Concat_Method {
	
	public static void main(String[] args) {

			String s1= "Md";
			String s2= "arsh";
			
			s1 = s1.concat(s2);
			System.out.println(s1);
			
		    if(s1 == s2) {
		    	System.out.println("References are Equal");
		    }
		    else {
		    	System.out.println("References are not Equal");
		    }
		    if(s1.equals(s2)) {
		    	System.out.println("Values are Equal");
		    }
		    else {
		    	System.out.println("Values are not Equal");
		    }
		}



}
