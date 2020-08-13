package mahendra.doublelist;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class DoubleLinkedList {
	
	Node head;
	
	
	//insertion at the end of the list
	void insertNode(int data) {
		if(head==null) {
			head=new Node(data);
			head.left=null;
			head.right=null;
			return;
		}
		Node temp=head;
		while(temp.right!=null) {
			temp=temp.right;
		}
		
		Node newNode=new Node(data);
		
		temp.right=newNode;
		newNode.left=temp;
		newNode.right=null;
		
	}
	
	//delete first occurence of the data node
	void deleteNode(int data) {
		
		if(head==null) {
			System.out.println("empty list deletion not possible");
			return;
		}
		
		//head updation required if found at head
		if(head.data==data) {
			System.out.println("Found data at head and deleted");
			head=head.right;
			
			//i.e. head here now points to head.right
			if(head!=null) { //if list contain more than one node and node found at head
				head.left=null;
			}
			
			return;
			//garbage collection
		}
		
		//if more than one node in list
		Node temp=head;
		
		while(temp.right!=null) {
			if(temp.right.data==data) {
				
				System.out.println("Found data  and deleted");
				
				Node foundNodeRightNode=temp.right.right;
				temp.right=foundNodeRightNode;  
				if(temp.right!=null) { //if there are only two nodes and found at second node
					foundNodeRightNode.left=temp;
				}
				
				return;
			}
			
			temp=temp.right;
		}
		
		System.out.println("Element not found");
		return;
		
	}
	
	
	void displayNodes() {
		Node temp=head;
		System.out.println("using right side pointers");
		Node reverse=null;
		while(temp!=null) {
			reverse=temp;
			System.out.println(temp.data);
			temp=temp.right;
		}
		System.out.println("using left side pointers");
		while(reverse!=null) {
			
			System.out.println(reverse.data);
			reverse=reverse.left;
		}
		
	}
	
	
	public static void main( String[] args )
    {
        System.out.println( "DLL" );
        
        DoubleLinkedList doubleList=new DoubleLinkedList();
        doubleList.insertNode(1);
        doubleList.insertNode(2);
        doubleList.insertNode(4);
        doubleList.insertNode(3);
        doubleList.insertNode(6);
        doubleList.insertNode(5);
        doubleList.deleteNode(6);
        
        doubleList.displayNodes();
        
        
        
    }
}
