package com.algorithm.excercise;

import java.util.ArrayList;

import com.algorithm.beans.Node;
import com.algorithm.service.BinarySearch;
import com.algorithm.service.BinarySearchImpl;

public class BinarySearchTree {

	public static void main(String args[])
	{
	    Node root = new Node(5);
	    ArrayList arr=new ArrayList();
	    
	    BinarySearch bst=new BinarySearchImpl();
	    
	    System.out.println("Building tree with root value " + root.data);
	    bst.insert(root, 15);
	    bst.insert(root, 8);
	    bst.insert(root, 6);
	    bst.insert(root, 3);
	    bst.insert(root, 13);
	    bst.insert(root, 10);
	    bst.insert(root, 7);
	    bst.insert(root, 2);
	    bst.insert(root, 6);
	    
	    System.out.println("Traversing tree inorder");
	    arr=bst.printInOrder(root);	    
	    System.out.println(arr);	
	    
	    System.out.println("printing pre-order traversal with out recursion");
	    bst.preOrderWithoutRecursion(root);
	    
	    System.out.println("Printing all root to leaf paths:");
	    bst.printAllRootToLeafPaths(root, new ArrayList());
	    
	    System.out.println("Height of the tree is: ");
	    System.out.println(bst.height(root));
	    
	    System.out.println("maximum root to leaf path sum");
	    System.out.println( bst.maxRootToLeafSum(root) );
	    
	    System.out.println("Diametre of the tree is:");
	    System.out.println( bst.diametre(root) );
	    
	    System.out.println("Maximum path sum between any 2 nodes:");
	    System.out.println( bst.maxPathSum(root) );
	    
	    
	}
}