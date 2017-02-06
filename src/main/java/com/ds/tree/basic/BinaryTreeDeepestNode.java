package com.ds.tree.basic;

import com.ds.structure.Node;

/**
 * 
 * @author Abhineet
 *
 *	Find the deepest node of a binary tree.
 *	
 * {@link BinaryTreeDeepestNodeTest}
 */
public class BinaryTreeDeepestNode {
	
	Node deepestNode = null;
	// Using Recursion
	public Node getDeepestNode(Node root) throws Exception{
        
        if(root == null){ 
        	throw new Exception("Invalid Tree.");}
           
        if(root.left == null && root.right == null){
        	deepestNode = root;
        }
        
        if(root.left != null)  getDeepestNode (root.left);
        if(root.right != null)  getDeepestNode (root.right);
     
        return deepestNode;
    }
}
