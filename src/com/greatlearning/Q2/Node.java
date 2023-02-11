package com.greatlearning.Q2;

class Node {
	int val;
	Node left;
	Node right;

	// Helper function that allocates a new node
	// with the given data and NULL left and right
	// pointers.
	Node(int item)
	{
		val = item;
		left = right = null;
	}

}
