package mahendra.linkedlist;

//This implementation is with extensive names 

//****************** LinkedList implementation using current/last Reference along with headRef
// class LinkedListNode{
//   int data;
//   LinkedListNode nextNodeRef;
//   LinkedListNode(int data){
//     this.data=data;
//   }
// }
//
// class LinkedList{
//
//   LinkedListNode headRef;
//   LinkedListNode curRef;
//
//   void addNode(LinkedListNode node){
//
//     if(this.headRef==null){
//       this.headRef=node;
//       this.curRef=node;
//     }
//     else{
//       this.curRef.nextNodeRef=node;
//       this.curRef=node;
//     }
//
//   }
//
//   void displayNodes(){
//     LinkedListNode tempRef=headRef;
//     System.out.println("----display start----");
//     while(tempRef!=null){
//       System.out.println(tempRef.data);
//       tempRef=tempRef.nextNodeRef;
//     }
//     System.out.println("----display end----");
//   }
//
//
// }//end of LinkedList class
//
// class LinkedListDemo{
//   public static void main(String args[]){
//     LinkedList list=new LinkedList();
//     LinkedListNode node1=new LinkedListNode(5);
//     list.addNode(node1);
//     LinkedListNode node2=new LinkedListNode(6);
//     list.addNode(node2);
//     LinkedListNode node3=new LinkedListNode(7);
//     list.addNode(node3);
//     LinkedListNode node4=new LinkedListNode(8);
//     list.addNode(node4);
//     LinkedListNode node5=new LinkedListNode(9);
//     list.addNode(node5);
//
//     list.displayNodes();
//
//     LinkedListNode node6=new LinkedListNode(10);
//     list.addNode(node6);
//
//     list.displayNodes();
//
//
//   }
// }



//****************** LinkedList implementation using only headRef
class LinkedListNode{
  int data;
  LinkedListNode nextNodeRef;
  LinkedListNode(int data){
    this.data=data;
  }
}

class LinkedList{

  LinkedListNode headRef;


  void addNode(LinkedListNode node){
    LinkedListNode tempRef=headRef;
    if(headRef==null){
      headRef=node;
    }
    else{
      while(tempRef.nextNodeRef!=null){
        tempRef=tempRef.nextNodeRef;
      }
      tempRef.nextNodeRef=node;
    }

  }

  void displayNodes(){
    LinkedListNode tempRef=headRef;
    System.out.println("----display start----");
    while(tempRef!=null){
      System.out.println(tempRef.data);
      tempRef=tempRef.nextNodeRef;
    }
    System.out.println("----display end----");
  }

  //delete first occurence of data node
  void deleteNode(int data){
    LinkedListNode tempRef=headRef;
    boolean found=false;
    if(headRef!=null && headRef.data==data){
      found=true;
      headRef=headRef.nextNodeRef;
      System.out.println("----Found at head and deleted----");
      return;
    }

    // 5->6->-7->8->9
    while(tempRef!=null && tempRef.nextNodeRef!=null){
      if(tempRef.nextNodeRef.data==data){
        found=true;
        tempRef.nextNodeRef=tempRef.nextNodeRef.nextNodeRef;
        System.out.println("----Found and deleted----"); //deleted means there won't be any active reference that points to that node
        return;
      }
      else{
        tempRef=tempRef.nextNodeRef;
      }
    }

    if(!found){
      System.out.println("----not found----");
    }

  }


}//end of LinkedList class

class LinkedListDemo{
  public static void main(String args[]){

    LinkedList list=new LinkedList();

    list.addNode(new LinkedListNode(5));
    list.addNode(new LinkedListNode(6));
    list.addNode(new LinkedListNode(7));
    list.addNode(new LinkedListNode(8));
    list.addNode(new LinkedListNode(9));


    list.displayNodes();
    // list.deleteNode(5);
    // list.displayNodes();
    list.deleteNode(5);
    list.displayNodes();

  }
}
