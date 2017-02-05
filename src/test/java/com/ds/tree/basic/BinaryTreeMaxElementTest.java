package com.ds.tree.basic;

import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq3;
import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq3_MaxValEqRoot;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ds.structure.Node;

public class BinaryTreeMaxElementTest {
	
	/*
	 *  Test cases using recursion implementation
	 */
	@Test
	public void getMaxElementTest(){
		
		Node root = buildTestData_HeightEq3();
		
		int max = new BinaryTreeMaxElement().getMaxElement(root); 
		
		assertEquals(12, max);
	}
	
	@Test
	public void getMaxElementTest_RootMax(){
		
		Node root = buildTestData_HeightEq3_MaxValEqRoot();
		
		int max = new BinaryTreeMaxElement().getMaxElement(root); 
		
		assertEquals(9, max);
	}
	
	
	/*
	 *  Test cases for Non-recursion implementation
	 */
	@Test
	public void getMaxElementWoRecursion_RootMax(){
		
		Node root = buildTestData_HeightEq3_MaxValEqRoot();
		
		int max = new BinaryTreeMaxElement().getMaxElementWoRecursion(root); 
		
		assertEquals(9, max);
	}
	
	@Test
	public void getMaxElementWoRecursion(){
		
		Node root = buildTestData_HeightEq3_MaxValEqRoot();
		
		int max = new BinaryTreeMaxElement().getMaxElementWoRecursion(root); 
		
		assertEquals(9, max);
	}
	
}
