//Queue implementation using linkedlist in java
package mahendra.queues;

class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
  }
}


class QueueWithList{

  Node rear; //useful during enQueue operation //pointer to point the current index place for next Number to be inserted
  Node front; //useful during deQueue operation



  void enQueue(int num){

    if(front==null && rear==null){
      front=new Node(num);
      rear=front;
    }
    else{
      Node temp=new Node(num);
      rear.next=temp;
      rear=temp;
    }

    System.out.println("enQueue  : "+num);

  }



  Integer deQueue(){

    if(front==null){

      System.out.println("Queue Empty");
      return null;

    }

    int num=front.data;
    System.out.println("deQueue :"+num);

    front=front.next; //as the node at front is not pointed by any reference so it will be automatically garbage collected i.e. deleted

    return num;

  }

}

class QueueListDemo{
  public static void main(String args[]){
    System.out.println("hi queue using linked list");
    QueueWithList queue=new QueueWithList(); //dynamic Queue no need to give size

    queue.deQueue();
    queue.enQueue(10);
    queue.enQueue(20);
    queue.deQueue();
    queue.enQueue(30);
    queue.enQueue(40);
    queue.enQueue(50);
    queue.enQueue(60);
    queue.enQueue(70);
    queue.deQueue();
    queue.deQueue();
    queue.enQueue(80);




  }
}
