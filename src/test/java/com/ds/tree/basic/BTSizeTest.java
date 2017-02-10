package com.ds.tree.basic;

import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq2;
import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ds.structure.Node;

public class BTSizeTest {
	
	@Test
	public void getSizeTest_HeightEq2(){
		
		Node root = buildTestData_HeightEq2(); //	3 5 1 4 2 6
		
		int size = new BTSize().getSize(root);
		
		System.out.println("Size : "+ size);
		assertEquals(6, size);
	}
	

	@Test
	public void getHeightTest_HeightEq3(){
		
		Node root = buildTestData_HeightEq3(); 
		
		int size = new BTSize().getSize(root);
		
		System.out.println("Size : "+ size);
		assertEquals(7, size);
	}
	
	/*
	 * Test scenarios for 'Get size' logic without using recursion.
	 */
	
	@Test
	public void getSizeWoRecursionTest_HeightEq2(){
		
		Node root = buildTestData_HeightEq2(); //	3 5 1 4 2 6
		
		int size = new BTSize().getSizeWoRecursion(root);
		
		System.out.println("Size : "+ size);
		assertEquals(6, size);
	}
	
	@Test
	public void getSizeWoRecursionTest_HeightEq3(){
		
		Node root = buildTestData_HeightEq3(); 
		
		int size = new BTSize().getSizeWoRecursion(root);
		
		System.out.println("Size : "+ size);
		assertEquals(7, size);
	}
	
	
}
