package com.corejave;

public class While_do_while {

	public static void main(String[] args) {
		int i=1;
		while(i<5)//While loop will continue until the condition becomes false
		{
			System.out.println(i);
			i++;
		}
		//reverse
		int a=10;
		while(a>0)
		{
			System.out.println(a);
			a--;
		}
		//int k=1;
		int j=1;
		do {
		//	System.out.println(k);
			System.out.println(j);//j=1 condition will be checked on second iteration
			//k++;
			j++;
		//	System.out.println(j);//j=2
		}while(j<10);
	}

}
