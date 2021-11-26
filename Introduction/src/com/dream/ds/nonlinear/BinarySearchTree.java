package com.dream.ds.nonlinear;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(5);
		bst.add(3);
		bst.add(2);
		bst.add(4);
		bst.add(7);
		bst.add(6);
		bst.add(8);

		System.out.println("Printing In-Order");
		bst.PrintInOrder();
		System.out.println('\n' + "Printing Pre-Order");
		bst.PrintPreOrder();
		System.out.println('\n' + "Printing Post-Order");
		bst.PrintPostOrder();
		System.out.println('\n' + "Printing Level-Order");
		bst.PrintLevelOrder();
	}

	private void add(int i) {
		root = addRecursively(root, i);
	}

	private Node addRecursively(Node root2, int i) {
		if (root2 == null) {
			root2 = new Node(i);
		} else if (root2.key > i) {
			root2.left = addRecursively(root2.left, i);
		} else if (root2.key < i) {
			root2.right = addRecursively(root2.right, i);
		}
		return root2;
	}

	private void PrintInOrder() {
		traverseInOrder(root);
	}

	// DFS : Left Sub-Tree -> Root -> Right Sub-Tree
	private void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.key);
			traverseInOrder(node.right);
		}
	}

	private void PrintPreOrder() {
		traversePreOrder(root);
	}

	// DFS : Root -> Left Sub-Tree -> Right Sub-Tree 
	private void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.key);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}

	private void PrintPostOrder() {
		traversePostOrder(root);
	}

	// DFS : Left Sub-Tree -> Right Sub-Tree -> Root 
	private void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.key);
		}

	}
	
	private void PrintLevelOrder() {
		traverseLevelOrder(root);
	}

	// BFS : Level Order 
	private void traverseLevelOrder(Node root) {
		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);
		while(!nodes.isEmpty()) {
			Node node = nodes.remove();
			if(node.left != null)
				nodes.add(node.left);
			if(node.right != null)
				nodes.add(node.right);
			System.out.print(" " + node.key);
		}
	}

    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if(node == null)
            return -1;
        if(node.left == null)
            return node.key;
        Node tempNode = node;
        while(tempNode.left != null){
            tempNode = tempNode.left;
        }
        return tempNode.key;
    }

    // Function to find the lowest common ancestor(LCA) in a BST. 
  	Node LCA(Node root, int n1, int n2)
  	{
          Node tempNode = root;
          while(true){
              if(tempNode.key > n1 && tempNode.key > n2)
                  tempNode = tempNode.left;
              if(tempNode.key < n1 && tempNode.key < n2)
                  tempNode = tempNode.right;
              if((tempNode.key > n1 && tempNode.key < n2) || 
                  (tempNode.key < n1 && tempNode.key > n2)){
                  return tempNode;
              }
               if((tempNode.key == n1 || tempNode.key == n2)){
                  return tempNode;
              }
          }
      }

}

class Node{
	int key;
	Node left, right;
	
	public Node(int item){
		key = item;
		left = null;
		right = null;
	}
}
