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
public class MergeSortedArraysTest {

	@Test
	public void mergeTestOne() throws Exception{
		
		int [] arr1 = {1, 4, 7, 9};
		int [] arr2 = {2, 3, 10, 11};
		
		assertEquals("1 2 3 4 7 9 10 11", printArray(new MergeSortedArrays().merge(arr1, arr2)));
	}
	
	@Test
	public void mergeTestTwo() throws Exception{
		
		int [] arr1 = {1, 2, 3, 4};
		int [] arr2 = {50, 51, 52, 53};
		
		assertEquals("1 2 3 4 50 51 52 53", printArray(new MergeSortedArrays().merge(arr1, arr2)));
	}
	
	@Test
	public void mergeTestThree() throws Exception{
		
		int [] arr1 = {1, 2, 2, 2};
		int [] arr2 = {2, 2, 2, 2};
		
		assertEquals("1 2 2 2 2 2 2 2", printArray(new MergeSortedArrays().merge(arr1, arr2)));
	}
}
