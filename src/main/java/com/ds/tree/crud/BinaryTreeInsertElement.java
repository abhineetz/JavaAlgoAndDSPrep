/**
 * 
 */
package com.ds.tree.crud;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.structure.Node;

/**
 * @author Abhineet
 *
 */
public class BinaryTreeInsertElement {

	/*
	 * Insert an element in a binary tree at any vacancy at the first vacant level.
	 * 
	 * We will use level order traversing ( also known as Breadth first traversing) 
	 * to find the first vacant space.
	 */
	public void insert(Node root, int data) throws Exception{
		
		Queue<Node> queue = new LinkedList<>();
		
		if(root == null){
			throw new Exception("Invalid tree. Root node can't be null");
		}
		
		queue.add(root); 
		
		while(!queue.isEmpty()){
			
			Node head = queue.remove();
			
			if(head.left !=null ){
				queue.add(head.left);
			}else{
				head.left = new Node(data);
				queue.clear();
			}
			
			if(head.right !=null ){
				queue.add(head.right);
			}else{
				head.right = new Node(data);
				queue.clear();
			}
			
		}
		
	}
}
