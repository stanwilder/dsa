package codechallenges.linkedlist.stacksAndQueues;

import java.util.EmptyStackException;

public class Queue<T> {
  public Node<T> front = null;

  public Node<T> back = null;
  public int size = 0;

  public Queue() {
  }

  public void enqueue(T value){
    Node<T> newNode = new Node<>(value);
    if (size == 0){
      front = newNode;
    } else {
      back.next = newNode;
    }
    back = newNode;
    size++;
  }
  public T dequeue(){
    Node<T> node = front;
    if (front == null){
      throw new EmptyStackException();
    }
    front = front.next;
    node.next = null;
    size--;
    return node.value;
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public T peek() {
    if(front == null){
      throw new EmptyStackException();
    }
    return front.value;
  }
}
