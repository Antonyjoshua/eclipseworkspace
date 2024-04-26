package com.corejave;

//final class Final
//we can also make method and class as final, if we make a class as final we cannot inherit the class and use as parent class
//if we make a method as final, we cannot override the method in another class
public class Final {

	final void getdata() {
		System.out.println("This method cannot be overridden");

	}

	public void getdata1() {
		System.out.println("This method can be overridden");

	}

	public static void main(String[] args) {
		// Immutable or constant variable- we cannot change the value of the variable
		// once you marked as final
		final int i = 10;
		// i=2;
		final String s = "Antony";
		// s="joshua";
        Finalchild fd= new Finalchild();
        fd.getdata();
        Final f= new Final();
		f.getdata();
	
	}

}
