package com.ds.tree.basic;

import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq2;
import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq3;

import org.junit.Assert;
import org.junit.Test;

import com.ds.structure.Node;

public class BinaryTreeLevelOrderReverseTraverseTest {
	
	@Test
	public void levelOrderReverseTraverseTest_HeightEq2() throws Exception{
		
		Node root = buildTestData_HeightEq2(); //	3 5 1 4 2 6
		
		String output = new BinaryTreeLevelOrderReverseTraverse().levelOrderReverseTraverse(root);
		
		System.out.println("Reverse Level Order Traversal : "+ output);
		Assert.assertEquals("3 2 5 6 4 1", output.trim());
	}
	
	@Test
	public void levelOrderReverseTraverseTest_HeightEq3() throws Exception{
		
		Node root = buildTestData_HeightEq3(); //	3 5 1 4 2 6
		
		String output = new BinaryTreeLevelOrderReverseTraverse().levelOrderReverseTraverse(root);
		
		System.out.println("Reverse Level Order Traversal : "+ output);
		Assert.assertEquals("3 2 5 6 4 1 12", output.trim());
	}
}
