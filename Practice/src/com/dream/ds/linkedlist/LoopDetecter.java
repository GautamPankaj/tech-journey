package com.dream.ds.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LoopDetecter {

	public static void main(String[] args) {
		LinkedList lnlist = new LinkedList();
		lnlist.append(4);
		lnlist.append(2);
		lnlist.append(3);
		lnlist.append(7);
		lnlist.append(8);
		lnlist.append(9);
		lnlist.prepend(1);
		
		lnlist.printList();
		System.out.println("Loop Available : " + lnlist.detectLoopUsingPoniters());
		/*Create loop for testing */
		lnlist.head.next.next.next.next = lnlist.head;
		System.out.println("Loop Available : " + lnlist.detectLoopUsingPoniters());
		
	}

}

class Node{
	Node next;
	int data;
	Node(int data){
		this.data = data;
		next = null;
	}
}

class LinkedList {
	Node head, current;
	
	public boolean detectLoopUsingPoniters() {
		if(head == null) {
			return false;
		}
		Node slow = head;
		Node fast = head;
		while(slow != null || fast != null) {
			slow = slow.next;
			if(fast.next != null)
				fast = fast.next.next;
			else
				return false;
			if(slow == fast)
				return true;
		}
		return false;
	}
	
	public boolean detectLoopUsingHash() {
		if(head == null) {
			return false;
		}
		current = head;
		Set<Node> nodeSet = new HashSet<Node>();
		while(current != null) {
			if(nodeSet.contains(current))
				return true;
			nodeSet.add(current);
			current = current.next;
		}
		return false;
	}
	
	//1->4->2->3->7->8->9
	public void deleteNode(int data) {
		if(head == null) {
			return;
		}
		if(head.data == data) {
			head = head.next;
			return;
		}
		while(current.next != null) {
			if(current.next.data == data) { 
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
		
	}
	public void append(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void prepend(int data) {
		current = head;
		head = new Node(data);	
		head.next = current;
	}	
	
	public void printList() {
		current = head;
		while(current != null) {
			System.out.print(current.data);
			if(current.next != null) {
				System.out.print("->");				
			}else {
				System.out.println();
			}
			current = current.next;
		}
	}
}
