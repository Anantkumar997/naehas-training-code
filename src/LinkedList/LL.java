package LinkedList;

import java.awt.List;

import LinkedList.LL.Node;

public class LL {

	static Node head;
	int size;
	LL(){
		size = 0;
	}
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	// addFirst
	
	public void addFirst(int data) {
		Node nn = new Node(data);
		size++;
		if(head == null) {
			head = nn;
			return;
		}
		
		nn.next = head;
		head = nn;
	}
	
	// addLast
	
	public void addLast(int data) {
		Node nn = new Node(data);
		size++;
		if(head == null) {
			head = nn;
			return;
		}
		
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = nn;
	}
	
	// printLinkedList
	
	public void printLL() {
		if(head == null) {
			System.out.println("LinkedList is Empty...");
			return;
		}
		
		Node curr = head;
		
		while(curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println("null");
		
	}
	
	// deleteFirst
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("LinkedList is Empty...");
			return;
		}
		size--;
		head = head.next;
	}
	
	// deleteLast
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("LinkedList is Empty...");
			return;
		}
		
		Node secondLast = head;
		Node last = head.next;
		size--;
		
		while(last.next != null) {
			last = last.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
		
	}
	
	public int size() {
		return size;
	}
	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst(1);
		list.addLast(2);
		System.out.println(list.size());
		list.printLL();
		list.addFirst(0);
		System.out.println(list.size());
		list.printLL();
		list.addLast(3);
		System.out.println(list.size());
		list.printLL();
		list.deleteFirst();
		System.out.println(list.size());
		list.printLL();
		list.deleteLast();
		System.out.println(list.size());
		list.printLL();
	}

	public void reverseLL() {
		// TODO Auto-generated method stub
		ReverseLL.reverseLL();
	}

	public void recursiveReverseLL() {
		
		head = ReverseLL.recursiveReverseLL(head);
	}

}
