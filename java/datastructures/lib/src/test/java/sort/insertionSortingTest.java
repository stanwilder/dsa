package sort;

import codechallenges.sort.InsertionSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class insertionSortingTest {
  int[] sut1 = {8,4,23,42,16,15};
  int[] sut2 = {5,84,9,66,18,11};

  @Test
  void insertionSortingTest(){

assertEquals("[4,8,15,16,23,42]",
  Arrays.toString(InsertionSort.insertionSort(sut1)));

    assertEquals("[5,9,11,18,66,84]",
      Arrays.toString(InsertionSort.insertionSort(sut2)));


  }
}
