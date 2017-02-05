package com.ds.tree.basic;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.structure.Node;

/**
 * 
 * @author Abhineet
 *
 *	Evaluate the height of a binary tree.
 *	
 */
public class BinaryTreeSize {
	
	int size = 0;
	
	// Using Recursion
	public int getSize(Node root) {
        
        if(root == null){ return -1;}
        
        size++;
           
        if(root.left != null) getSize (root.left);
        if(root.right != null) getSize (root.right);
     
        return size;
    }
	
	
	// Without Using Recursion
	public int getSizeWoRecursion(Node root) {
        
        if(root == null){ return -1;}
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
       
        while(!queue.isEmpty()){
        	Node head = queue.remove();
        	size++;
        	
        	if(head.left != null) queue.add(head.left);
        	if(head.right != null) queue.add(head.right);
        	
        }
        
        return size;
    }
}
