package com.corejave;

public class Childdemo extends Parentdemo {
	String str = "Antony";

	public Childdemo() {
			System.out.println("child class constructor");
		}

	// Super keyword get the parent class data
	public void getdata() {
		System.out.println(str);
		System.out.println(super.str);
	}

	public void supermethod() {

		System.out.println("This is child class method");
		super.supermethod1();

	}

	public static void main(String[] args) {
		// if both the method in parent and child class are not same and we create
		// object
		// like parent class refname= childclass();
		// the object will execute the parent class method.
		// if both the method in parent and child class are same and we create object
		// like parent class refname= childclass();
		// the object will execute the child class method.

		Childdemo cd = new Childdemo();
		cd.getdata();
		cd.supermethod();
//		Parentdemo pd = new Childdemo();
//		pd.supermethod1();
//		System.out.println(pd.str);
	}

}
