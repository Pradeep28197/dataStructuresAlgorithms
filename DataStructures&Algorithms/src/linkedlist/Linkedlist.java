package linkedlist;

public class Linkedlist {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void addFront(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		
	}
	public void insertAfter(Node prev, int new_data) {
		if(prev ==  null) {
			System.out.println("Node is null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev.next;
		prev.next = new_node;	
	}
	public void insertLast(int new_data) {
		Node new_node = new Node(new_data);
		if(head ==  null) {
			//System.out.println("Node is null");
			head = new Node(new_data);
			return;
		}
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		new_node.next = null;
	}
	public static void printList(Node node) {
		while(node != null) {
			System.out.print(node.data+"-->");
			node = node.next;
		}
	}
	public static void main(String[] args) {
		Linkedlist list1 = new Linkedlist();
		list1.head = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		list1.head.next = node2;
		node2.next = node3;
		list1.addFront(5);
		list1.insertAfter(node2, 7);
		list1.insertLast(10);
		printList(list1.head);
	}

}
