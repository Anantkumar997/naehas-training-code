package LinkedList;

import LinkedList.LL.*;

public class ReverseLL {

	public static void reverseLL() {
		if(LL.head == null || LL.head.next == null)
			return;
		
		Node prev = LL.head;
		Node curr = LL.head.next;
		while(curr != null) {
			Node nextNode = curr.next;
			curr.next = prev;
			
			// update
			prev = curr;
			curr = nextNode;
		}
		LL.head.next = null;
		LL.head = prev;
	}
	
	public static Node recursiveReverseLL(Node head) {
		if(head == null || head.next == null)
			return head;
		
		Node newHead = recursiveReverseLL(head.next);
		
		head.next.next = head;
		head.next = null;
		
		return newHead;
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
//		list.deleteFirst();
//		System.out.println(list.size());
//		list.printLL();
//		list.deleteLast();
//		System.out.println(list.size());
//		list.printLL();
		list.reverseLL();
		list.printLL();
		list.recursiveReverseLL();
		list.printLL();

	}

}
