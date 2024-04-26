package com.corejave;

public class InterviewMinMaxValue {

	public void min() {
		// interview question- find the minimum number in a matrix and the maximum
		// number in the  column from where  the minumum value is present
		int mincolumn = 0;
		int minval[][] = { { 1, 2, 11 }, { 4, 5, 0 }, { 7, 8, 9 } };
		int min = minval[0][1];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {// for each outer loop, the inner loop gets executed for three times
				if (minval[i][j] <= min) {
					min = minval[i][j];
					mincolumn = j;
				}

			}
		}
		System.out.println(min);
		int max = minval[0][mincolumn];// to get the column of the minumum value
		int k = 0;
		while (k < 3) {
			if (minval[k][mincolumn] > max)// minval[0][j]>minval[0][j]
			{
				max = minval[k][mincolumn];
			}
			k++;
		}

		System.out.println(max);
	}

	public void max() {
		int maxval[][] = { { 1, 2, 3 }, { 4, 5, 0 }, { 7, 9, 11 } };
		int max = 8;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (maxval[i][j] > max) {
					max = maxval[i][j];
				}

			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		InterviewMinMaxValue in = new InterviewMinMaxValue();
		in.min();
		in.max();

	}

}
