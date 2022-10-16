package codechallenges.stacksAndQueues;

import java.util.*;


public class AnimalShelter{
  Stack<String> stack1;
  Stack<String> stack2;

  public AnimalShelter(){
    this.stack1 = new Stack<>();
    this.stack2 = new Stack<>();
  }

  public void enqueue(String Animal){
    stack1.push(Animal);
  }

  public String dequeue(String pref){
      while(!stack1.isEmpty()){
        stack2.push(stack1.pop());

    }
      String getAnimal = null;
      while(!stack2.isEmpty()){
        String animal = stack2.peek();
        if (getAnimal == null && animal.equals(pref)){
          getAnimal = stack2.pop();
        } else {
          stack1.push(stack2.pop());
        }
      }
    return getAnimal;
  }
}

//Help from Mandy
//Also used stackoverflow
