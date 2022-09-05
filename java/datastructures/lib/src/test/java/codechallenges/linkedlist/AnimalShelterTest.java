package codechallenges.linkedlist;

import codechallenges.linkedlist.stacksAndQueues.AnimalShelter;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnimalShelterTest {
Stack<String> stack1 = new Stack<>();
  Stack<String> stack2 = new Stack<>();
  @Test
  public void enqueue(){
    AnimalShelter sut = new AnimalShelter();
    sut.enqueue("dog");
    assertNotNull(sut);
  }
}
