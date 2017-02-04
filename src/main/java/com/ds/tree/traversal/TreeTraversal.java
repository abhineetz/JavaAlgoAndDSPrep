package com.ds.tree.traversal;

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
	
	public String preOrder(Node root) {
		
	    if (root != null) str.append(root.data+" ");
	    
	    if (root.left != null) preOrder(root.left);
	    
	    if (root.right != null) preOrder(root.right);
	    
	    return str.toString();
	}
	
	public String postOrder(Node root) {
	    
	    if(root.left != null) postOrder(root.left);
	     
	    if(root.right != null) postOrder(root.right);
	   
	    if(root != null) str.append(root.data+" ");
	     
	    return str.toString();
	}
	
	public String inOrder(Node root) {
	    
	    if (root.left !=null) inOrder(root.left);
	    
	    if(root != null) str.append(root.data+" ");
	    
	    if (root.right !=null) inOrder(root.right);
	    
	    return str.toString();
	}
}

