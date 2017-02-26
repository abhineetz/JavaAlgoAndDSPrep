package com.algo.twopointer.technique;

/**
 * 
 * Given a sorted array and a sum, check if array contains any two numbers with given sum.
 * 
 * @author Abhineet
 *
 */
public class CheckSortedArrayContainsPairWithGivenSum {

	public int[] check(int [] arr, int sum){
		
		int result [] = new int[2];
		result [0] = -1;
		result [1] = -1;
		
		int start=0, end=arr.length-1;
		
		while(end > start){
			
			int sumStartEnd = arr[start]+arr[end];
			
			if(sumStartEnd == sum){
				result [0] = start;
				result [1] = end;
				return result;
			}else if(sumStartEnd > sum){
				end --;
			}else{
				start ++;
			}
		}
		
		return result;
	}
	
}
