package com.java;

public class Reference_String {

	public static void main(String[] args) {
		
		String s1= "Md ";
		String s2= "Arsh";
		
		String s3= "Md " + "Arsh";
		String s4= "Md Arsh";
		
	    if(s3 == s4) {
	    	System.out.println("References are Equal");
	    }
	    else {
	    	System.out.println("References are not Equal");
	    }
	    if(s3.equals(s4)) {
	    	System.out.println("Values are Equal");
	    }
	    else {
	    	System.out.println("Values are not Equal");
	    }

	}

}
