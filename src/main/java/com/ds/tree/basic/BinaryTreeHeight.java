package com.ds.tree.basic;

import com.ds.structure.Node;

public class BinaryTreeHeight {
	
	public int getHeight(Node root) {
        
        if(root == null){ return -1;}
            int leftHeight = getHeight (root.left);
            int rightHeight = getHeight (root.right);
     
         if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }
}
