package mahendra.circularlist;

//Circular single linked list

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class CircularLinkedList {
	
	Node last; //using last node pointer can be used for better performance as last.next give start node
	//for insert we don't need to traverse entire list
	
	//insertion at end of the list
	void insertNode(int data) {
		if(last==null) {
			last=new Node(data);
			last.next=last;
			return;
		}
		
		Node newNode=new Node(data);
		Node head=last.next; // we can also write without storing head here, it is for readability
		newNode.next=head;
		last.next=newNode;
		
		last=newNode; //we have to update last node
		
		
	}
	
	
	void deleteNode(int data) { //deletes first occurrence node
		if(last==null) {
			System.out.println("deletion not possible");
			return;
		}
		
		if(last.next==last) {//if list is with single node only then to handle loop
			if(last.data==data) {
				last=null;
				System.out.println("Found at last node and is the only node list and deleted");
				return;
			}
			else {
				System.out.println("Not found");
				return;
			}
			
		}
		
		Node head=last;
		
		do {
			
			if(head.next.data==data) {
				
				if(head.next==last) { //if we are deleting the last node we need to update last node to previous node
					last=head;
				}
				
				head.next=head.next.next; //we are by passing the found node
				
				System.out.println("Found and deleted");
				
				return;
				
				
			}
			
			head=head.next;
			
		}while(head!=last);
		
		System.out.println("Not found");
		
		
	}
	
	void displayNodes() {
		if(last==null) {
			System.out.println("empty list");
			return;
		}
		
		System.out.println("display");
		Node temp=last.next; //gives head
		while(temp!=null) { // null if list is empty
			System.out.println(temp.data);
			if(temp==last) { //to find end of list as it is circular
				//loop found
				break;
			}
			temp=temp.next;
		}
			
	}
	

	public static void main(String[] args) {
		
		System.out.println("Circular linked list");
		
		CircularLinkedList circularList=new CircularLinkedList();
		circularList.insertNode(1);
		circularList.insertNode(2);
		circularList.insertNode(3);
		circularList.insertNode(4);
		circularList.insertNode(5);
		
		circularList.deleteNode(5);
		
		circularList.displayNodes();

	}

}

