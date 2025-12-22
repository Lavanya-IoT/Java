package com.java;

public class Raw_Strings {

	public static void main(String[] args) {

			String s1= "Arsh";
			String s2= "arsh";
			
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
