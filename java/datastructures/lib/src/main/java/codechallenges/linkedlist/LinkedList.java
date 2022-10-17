package codechallenges.linkedlist;

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

  public void append(T val) {
    Node<T> tail = new Node<T>(val);

      if(head == null){
        tail.next = null;
        head = tail;
      } else {
        Node<T> current = head;
        while(current.next != null) {
          current = current.next;
        }
        current.next = tail;
       tail.next = null;
      }
  }

  public void insertBefore(T val, T newVal){
   Node<T> node = new Node<T>(newVal);
   Node<T> curr = head;

   while(curr.next != null){
     if(curr.next.value == val){
       node.next = curr.next;
       curr.next = node;
       size++;
     } else {
     curr = curr.next;
      }
    }
    }

    public void insertAfter(T val, T newVal){
   Node<T> node = new Node<T>(newVal);
   Node<T> curr = head;
   while(curr.next != null){
     if(curr.value == val){
       node.next = curr.next;
       curr.next = node;
       size++;
     }
     curr = curr.next;
   }
    }
    public int kthFromEnd(int k) {
      if (head == null || k < 0) {
        throw new IllegalArgumentException("List empty.");
      }
      if (k > this.getSize()) {
        throw new IllegalArgumentException("List not long enough");
      }
      Node<T> curr = head;
      int kthPosition = (this.getSize() - k);
      System.out.println("kth position:" + kthPosition);
      for (int i = 1; i < kthPosition; i++) {
        curr = curr.next;
      }
      return (int) curr.value;
    }
    public int getSize(){
   return this.size;
    }


 }

