package com.ds.tree.basic;

import com.ds.structure.Node;

/**
 * 
 * @author Abhineet
 *
 *	Find the deepest node of a binary tree.
 *	
 * {@link BTDeepestNodeTest}
 */
public class BTDeepestNode {
	
	Node deepestNode = null;
	Node parentNode = null;
	// Using Recursion
	public Node getDeepestNode(Node root) throws Exception{
        
        if(root == null){ 
        	throw new Exception("Invalid Tree.");}
           
        if(root.left == null && root.right == null){
        	deepestNode = root;
        }
       
        if(root.left != null)  {
        	getDeepestNode (root.left);
        }
        if(root.right != null) {
        	getDeepestNode (root.right);
        }
     
        return deepestNode;
    }
	
	public Node getDeepestNodesParent(Node root) throws Exception{
        
        if(root == null){ 
        	throw new Exception("Invalid Tree.");}
           
        if(root.left == null && root.right == null){
        	deepestNode = root;
        }
       
        if(root.left != null)  {
        	parentNode = root;	
        	getDeepestNodesParent (root.left);
        }
        if(root.right != null) {
        	parentNode = root;
        	getDeepestNodesParent (root.right);
        }
     
        return parentNode;
    }
}
