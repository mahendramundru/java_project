package mahendra.stacks;
//Stack implementation using linkedlist in java

class Node{
  int data;
  Node next;
  Node(int data){
    this.data=data;
  }
}


class StackWithList{

  Node top; //points the top node of the stack //useful for both push and pop operations

  void push(int num){

    if(top==null){
      top=new Node(num);
    }
    else{
      Node temp=new Node(num);
      temp.next=top;
      top=temp;
    }

    System.out.println("push  : "+num);

  }



  Integer pop(){

    if(top==null){

      System.out.println("Stack Empty");
      return null;

    }

    int num=top.data;
    System.out.println("pop :"+num);

    top=top.next; //as the node at top is not pointed by any reference so it will be automatically garbage collected i.e. deleted

    return num;

  }

  Integer peek(){

    if(top==null){

      System.out.println("Stack Empty");
      return null;

    }

    int num=top.data;
    System.out.println("peek :"+num);


    return num;

  }

}

class StackListDemo{
  public static void main(String args[]){
    System.out.println("hi Stack using linked list");
    StackWithList Stack=new StackWithList(); //dynamic Stack no need to give size

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
    Stack.push(80);
    Stack.pop();
    Stack.pop();
    Stack.pop();
    Stack.pop();
    Stack.pop();
    Stack.pop();




  }
}
