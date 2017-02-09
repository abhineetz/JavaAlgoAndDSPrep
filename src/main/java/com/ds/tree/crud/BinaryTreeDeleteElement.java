/**
 * 
 */
package com.ds.tree.crud;

import com.ds.structure.Node;
import com.ds.tree.basic.BinaryTreeDeepestNode;
import com.ds.tree.basic.BinaryTreeSearchElement;

/**
 * @author Abhineet
 *
 */
public class BinaryTreeDeleteElement {

	/*
	 * Delete an element from the binary tree.
	 * 
	 * 1. Find the parent Node of deepest node in the tree.
	 * 2. Search the parent Node of element to be removed from the tree.
	 * 3. Set the vale of deepestNodes to the node to be deleted
	 * 4. Set deepest Node to null   
	 */
	
	public Node delete(Node root, int data) throws Exception{
		
		if(root == null){
			throw new Exception("Invalid tree. Root node can't be null");
		}
		
		// Find the deepest node in the tree
		BinaryTreeDeepestNode btDeepestNode = new BinaryTreeDeepestNode();
		Node deepestNodesParent = btDeepestNode.getDeepestNodesParent(root);
		
		int deepestNodeData;
		if(deepestNodesParent.right != null){
			deepestNodeData = deepestNodesParent.right.data;
		}else{
			deepestNodeData = deepestNodesParent.left.data;
		}
		
		// Search the node for the data
		BinaryTreeSearchElement bst = new BinaryTreeSearchElement();
		Node searchElemParentNode = bst.searchElementAndReturnParent(root, data);
		
		// Set the vale of deepestNodes to the node to be deleted
		if(searchElemParentNode.left.data == data){
			searchElemParentNode.left.data = deepestNodeData;
		}else{
			searchElemParentNode.right.data = deepestNodeData;
		}
		
		//Set deepest Node to Null
		if(deepestNodesParent.right != null){
			deepestNodesParent.right = null;
		}else{
			deepestNodesParent.left = null;
		}
		
		
		return root;
		
	}
}
