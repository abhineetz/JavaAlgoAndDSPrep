/**
 * 
 */
package com.ds.tree.crud;

import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq2;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ds.structure.Node;
import com.ds.tree.basic.BTTraversal;

/**
 * @author Abhineet
 *
 */
public class BTDeleteElementTest {

	@Test
	public void deleteTest() throws Exception{
		
		Node root = buildTestData_HeightEq2();
		
		System.out.println("Before Delete : "+new BTTraversal().levelOrderTraversal(root));
		
		System.out.println();
		
		new BTDeleteElement().delete(root, 5);
		
		String output = new BTTraversal().levelOrderTraversal(root);
		System.out.println("After Delete : "+output);
		
		assertEquals("3 6 2 1 4", output.trim());
	}
	
	/*
	 * TODO: Test case id failing for the scenario where 
	 * element to be deleted is the root node.
	 */
	@Test
	public void deleteTest2() throws Exception{
		
		Node root = buildTestData_HeightEq2();
		
		System.out.println("Before Delete : "+new BTTraversal().levelOrderTraversal(root));
		
		System.out.println();
		
		new BTDeleteElement().delete(root, 3);
		
		String output = new BTTraversal().levelOrderTraversal(root);
		System.out.println("After Delete : "+output);
		
		assertEquals("6 5 2 1 4", output.trim());
	}
	
}
