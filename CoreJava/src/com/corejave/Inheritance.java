package com.corejave;

import java.util.Scanner;

public class Inheritance extends Indian_Rules_class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String next = sc.nextLine();// next- It does not include the whitespace (space, tab, newline) in the token,
									// and it stops reading when it encounters whitespace.
		// nextline-The nextLine() method reads the entire line of input until it
		// encounters a newline character (\n).

		System.out.println("Your name is " + next);
		Inheritance in = new Inheritance();
		in.greenlight();
		in.redlight();
		in.yellowlight();
		in.helmet();
		System.out.println(i);

	}

}
