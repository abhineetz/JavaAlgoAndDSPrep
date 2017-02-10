package com.ds.tree.basic;
import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq2;

import org.junit.Assert;
import org.junit.Test;

import com.ds.structure.Node;

/**
 * 
 * Refer the diagram {@link BTTraversalTest.png} for the test data //3 5 1 4 2 6
 * @author Abhineet
 * 
 */


public class BTTraversalTest {
	
	@Test
	public void preOrderTraversalTest(){
		
		Node root = buildTestData_HeightEq2(); //	3 5 1 4 2 6
		
		String str = new BTTraversal().preOrder(root);
		
		System.out.println("PreOrder : "+ str);
		Assert.assertEquals("3 5 1 4 2 6", str);
	}
	
	@Test
	public void postOrderTraversalTest(){
		
		Node root = buildTestData_HeightEq2(); //	3 5 1 4 2 6
		
		String str = new BTTraversal().postOrder(root);
		System.out.println("PostOrder : "+str);
		Assert.assertEquals("1 4 5 6 2 3", str);
	}
	
	@Test
	public void inOrderTraversalTest(){
		
		Node root = buildTestData_HeightEq2(); //	3 5 1 4 2 6
		
		String str = new BTTraversal().inOrder(root);
		System.out.println("InOrder : "+str);
		Assert.assertEquals("1 5 4 3 6 2", str);
	}

	@Test
	public void levelOrderTraversalTest(){
		
		Node root = buildTestData_HeightEq2(); //	3 5 1 4 2 6
		
		String str = new BTTraversal().levelOrderTraversal(root);
		System.out.println("LevelOrder : "+str);
		Assert.assertEquals("3 5 2 1 4 6", str);
	}
    
}
