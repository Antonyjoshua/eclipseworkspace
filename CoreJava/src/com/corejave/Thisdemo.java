package com.corejave;

public class Thisdemo {
	int a =3;//global variable
	public void getdata() {
		int a=10;//local variable
		System.out.println(a);
		//this refers to current object-object scope lies in class level.
		//this will take value of class or global variable
		System.out.println(this.a);
		System.out.println(a+this.a);
	}

	public static void main(String[] args) {
		Thisdemo td= new Thisdemo();
		td.getdata();
		//to call the global variable, we need to use object
		System.out.println(td.a);

	}

}
