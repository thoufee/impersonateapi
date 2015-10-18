package com.algorithm.service;

import java.util.ArrayList;

import com.algorithm.beans.Node;

public interface BinarySearch {
	int findMax(int a, int b);
	void insert(Node node, int value) ;
	ArrayList printInOrder(Node node);
	void preOrderWithoutRecursion(Node node);
	void printAllRootToLeafPaths(Node node,ArrayList path) ;
	int height (Node node);
	int maxRootToLeafSum(Node node);
	int diametre(Node node);
	int maxPathSum(Node node);
}
