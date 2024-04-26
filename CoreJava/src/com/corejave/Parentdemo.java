package com.corejave;

public class Parentdemo {
	String str = "Sagayam";

	public Parentdemo() {
		System.out.println("Parent class constructor");
	}

	public void supermethod1() {

		System.out.println("This is parent class method");

	}
	// When you create an instance of the Childdemo class (Childdemo cd = new
	// Childdemo();), the constructor of the parent class (Parentdemo) is invoked
	// first because every child class constructor implicitly calls the constructor
	// of its immediate parent class.

//This is why "Parent class constructor" is printed first.
//After the parent class constructor execution, the constructor of the Childdemo class is invoked, printing "child class constructor" next.

}
