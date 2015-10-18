package com.algorithm.service;

import java.util.ArrayList;
import java.util.Stack;

import com.algorithm.beans.Node;

public  class BinarySearchImpl implements BinarySearch {
	  Node root;
		ArrayList arr=new ArrayList();
		ArrayList path= new ArrayList();
		Stack stk=new Stack();
		int lh=0,rh=0;
		
		public BinarySearchImpl ()
		{
			root=null;
		}
		
		public int findMax(int a, int b)
		{
			if(a>b) 
				return a;
			else 
				return b;
		}
		
		public void insert(Node node, int value) 
		{
		    if (value < node.data) 
		    {
		      if (node.left != null) {
		        insert(node.left, value);
		      } else {
		        System.out.println("  Inserted " + value + " to left of "
		            + node.data);
		        node.left = new Node(value);
		      }
		    } 
		    else if (value > node.data) 
		    {
		      if (node.right != null) {
		        insert(node.right, value);
		      } else {
		        System.out.println("  Inserted " + value + " to right of "
		            + node.data);
		        node.right = new Node(value);
		      }
		    }
		    
		  }
		
		public ArrayList printInOrder(Node node) 
		{
		    if (node != null) {
		      printInOrder(node.left);
		      System.out.println("  Traversed " + node.data);
		      //Store in an array
		      arr.add(node.data);
		      printInOrder(node.right);
		    }
		    return arr;
		}	
		
		public void preOrderWithoutRecursion(Node node)
		{
			while(true)
			{
				while(node!=null)
				{
					System.out.print(node.data+" ");
					stk.push(node); 
					node=node.left;
				}
				
				if(stk.empty())
					break;
				
				node=((Node)stk.peek()).right;
				stk.pop();
			}
			System.out.println();
		}
		
		public void printAllRootToLeafPaths(Node node,ArrayList path) 
		{
			if(node==null)
			{
				return;
			}
			path.add(node.data);
			
			if(node.left==null && node.right==null)
			{
				System.out.println(path);
				return;
			}
			else
			{
				printAllRootToLeafPaths(node.left,new ArrayList(path));
				printAllRootToLeafPaths(node.right,new ArrayList(path));
			}	   
		}
		
		public int height (Node node)
		{
		    if (node == null) 
		    	return 0;
		    return 1 + Math.max(height (node.left), height (node.right));
		}
		
		public int maxRootToLeafSum(Node node)
		{
			if(node==null)
				return 0;
			return findMax( maxRootToLeafSum(node.left) , maxRootToLeafSum(node.right) ) + node.data ;
		}
		
//		public int diametre(Node node, int d)
//		{
//			if(node==null)
//				return 0;
//			
//			lh=diametre(node.left, d);
//			rh=diametre(node.right, d);
//			
//			if(lh+rh+1>d)
//				d=lh+rh+1;
//			
//			return findMax(lh, rh)+1;
//		}
		
		public int diametre(Node node)
		{
			if(node==null)
				return 0;
			else
			{
				return Math.max( (height(node.left)+height(node.right)+1), Math.max( diametre(node.left), diametre(node.right) ) );
			}		
		}
		
		public int maxPathSum(Node node)
		{
			if(node==null)
				return 0;
			else
			{
				return Math.max( (maxRootToLeafSum(node.left)+maxRootToLeafSum(node.right)+node.data), Math.max( maxPathSum(node.left), maxPathSum(node.right) ) );
			}
		}
		
}
