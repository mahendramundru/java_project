package mahendra.stacks;
//Stack implementation using array in java
class Stack{
  int size;
  int capacity;
  Integer[] StackArray;
  int top=0; //top index for pointing the index where we can insert next Element //can also be used as top-1 for peek or pop operation
  Stack(int capacity){
    this.capacity=capacity;
    StackArray=new Integer[this.capacity];
  }

  boolean isFull(){
    if (size>=capacity){
      return true;
    }
    return false;
  }

  void push(int num){
    if(isFull()){
      System.out.println("Stack is full");
      return;
    }
    StackArray[top]=num;
    System.out.println("push  : "+num);
    top=top+1;
    size=size+1;
  }

  boolean isEmpty(){
    if (size==0){
      return true;
    }
    return false;
  }

  Integer pop(){
    if(isEmpty()){
      System.out.println("Stack is empty");
      return null;
    }
    int num = StackArray[top-1];

    StackArray[top-1]=null; //de allocate or remove
    size=size-1;

    top=top-1;

    System.out.println("pop :"+num);

    return num;

  }

  Integer peek(){

    if(isEmpty()){
      System.out.println("Stack is empty");
      return null;
    }

    System.out.println("peek :"+StackArray[top-1]);

    return StackArray[top-1];

  }

}

class StackDemo{
  public static void main(String args[]){
    System.out.println("hi Stack");
    Stack Stack=new Stack(5);

    Stack.pop();
    Stack.push(10);
    Stack.push(20);
    Stack.pop();
    Stack.push(30);
    Stack.push(40);
    Stack.push(50);
    Stack.push(60);
    Stack.push(70);
    Stack.pop();
    Stack.pop();
    Stack.push(70);




  }
}
