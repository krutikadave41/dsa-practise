package com.krutika.practise.linkedlist;

import java.util.Stack;

public class PalindromeLinkedList {

	public static void main(String args[]) {
		ListNode fourthNode = new ListNode(1, null);
		ListNode thirdNode = new ListNode(2, fourthNode);
		ListNode secondNode = new ListNode(2, thirdNode);
		ListNode head = new ListNode(1, secondNode);
		PalindromeLinkedList obj = new PalindromeLinkedList();

		boolean isPalindrome = obj.isPalindrome(head);

		System.out.println("isPalidrome :" + isPalindrome);
	}

	public boolean isPalindrome(ListNode head) {
		 ListNode slow = head;
	        ListNode fast = head;
	        while (fast != null && fast.next != null) {
	            fast = fast.next.next;
	            slow = slow.next;
	        }
	        slow = reverseList(slow);
	        fast = head;
	        boolean isPalindrome = false;
	        while (slow != null) {
	            if (fast.val == slow.val) {
	                isPalindrome = true;
	            } else {
	                isPalindrome = false;
	                break;
	            }
	            fast = fast.next;
	            slow = slow.next;
	        }
	        return isPalindrome;
	}
	public boolean isPalindromeUsingStack(ListNode head) {
		Stack<Integer> stack = new Stack<>();
		ListNode slowPtr = head;
		while (slowPtr != null) {
			stack.push(slowPtr.val);
			slowPtr = slowPtr.next;
		}

		boolean isPalindrome = false;
		while (head!=null) {
			int stackElement = stack.pop();

			if (stackElement == head.val) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				break;
			}
			head = head.next;

		}
		return isPalindrome;
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


