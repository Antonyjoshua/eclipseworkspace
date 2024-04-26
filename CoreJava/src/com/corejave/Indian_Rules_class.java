package com.corejave;

public class Indian_Rules_class implements Inter_Trafic_rules {

	@Override
	public void redlight() {
		System.out.println("Redlight");
		
	}

	@Override
	public void greenlight() {
		System.out.println("Greenlight");
		
		
	}

	@Override
	public void yellowlight() {
		System.out.println("Yellowlight");
		
	}
	public void helmet() {
		System.out.println("helmet");
		
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		//itr object contains all the methods present in the irc  class which are defined in itc interface
		//An object reference can be cast to an interface reference when the object's class implements that interface. 
		Inter_Trafic_rules itr= new Indian_Rules_class();
		itr.redlight();
		itr.greenlight();
		itr.yellowlight();
		//to call our own methods in the class we need create an object for the class
		Indian_Rules_class irc= new Indian_Rules_class();
		irc.helmet();
		irc.greenlight();
		
	}

}
