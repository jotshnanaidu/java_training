package day4;

import java.util.Scanner;

class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void removeDuplicates() {
		Node curr = head;

		while (curr != null) {
			Node temp = curr;
			while (temp != null && temp.data == curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}

public class Sorted_Linked_List_Task {

	public static void main(String args[]) {
		LinkedList llist = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n = sc.nextInt();
		System.out.println("Enter elements in decreasing order:");
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			llist.push(x);
		}
		System.out.println("Original List");
		llist.printList();

		llist.removeDuplicates();

		System.out.println("List after removal of duplicates:");
		llist.printList();
	}

}
