package com.ds.tree.basic;

import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq2;
import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq3;

import org.junit.Assert;
import org.junit.Test;

import com.ds.structure.Node;

public class BTHeightTest {
	
	@Test
	public void getHeightTest_HeightEq2(){
		
		Node root = buildTestData_HeightEq2(); //	3 5 1 4 2 6
		
		int height = new BTHeight().getHeight(root);
		
		System.out.println("Height : "+ height);
		Assert.assertEquals(2, height);
	}
	

	@Test
	public void getHeightTest_HeightEq3(){
		
		Node root = buildTestData_HeightEq3(); //	3 5 1 4 2 6
		
		int height = new BTHeight().getHeight(root);
		
		System.out.println("Height : "+ height);
		Assert.assertEquals(3, height);
	}
}
