package com.ds.tree.util;

public class ArraysTestHelper {

	public static String printArray(int [] arr){
		StringBuilder strBuilder = new StringBuilder();
		for (int i =0; i<arr.length; i++){
			strBuilder.append(arr[i] + " ");
		}
		return strBuilder.toString().trim();
	}
}
