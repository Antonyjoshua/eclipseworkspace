package com.corejave;

public abstract class Abstract {
    //ex:school, subject is common for all but uniform and name differs from schools
	//except private we can use any access specifier
	public void subjects() {
		System.out.println("tam,eng,math,science, soc science");

	}
	
	//abstract- method without the body
	//any method in a class is abstract then the class will be treated as abstract class
	//we cannot create object for the abstract class
	public abstract void uniform();
	public abstract void schoolname();

	}


