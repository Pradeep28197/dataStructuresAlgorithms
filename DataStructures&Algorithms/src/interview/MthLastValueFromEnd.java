package interview;

public class MthLastValueFromEnd {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	public void pushData(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new_node;
			return;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}
	
	public void printData(Node node) {
		Node temp = node;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public int printMthFromLast(Node node, int m) {
		Node temp = node;
		Node mthLast = node;
		//System.out.print(mthLast.data);
		int c = 1;
		boolean flag = false;
		while(temp != null) {
			if(c>m && m>0) {
				mthLast = mthLast.next;
				flag = true;
			}
			else if(c == m) {
				flag = true;
			}
			temp = temp.next;
			c+=1;
		}
		if(flag)return mthLast.data;
		//mthLast.data = null;
		else return mthLast.data = -1;
	}
	
	public static void main(String[] args) {
		MthLastValueFromEnd list1 = new MthLastValueFromEnd();
		list1.pushData(1);
		list1.pushData(2);
		list1.pushData(3);
		list1.pushData(4);
		//list1.printData(list1.head);
		System.out.println(list1.printMthFromLast(list1.head,4));
	}

}
