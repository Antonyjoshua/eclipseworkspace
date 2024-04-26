package com.corejave;

public class Pyramid {

	public static void reverse() {
		for (int i = 4; i >= 1; i--) {

			for (int j = 1; j <= i; j++) { //1<=1; 1<=2; 1<=3; 1<=4

				System.out.print(j);
				System.out.print("\t");

			}
			System.out.println(" ");
		}

	}
	
	public static void alphabet() {
		String str= "Antony";
		for(int i=str.length();i>=1;i--)
		{
			for(int j=0; j<i;j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		

	}
	public static void pattern() {
		int a=3;
		for (int i = 1; i < 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(a);
				System.out.print("\t");
				a=a+3;

			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		pattern();
		alphabet();
		reverse();
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
				System.out.print("\t");

			}
			System.out.println(" ");
		}

	}

}
