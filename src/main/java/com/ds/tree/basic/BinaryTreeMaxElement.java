package com.ds.tree.basic;

import static java.lang.Integer.MIN_VALUE;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.structure.Node;

public class BinaryTreeMaxElement {

	int maxElement = MIN_VALUE;
	
	// Using Recursion
	public int getMaxElement(Node root){
		
		if(root.data > maxElement)	maxElement = root.data;
		
		if(root.left != null ){
			if( root.left.data > maxElement) maxElement = root.left.data;
			getMaxElement(root.left);
		}
		
		if(root.right != null ){
			if(root.right.data > maxElement) maxElement = root.right.data;
			getMaxElement(root.right);
		}
		
		return maxElement;
	}
	
	// Without Recursion
	public int getMaxElementWoRecursion(Node root){
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			
			Node head = queue.remove();
			if(head.data > maxElement ){
				maxElement = head.data;
			}
			
			if(head.left != null) queue.add(head.left);
			if(head.right != null) queue.add(head.right);
			
		}
		
		return maxElement;
	}
}
