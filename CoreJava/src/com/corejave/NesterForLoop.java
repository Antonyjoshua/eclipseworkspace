package com.corejave;

public class NesterForLoop {

	public static void inverted() {
		// 1
		// 23
		// 456
		// 78910
		int k = 1;
		for (int i = 0; i < 4; i++) { // 4 rows

			for (int j = 1; j <= 1 + i; j++) { // each time 1 column should increment so addition is used in condition
												// actual value of the inner loop
												// condition starts from 1 so that first time it will execute one time

				System.out.print(k);
				System.out.print(j);
				System.out.print("i");
				System.out.print("\t");
				k++;

			}
			System.out.println(" ");

		}

	}

	public static void main(String[] args) {
		inverted();
		int k = 1;
		for (int i = 0; i < 4; i++) { // 4 rows

			// System.out.println(i);
			for (int j = 1; j <= 4 - i; j++) { // it will run 4 times first and then each time it will decrement one
												// column. each time 1 column should decrement so subtraction is used in
												// condition actual value of the inner loop  condition starts from
												// 4 so that first time it will execute four time

				System.out.print(k);
				System.out.print("\t");
				k++;

			}
			System.out.println(" ");

		}

	}

}
