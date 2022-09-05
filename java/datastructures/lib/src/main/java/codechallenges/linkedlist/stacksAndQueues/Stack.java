package codechallenges.linkedlist.stacksAndQueues;


import java.util.EmptyStackException;

public class Stack<T> {
  public Node<T> top = null;
  public int size = 0;
  public int getSize(){
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }
  public T peek() {
    if (top == null){
      throw new EmptyStackException();
    }
    return top.value;
  }

  public void push(T data) {
    Node<T> node = new Node<>(data);
    node.next = top;
    top = node;
  }
public T pop() {
    Node<T> node = top;
    if (top == null){
      throw new EmptyStackException();
  }
    top = top.next;
    size--;
    return node.value;
}
// Help from Mandy and Ben.
}



