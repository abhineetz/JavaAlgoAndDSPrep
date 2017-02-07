package com.ds.tree.basic;

import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq2;
import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq3;

import org.junit.Assert;
import org.junit.Test;

import com.ds.structure.Node;

public class BinaryTreeDeepestNodeTest {
	
	@Test
	public void getDeepestNodeTest_HeightEq2() throws Exception{
		
		Node root = buildTestData_HeightEq2(); //	3 5 1 4 2 6
		
		Node deepestNode = new BinaryTreeDeepestNode().getDeepestNode(root);
		
		System.out.println("deepestNode : "+ deepestNode.data);
		Assert.assertEquals(6, deepestNode.data);
	}
	
	@Test
	public void getDeepestNodeTest_HeightEq3() throws Exception{
		
		Node root = buildTestData_HeightEq3(); 
		
		Node deepestNode = new BinaryTreeDeepestNode().getDeepestNode(root);
		
		System.out.println("deepestNode : "+ deepestNode.data);
		Assert.assertEquals(12, deepestNode.data);
	}
	
	@Test
	public void getDeepestNodesParentTest_HeightEq2() throws Exception{
		
		Node root = buildTestData_HeightEq2(); //	3 5 1 4 2 6
		
		Node deepestNodesParent = new BinaryTreeDeepestNode().getDeepestNodesParent(root);
		
		System.out.println("deepestNodesParent : "+ deepestNodesParent.data);
		Assert.assertEquals(2, deepestNodesParent.data);
	}
	
	@Test
	public void getDeepestNodesParentTest_HeightEq3() throws Exception{
		
		Node root = buildTestData_HeightEq3(); 
		
		Node deepestNodesParent = new BinaryTreeDeepestNode().getDeepestNodesParent(root);
		
		System.out.println("deepestNodesParent : "+ deepestNodesParent.data);
		Assert.assertEquals(6, deepestNodesParent.data);
	}
}
