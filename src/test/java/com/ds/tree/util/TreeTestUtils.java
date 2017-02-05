package com.ds.tree.util;

import com.ds.structure.Node;

public class TreeTestUtils {

	/*
	 * Tree structure
	 * 			_____________3_____________
	 * 	  	 	|						   |
	 * 	   	____5____				   ____2____
	 *	   | 		 |                |			|
	 * 	   1		 4				  6
	 * 
	 */
	public static Node buildTestData_HeightEq2() {
		Node root = new Node(3);
		root.left = new Node(5);
		root.right = new Node(2);
		
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		
		root.right.left = new Node(6);
		return root;
	}
	
	
	/*
	 * Tree structure
	 * 
	 * 		     _____________3_____________
	 * 	  	 	|						    |
	 * 	   	____5____				    ____2____
	 *	   | 		 |                 |		 |
	 * 	   1		 4				___6___
	 * 							   |	   |
	 * 							   3
	 */
	public static Node buildTestData_HeightEq3() {
		Node root = new Node(3);
		root.left = new Node(5);
		root.right = new Node(2);
		
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		
		root.right.left = new Node(6);
		root.right.left.left = new Node(3);
		
		return root;
	}
}
