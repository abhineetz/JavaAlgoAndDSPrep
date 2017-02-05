package com.ds.tree.basic;

import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq3;
import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq3_MaxValEqRoot;

import org.junit.Assert;
import org.junit.Test;

import com.ds.structure.Node;

public class BinaryTreeMaxElementTest {
	
	@Test
	public void getMaxElementTest(){
		
		Node root = buildTestData_HeightEq3();
		
		int max = new BinaryTreeMaxElement().getMaxElement(root); 
		
		Assert.assertEquals(6, max);
	}
	
	@Test
	public void getMaxElementTest_RootMax(){
		
		Node root = buildTestData_HeightEq3_MaxValEqRoot();
		
		int max = new BinaryTreeMaxElement().getMaxElement(root); 
		
		Assert.assertEquals(9, max);
	}
}
