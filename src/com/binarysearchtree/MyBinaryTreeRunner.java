package com.binarysearchtree;
import java.util.Scanner;

public class MyBinaryTreeRunner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		int flag = 0;
		while (true) {
			System.out.println("Enter 1.Add 2.exit");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				myBinaryTree.add(sc.nextInt());
				break;
				
			case 2:
				flag = 1;
				break;
				
			default:
				break;
				
			}
			if (flag == 1) break;
		}
		System.out.println("The Size of Binary Tree is " + myBinaryTree.size());
		System.out.println("Binary Tree Nodes: ");
		myBinaryTree.printTree();
	}
}
