/**
 * 
 */
package com.ds.tree.basic;

import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq2;
import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ds.structure.Node;

/**
 * @author Abhineet
 *
 */
public class BinaryTreeInsertElementTest {

	@Test
	public void insertTest() throws Exception{
		
		Node root = buildTestData_HeightEq2();
		
		new TreeTraversal().levelOrderTraversal(root);
		
		System.out.println();
		
		new BinaryTreeInsertElement().insert(root, 21);
		
		String output = new TreeTraversal().levelOrderTraversal(root);
		
		assertEquals("3 5 2 1 4 6 21", output.trim());
	}
	
	@Test
	public void insertTest2() throws Exception{
		
		Node root = buildTestData_HeightEq3();
		
		new TreeTraversal().levelOrderTraversal(root);
		
		System.out.println();
		
		new BinaryTreeInsertElement().insert(root, 65);
		
		String output = new TreeTraversal().levelOrderTraversal(root);
		
		assertEquals("3 5 2 1 4 6 65 12", output.trim());
		
	}
}
