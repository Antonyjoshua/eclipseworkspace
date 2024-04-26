package com.corejave;

public class Abs_childclass extends Abstract {

	public static void main(String[] args) {
		Abs_childclass ac= new Abs_childclass();
		ac.subjects();
		ac.uniform();
		ac.schoolname();

	}

	@Override
	public void uniform() {
		System.out.println("White shirt, brown trowser");
		
	}

	@Override
	public void schoolname() {
    System.out.println("JBMS");		
	}

}
