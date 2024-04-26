package com.corejave;

public class Finalchild extends Final {
//	@Override
//	final void getdata() {
//		// TODO Auto-generated method stub
//		super.getdata1();
//	}
    @Override
	public void getdata1() {
		// TODO Auto-generated method stub
		super.getdata1();
	}

	public static void main(String[] args) {
		Finalchild fd= new Finalchild();
		fd.getdata();//We cannot override the method which is final
     
	}

}
