package com.ds.tree.basic;

import com.ds.structure.Node;

/**
 * 
 * @author Abhineet
 *
 *	Search an element in a binary tree
 */
public class BinaryTreeSearchElement {

	boolean isElementMatched = false;
	
	public boolean searchElementRecursively(Node root, int data){
		
		if(root.data == data) {
			isElementMatched = true;
			return true;
		}else{
			
				if(root.left != null){
					isElementMatched = searchElementRecursively(root.left, data);
				}
				
				if(!isElementMatched){	
					if(root.right != null) searchElementRecursively(root.right, data);
				}
		}
		
		return isElementMatched;
	}
}
