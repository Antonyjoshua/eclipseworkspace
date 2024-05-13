package com.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Write a java program to remove the duplicate number
public class Duplicate_Array {
	
	
	public static void main(String[] arg)
	{
	int[] a = { 7, 2, 3, 6, 5, 5, 1 };
	//method 1
	List<Integer> collect = IntStream.of(a).distinct().boxed().collect(Collectors.toList());
	System.out.println(collect);
	//method 2
	List<Integer> collect2 = Arrays.stream(a).sorted().distinct().boxed().collect(Collectors.toList());
	System.out.println(collect2);
	
	}

}
