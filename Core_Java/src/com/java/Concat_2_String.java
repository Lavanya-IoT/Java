package com.java;

public class Concat_2_String {
	public static void main(String[] args) {

		String s1= "Md ";
		String s2= "Arsh";
		
		String s3= s1.concat(s2);
		String s4= "Md Arsh";
		
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
