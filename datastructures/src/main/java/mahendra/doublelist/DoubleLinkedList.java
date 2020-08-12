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
        
        doubleList.displayNodes();
        
        
        
    }
}
