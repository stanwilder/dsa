package codechallenges.linkedlist.stacksAndQueues;

import java.util.Stack;

public class pseudoQueue {
  static class queue{
    static Stack<Integer> int1 = new Stack<Integer>();
    static Stack<Integer> int2 = new Stack<Integer>();
    static void enqueue(int enq){
      while (!int1.isEmpty()){
        int2.push(int1.pop());

//        got help from geeksforegeeks. got confused here but ill keep working at it.
      }
    }
  }
}
