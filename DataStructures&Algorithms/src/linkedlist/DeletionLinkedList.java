package linkedlist;

public class DeletionLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	public void deleteNode(int key) {
		Node temp = head;
		Node prev = null;
		if(head.data == key) {
			head = head.next;
			return;
		}
		while(temp != null) {
			if(temp.data == key) {
				prev.next = temp.next;
				temp.next = null;
			}
			prev = temp;
			temp = temp.next;
		}
	}
	public void pushData(int new_data) {
		Node new_node = new Node(new_data);
		Node temp = head;
		if(head == null) {
			head = new_node;
			return;
		}
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new_node;
	}
	public void printData(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		DeletionLinkedList list1 = new DeletionLinkedList();
		list1.pushData(1);
		list1.pushData(2);
		list1.pushData(3);
		list1.pushData(4);
		list1.deleteNode(9);
		list1.printData(list1.head);	
	}

}
