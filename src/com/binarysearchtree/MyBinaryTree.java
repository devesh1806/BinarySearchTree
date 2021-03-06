package com.binarysearchtree;

public class MyBinaryTree<K extends Comparable<K>> {
	
	private MyBinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root,key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)return current;
		if (compareResult < 0) current.left= addRecursively(current.left, key);
		else current.right= addRecursively(current.right, key);
		return current;
	}
	
	public int size() {
		return this.sizeRecursively(root);
	}

	private int sizeRecursively(MyBinaryNode<K> root) {
		return (root == null)? 0: 1+ this.sizeRecursively(root.left)+this.sizeRecursively(root.right);
	}
	
	public void printTree() {
		this.print(root);
	}

	private void print(MyBinaryNode<K> root) {
		
		if (root==null)return;
		print(root.left);
		System.out.print(root.key+ " ");
		print(root.right);
	}

	public void search(K key) {
		if (this.searchNode(root,key)) {
			System.out.println(key + " is present in Binary Tree.");
		}
		else {
			System.out.println(key + " is not present in Binary Tree.");
		}
	}
	
	private boolean searchNode(MyBinaryNode<K> root,K key) {
		if (root == null) return false;
		int compareKey = key.compareTo(root.key);
		if (compareKey == 0) return true;
		if (compareKey < 0)return searchNode(root.left,key);
		else return searchNode(root.right,key);
	}
}
