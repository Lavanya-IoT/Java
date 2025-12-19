package com.java;

public class student_2 {
	String name;
	int age;
	String gender;
	
	void study() {
		System.out.println();
	}

}

class StudentApp{
	public static void main(String[] args) {
	student_2	S1 = new student_2();
	System.out.println("Before Assigning the values");
	System.out.println(S1.name);
	System.out.println(S1.age);
	System.out.println(S1.gender);
	System.out.println("After Assigning the values");
	
	S1.name = "Lavanya";
	S1.age = 21;
	S1.gender = "Male";
	
	System.out.println(S1.name);
	System.out.println(S1.age);
	System.out.println(S1.gender);
	
	
	}
}