package com.krutika.practise.linkedlist;

public class DeleteNthNode {

	public static void main(String[] args) {
		DeleteNthNode obj = new DeleteNthNode();
		ListNode head = new ListNode(1);
		ListNode two = new ListNode(2);
		head.next = two;
		ListNode three = new ListNode(3);
		two.next = three;
		ListNode four = new ListNode(4);
		three.next = four;
		ListNode five = new ListNode(5);
		four.next = five;
		int n = 2;
		obj.removeNthFromEnd(head, n);
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		// take a dummy node pointing to head
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		// take two pointers
		ListNode firstPtr = dummy;
		ListNode secondPtr = dummy;
		// move second pointer till n
		for (int i = 0; i < n; i++) {
			secondPtr = secondPtr.next;
		}

		// now advance both the pointer till secondPtr.next!=null
		while (secondPtr.next != null) {
			firstPtr = firstPtr.next;
			secondPtr = secondPtr.next;
		}

		// now the next node of the firstPtr is the one that should be deleted
		firstPtr.next = firstPtr.next.next;

		return dummy.next;

	}
}
