package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

	private Scanner scn = new Scanner(System.in);
	private class Node{
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	public BinaryTree() {
		root = construct(null, true);
	}
	private Node construct(Node parent, boolean ilc) {
		if(parent == null) {
			System.out.println("Enter the data for root node?");
		}else {
			if(ilc) {
				System.out.println("Enter the data for left child of " + parent.data + " ? ");
			}else {
				System.out.println("Enter the data for right child of " + parent.data + " ? ");
			}
		}
		
		int item = scn.nextInt();
		Node nn = new Node();
		nn.data = item;
		
		System.out.println(nn.data + "has left child ?");
		boolean hlc = scn.nextBoolean();
		if(hlc) {
			nn.left = construct(nn, true);
		}
		
		System.out.println(nn.data + "has right child ?");
		boolean hrc = scn.nextBoolean();
		if(hrc) {
			nn.right = construct(nn, false);
		}
		return nn;
	}
	
	public void display() {
		display(root);
	}
	private void display(Node node) {
		if(node == null)
			return;
		
		String str = "";
		if(node.left != null) {
			str += node.left.data;
		}else {
			str += " . ";
		}
		
		str += " -> " + node.data + " <- ";
		
		if(node.right != null) {
			str += node.right.data;
		}else {
			str += " . ";
		}
		
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	
	public void inOrder() {
		inOrder(root);
	}
	private void inOrder(Node node) {
		if(node == null)
			return;
		
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
	public void preOrder() {
		preOrder(root);
	}
	private void preOrder(Node node) {
		if(node == null)
			return;
		
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void postOrder() {
		postOrder(root);
	}
	private void postOrder(Node node) {
		if(node == null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}
	
	// leftview
	public void leftView() {
		leftView(root);
	}
	
	private void leftView(Node node) {
		if(node == null)
			return;
		
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		
		while(!q.isEmpty()) {
			int n = q.size();
			
			for(int i = 1; i <= n ; i++) {
				
				Node temp = q.poll();
				
				if(i == 1)
					System.out.print(temp.data + " ");
				
				if(temp.left != null)
					q.add(temp.left);
				
				if(temp.right != null)
					q.add(temp.right);
			}
		}
	}
	
	public void rightView() {
		rightView(root);
	}
	
	private void rightView(Node node) {
		if(node == null)
			return;
		
		Queue<Node> q = new LinkedList<>();
		q.add(node);
		
		while(!q.isEmpty()) {
			int n = q.size();
			
			for(int i = 1; i <= n ; i++) {
				
				Node temp = q.poll();
				
				if(i == n)
					System.out.print(temp.data + " ");
				
				if(temp.left != null)
					q.add(temp.left);
				
				if(temp.right != null)
					q.add(temp.right);
			}
		}
	}
	
}
