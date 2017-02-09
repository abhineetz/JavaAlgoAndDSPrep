package com.ds.tree.basic;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.structure.Node;

/**
 * 
 * @author Abhineet
 * 
 * Tree Traversal preorder, inorder and postorder techniques
 *
 */
public class TreeTraversal {

	StringBuilder str = new StringBuilder();
	
	/*
	 * Pre Order Traversal - Data Left Right
	 * Using Recursion
	 */
	public String preOrder(Node root) {
		
	    if (root != null) str.append(root.data+" ");
	    
	    if (root.left != null) preOrder(root.left);
	    
	    if (root.right != null) preOrder(root.right);
	    
	    return str.toString().trim();
	}
	
	/*
	 * Post Order Traversal - Left Right Data
	 * Using Recursion
	 */
	public String postOrder(Node root) {
	    
	    if(root.left != null) postOrder(root.left);
	     
	    if(root.right != null) postOrder(root.right);
	   
	    if(root != null) str.append(root.data+" ");
	     
	    return str.toString().trim();
	}
	
	/*
	 * In Order Traversal - Left Data Right
	 * Using Recursion
	 */
	public String inOrder(Node root) {
	    
	    if (root.left !=null) inOrder(root.left);
	    
	    if(root != null) str.append(root.data+" ");
	    
	    if (root.right !=null) inOrder(root.right);
	    
	    return str.toString().trim();
	}
	
	/*
	 * Level Order Traversal (Or Breadth first traversal)
	 * Using Queue
	 */
	public String levelOrderTraversal(Node root){
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node head = queue.remove();
			
			str.append(head.data+" ");
			//System.out.print(head.data+" ");
			
			if (head.left != null) queue.add(head.left);
			if (head.right != null) queue.add(head.right);
			
		}
		
		return str.toString().trim();
	}
}


