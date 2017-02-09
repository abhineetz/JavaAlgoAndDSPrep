package com.ds.tree.basic;

import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq2;
import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ds.structure.Node;

public class BinaryTreeSearchElementTest {

	/*
	 *  Binary Tree search element with recursion tests
	 */
	@Test
	public void searchElementRecursivelyTest_PASS(){
		
		Node root = buildTestData_HeightEq2();
		
		boolean foundMatch = new BinaryTreeSearchElement().searchElementRecursively(root, 6);
		assertEquals(true, foundMatch);
	}
	
	@Test
	public void searchElementRecursivelyTest_FAIL(){
		
		Node root = buildTestData_HeightEq2();
		
		boolean foundMatch = new BinaryTreeSearchElement().searchElementRecursively(root, 12);
		assertEquals(false, foundMatch);
	}
	
	@Test
	public void searchElementRecursivelyTest1_PASS(){
		
		Node root = buildTestData_HeightEq3();
		
		boolean foundMatch = new BinaryTreeSearchElement().searchElementRecursively(root, 12);
		assertEquals(true, foundMatch);
	}
	
	/*
	 *  Binary Tree search element without recursion tests
	 */
	@Test
	public void searchElementWoRecursionTest_PASS(){
		
		Node root = buildTestData_HeightEq2();
		
		boolean foundMatch = new BinaryTreeSearchElement().searchElementRecursively(root, 6);
		assertEquals(true, foundMatch);
	}
	
	@Test
	public void searchElementWoRecursionTest_FAIL(){
		
		Node root = buildTestData_HeightEq2();
		
		boolean foundMatch = new BinaryTreeSearchElement().searchElementRecursively(root, 18);
		assertEquals(false, foundMatch);
	}
	
	@Test
	public void searchElementWoRecursionTest1_PASS(){
		
		Node root = buildTestData_HeightEq3();
		
		boolean foundMatch = new BinaryTreeSearchElement().searchElementRecursively(root, 12);
		assertEquals(true, foundMatch);
	}
	
	@Test
	public void searchElementTest_PASS(){
		
		Node root = buildTestData_HeightEq3();
		
		Node matchedNode = new BinaryTreeSearchElement().searchElement(root, 12);
		assertEquals(12, matchedNode.data);
	}
	
	@Test
	public void searchElementAndReturnParentTest_PASS() throws Exception{
		
		Node root = buildTestData_HeightEq3();
		
		Node matchedNode = new BinaryTreeSearchElement().searchElementAndReturnParent(root, 12);
		assertEquals(6, matchedNode.data);
		
		matchedNode = new BinaryTreeSearchElement().searchElementAndReturnParent(root, 5);
		assertEquals(3, matchedNode.data);
		
		
	}
	
	@Test(expected=Exception.class)
	public void searchElementAndReturnParentTest_Exception_PASS() throws Exception{
		
		Node root = buildTestData_HeightEq3();
		
		new BinaryTreeSearchElement().searchElementAndReturnParent(root, 3);
	}

	@Test
	public void searchElementAndReturnParentTest2_PASS() throws Exception{
		
		Node root = buildTestData_HeightEq2();
		
		Node matchedNode = new BinaryTreeSearchElement().searchElementAndReturnParent(root, 12);
		assertEquals(2, matchedNode.data);
	}
}
