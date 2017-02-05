package com.ds.tree.basic;

import java.util.LinkedList;
import java.util.Queue;

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
	
	/*
	 * Search element in a binary tree without recursion
	 */
	public boolean searchElementWoRecursion(Node root, int data){
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node head = queue.remove();
			
			if(head.data == data){
				return true;
			}
			
			queue.add(head.left);
			queue.add(head.right);
		}
		
		
		return isElementMatched;
	}
}
