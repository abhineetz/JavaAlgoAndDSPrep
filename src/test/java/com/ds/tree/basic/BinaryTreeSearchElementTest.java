package com.ds.tree.basic;

import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq2;
import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ds.structure.Node;
import com.ds.tree.util.TreeTestUtils;

public class BinaryTreeSearchElementTest {

	@Test
	public void searchElementRecursivelyTest_PASS(){
		
		Node root = TreeTestUtils.buildTestData_HeightEq2();
		
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
		
		boolean foundMatch = new BinaryTreeSearchElement().searchElementRecursively(root, 3);
		assertEquals(true, foundMatch);
	}
}
