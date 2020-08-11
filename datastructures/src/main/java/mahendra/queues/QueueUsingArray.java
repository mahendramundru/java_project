package mahendra.queues;

//Queue implementation using circular array in java
class Queue{
  int size; //to know full or empty
  int capacity; //for initialization of capacity
  Integer[] queueArray;
  int currentIndex=0; //useful during enQueue operation //pointer to point the current index place for next Number to be inserted
  int headIndex=0; //useful during deQueue operation
  Queue(int capacity){
    this.capacity=capacity;
    queueArray=new Integer[this.capacity];
  }

  boolean isFull(){
    if (size>=capacity){
      return true;
    }
    return false;
  }

  void enQueue(int num){
    if(isFull()){
      System.out.println("Queue is full");
      return;
    }
    queueArray[currentIndex]=num;
    System.out.println("enQueue  : "+num);
    currentIndex=(currentIndex+1) % capacity; // - - - 4 5 // if tried to enqueue, after inserting 5 it will start pointing to 0 index
    size=size+1;
  }

  boolean isEmpty(){
    if (size==0){
      return true;
    }
    return false;
  }

  Integer deQueue(){
    if(isEmpty()){
      System.out.println("Queue is empty");
      return null;
    }
    int num = queueArray[headIndex];

    queueArray[headIndex]=null; //de allocate or remove
    size=size-1;

    headIndex=(headIndex+1) % capacity; //circular queue - - - - 5 //and try deQueue headIndex will start point to next index circular array

    System.out.println("deQueue :"+num);

    return num;

  }

}

class QueueDemo{
  public static void main(String args[]){
    System.out.println("hi queue");
    Queue queue=new Queue(5);

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
    queue.enQueue(70);




  }
}
