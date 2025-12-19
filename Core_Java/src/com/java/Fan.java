package com.java;
public class Fan {
	String brand;
	int cost;
	String color;

}

class FanApp {

	public static void main(String[] args) {
		Fan	S1 = new Fan();
		System.out.println("Before Assigning the values");
		System.out.println(S1.brand);
		System.out.println(S1.cost);
		System.out.println(S1.color);
		System.out.println("After Assigning the values");
		
		S1.brand = "Bajaj";
		S1.cost= 2000;
		S1.color = "Brown";
		
		System.out.println(S1.brand);
		System.out.println(S1.cost);
		System.out.println(S1.color);
		
		
		Fan	S2 = new Fan();
		System.out.println("Before Assigning the values");
		System.out.println(S2.brand);
		System.out.println(S2.cost);
		System.out.println(S2.color);
		System.out.println("After Assigning the values");
		
		S2.brand = "Crompton";
		S2.cost= 2200;
		S2.color = "Black";
		
		System.out.println(S2.brand);
		System.out.println(S2.cost);
		System.out.println(S2.color);
	

	}

}
