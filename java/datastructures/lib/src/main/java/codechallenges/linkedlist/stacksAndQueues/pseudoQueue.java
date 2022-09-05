package codechallenges.linkedlist.stacksAndQueues;

import java.util.Stack;

public class pseudoQueue<T> {
   Stack<T> firstStack;
   Stack<T> secondStack;

  public pseudoQueue() {
    this.firstStack = new Stack<>();
    this.secondStack = new Stack<>();
  }

  public void enqueue(T value){
    firstStack.push(value);
      }
      public T dequeue(){
    if (secondStack.isEmpty()){
      while(!firstStack.isEmpty()){
        secondStack.push(firstStack.pop());
      }
    }
    return secondStack.pop();
    }
}

//        got help from geeksforegeeks. got confused here but ill keep working at it.
