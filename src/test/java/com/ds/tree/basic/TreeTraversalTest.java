package com.ds.tree.basic;
import org.junit.Assert;
import org.junit.Test;

import com.ds.structure.Node;
import com.ds.tree.basic.TreeTraversal;

/**
 * 
 * Refer the diagram {@link TreeTraversalTest.png} for the test data //3 5 1 4 2 6
 * @author Abhineet
 * 
 */


public class TreeTraversalTest {
	
	@Test
	public void preOrderTraversalTest(){
		
		Node root = buildTestData(); //	3 5 1 4 2 6
		
		String str = new TreeTraversal().preOrder(root);
		
		System.out.println("PreOrder : "+ str);
		Assert.assertEquals("3 5 1 4 2 6 ", str);
	}
	
	@Test
	public void postOrderTraversalTest(){
		
		Node root = buildTestData(); //	3 5 1 4 2 6
		
		String str = new TreeTraversal().postOrder(root);
		System.out.println("PostOrder : "+str);
		Assert.assertEquals("1 4 5 6 2 3 ", str);
	}
	
	@Test
	public void inOrderTraversalTest(){
		
		Node root = buildTestData(); //	3 5 1 4 2 6
		
		String str = new TreeTraversal().inOrder(root);
		System.out.println("InOrder : "+str);
		Assert.assertEquals("1 5 4 3 6 2 ", str);
	}

	private Node buildTestData() {
		Node root = new Node(3);
		root.left = new Node(5);
		root.right = new Node(2);
		
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		
		root.right.left = new Node(6);
		return root;
	}
	
    
}
