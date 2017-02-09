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

	private boolean isElementMatched = false;
	private Node matchedNode = null; 
	private Node parentNode;
	
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
			
			if(head.left != null) queue.add(head.left);
			if(head.right != null) queue.add(head.right);
		}
		
		
		return isElementMatched;
	}
	
	/*
	 * Search element in a binary tree without recursion
	 */
	public Node searchElement(Node root, int data){
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node head = queue.remove();
			
			if(head.data == data){
				matchedNode = head;
			}
			

			if(head.left != null) queue.add(head.left);
			if(head.right != null) queue.add(head.right);
		}

		return matchedNode;
	}
	
	/*
	 * Search element and return its parent Node 
	 */
	public Node searchElementAndReturnParent(Node root, int data) throws Exception{
		
		Queue<Node> queue = new LinkedList<>();
		 
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node head = queue.remove();
			
			if(head.data == data){
				if(parentNode == null) {
					throw new Exception("Parent Node is empty for the Node : "+head);
				}
				return parentNode;
			}
			
			if(head.left != null) {
				parentNode = head;
				queue.add(head.left);
			}
			if(head.right != null){
				parentNode = head;
				queue.add(head.right);
			}
		}

		return parentNode;
	}
}
