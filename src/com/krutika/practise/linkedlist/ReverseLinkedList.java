package com.krutika.practise.linkedlist;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		ListNode fifthNode = new ListNode(5, null);
		ListNode fourthNode = new ListNode(4, fifthNode);
		ListNode thirdNode = new ListNode(3, fourthNode);
		ListNode secondNode = new ListNode(2, thirdNode);
		ListNode head = new ListNode(1, secondNode);
		ReverseLinkedList obj = new ReverseLinkedList();
		
		ListNode reverseList = obj.reverseList(head);
		while(reverseList!=null) {
			System.out.print(reverseList.val + " ");
			reverseList = reverseList.next;
		}

	}
	private ListNode reverseList(ListNode head) {
		if(head == null) {
			return null;
		}
		if(head.next ==null) {
			return head;
		}
		
		ListNode currNode = head;
		ListNode prevNode = null;
		while(currNode!=null) {
			ListNode nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
			
		}
		head = prevNode;
		return head;
	}
	
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
