package com.ds.tree.basic;

import static java.lang.Integer.MIN_VALUE;

import com.ds.structure.Node;

public class BinaryTreeMaxElement {

	int max = MIN_VALUE;
	
	public int getMaxElement(Node root){
		
		if(root.data > max)	max = root.data;
		
		if(root.left != null ){
			if( root.left.data > max) max = root.left.data;
			
			getMaxElement(root.left);
		}
		
		if(root.right != null ){
			if(root.right.data > max) max = root.right.data;
			getMaxElement(root.right);
		}
		
		return max;
	}
}
