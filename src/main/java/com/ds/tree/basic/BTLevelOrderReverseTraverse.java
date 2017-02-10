package com.ds.tree.basic;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.structure.Node;

/**
 * 
 * @author Abhineet
 *
 *	Reverse Level Order Traversal
 *	
 * {@link BTLevelOrderReverseTraverseTest}
 */
public class BTLevelOrderReverseTraverse {
	
	StringBuilder str = new StringBuilder();
	
	// Using Recursion
	public String levelOrderReverseTraverse(Node root) throws Exception{
       
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node head = queue.remove();
			
			str.append(head.data + " ");
			
			if(head.right != null) queue.add(head.right);
			if(head.left != null) queue.add(head.left);
			
		}
		
		return str.toString();
    }
}
