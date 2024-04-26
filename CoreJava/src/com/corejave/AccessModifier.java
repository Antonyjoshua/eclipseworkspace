package com.corejave;

public class AccessModifier {

	// if there is no access modifier mentioned in a method, it will take as default
	// modifier
	// default modifier->it can be accessed anywhere only in the package not outside
	// of it->we need to change it to public to access the method outside of the
	// package even if we imported the package
	int i = 5;
	public int j = 5;
	private int k = 3;

	void getdata() {
		System.out.println("AccessModifier Core jave package");
	}

	// you cannot access a method or variable outside of the class of same package
	// as well
	private void getdata2() {
		System.out.println("getdata 2 method from corejava package");
	}

	// if we make a variable or method as public the you will have access across all
	// the packages
	public void getdata3() {
		System.out.println("getdata 3 method from corejava package");
	}

	// we make a variable/method as protected, you can access those in sub classes
	// only
	// which means whenever a class inheriting the parent class only those
	// subclasses have access to the method which is masrked as protected
	// only child classes which extends the parent class can only access the
	// properties which are defined by protected( only for other packages). for same
	// package we can access
	protected void getdata4() {
		System.out.println("getdata 4 method from corejava package");
	}

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		am.getdata2();

	}

}
