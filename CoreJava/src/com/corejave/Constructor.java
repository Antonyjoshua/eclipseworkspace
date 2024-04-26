package com.corejave;

import Collections.Practice;

public class Constructor extends Practice{
	// Constructor have no return type
	// contructor name should be same as class name
	public Constructor(String name) {
		System.out.println("I'm parameterixed constructor" +name);

	}
	//parameterized constructor
	public Constructor(int a, int b) {
		System.out.println("I'm constructor");
	   System.out.println(a+b);

	}
	public Constructor() {
		System.out.println("I'm constructor");
	   

	}


	public void getdata() {
		System.out.println("I'm a method");
		

	}


	public static void main(String[] args) {
		// whenever an object is created for the class, the constructor will execute
		// automatically
		// complier will call implicit constructor(inside the library) where there is no
		// constructor defined in class
		Constructor cons = new Constructor("Antony");
		Constructor cons1 = new Constructor(3, 3);
		Constructor cons11 = new Constructor();
		cons.getdata();
		cons1.getdata();
		cons11.getdata();
		Practice pr = new Practice();
	}
}
