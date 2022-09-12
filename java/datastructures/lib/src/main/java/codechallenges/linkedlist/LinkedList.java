package codechallenges.linkedlist;

import codechallenges.linkedlist.stacksAndQueues.Node;

public class LinkedList<T> {
 public Node<T> head = null;
 public int size = 0;

 public void insert(T value) {
   Node<T> insertHead = new Node<T>(value);
   insertHead.next = head;
   head = insertHead;
   size++;
 }
  public boolean includes (T value) {
    Node<T> current = head;
    while (current != null) {
      if (current.value == value) {
        return true;
      }
      current = current.next;
    }
    return false;
  }
  @Override
  public String toString() {
   String result = "";
   Node<T> current = head;
   while(current != null){
     result += "{" + current.value + "} ->";
     current = current.next;
   }
   return result + "NULL";
  }

}

