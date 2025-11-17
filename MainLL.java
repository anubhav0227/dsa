package dsa_practice;

import java.util.*;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LL{
	static Node head;
	
	public static void add(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}
	
	public static void traverse() {
		if(head == null) {
			System.out.println("Not Exist");
		}
		else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	
	public static void indexAt(int data, int pos) {
		Node newnode = new Node(data);
		if(head == null) {
			System.out.println("Created");
			head = newnode;
		}
		else {
			Node temp = head;
			while(pos-2>0) {
				temp = temp.next;
				pos--;
			}
			Node nodenext = temp.next;
			temp.next = newnode;
			newnode.next = nodenext;
		}
	}
	
	public static void remove(int r) {
		if(head == null) {
			System.out.println("Not Exist");
		}
		else {
			Node temp = head;
			Node curr = temp;
			
			while(temp.next!=null) {
				if(temp.data==r) {
					curr.next = temp.next;
				}
				curr = temp;
				temp = temp.next;
			}
		}
	}
	
	public static void reverse() {
		Node prev = null;
		Node curr = head;
		
		while(curr!=null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = prev;
	}
}

public class MainLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
