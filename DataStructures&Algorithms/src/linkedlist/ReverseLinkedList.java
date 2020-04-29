package linkedlist;

public class ReverseLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	public void push(int data) {
		Node new_node = new Node(data);
		if(head == null) {
			head = new_node;
			return;
		}
		else {
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
	}
	
	public void reverseList(Node curr) {
		Node prev = null;
		Node next = null;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		
	}
	
	public void printList(Node head) {
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}
	
	public static void main(String[] args) {
		ReverseLinkedList list1 = new ReverseLinkedList();
		list1.push(1);
		list1.push(2);
		list1.push(3);
		list1.push(4);
		list1.reverseList(list1.head);
		list1.printList(list1.head);
	}

}
