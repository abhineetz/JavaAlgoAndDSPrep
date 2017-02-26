/**
 * 
 */
package com.algo.twopointer.technique;

import static com.ds.tree.util.ArraysTestHelper.printArray;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Abhineet
 *
 */
public class CheckSortedArrayContainsPairWithGivenSumTest {

	@Test
	public void checkTestOne() throws Exception{
		
		int [] arr = {1, 4, 7, 9};
		
		assertEquals("1 2", printArray(new CheckSortedArrayContainsPairWithGivenSum().check(arr, 11)));
	}
	
	@Test
	public void checkTestTwo() throws Exception{
		
		int [] arr = {50, 51, 52, 53};
		
		assertEquals("0 3", printArray(new CheckSortedArrayContainsPairWithGivenSum().check(arr, 103)));
	}
	
}
