/**
 * 
 */
package com.ds.tree.crud;

import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq2;
import static com.ds.tree.util.TreeTestUtils.buildTestData_HeightEq3;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ds.structure.Node;
import com.ds.tree.basic.BTTraversal;

/**
 * @author Abhineet
 *
 */
public class BTInsertElementTest {

	@Test
	public void insertTest() throws Exception{
		
		Node root = buildTestData_HeightEq2();
		
		new BTTraversal().levelOrderTraversal(root);
		
		System.out.println();
		
		new BTInsertElement().insert(root, 21);
		
		String output = new BTTraversal().levelOrderTraversal(root);
		
		assertEquals("3 5 2 1 4 6 21", output.trim());
	}
	
	@Test
	public void insertTest2() throws Exception{
		
		Node root = buildTestData_HeightEq3();
		
		new BTTraversal().levelOrderTraversal(root);
		
		System.out.println();
		
		new BTInsertElement().insert(root, 65);
		
		String output = new BTTraversal().levelOrderTraversal(root);
		
		assertEquals("3 5 2 1 4 6 65 12", output.trim());
		
	}
}
