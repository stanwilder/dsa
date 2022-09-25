package sort;
import codechallenges.sort.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {
  @Test
  void quickSortSortsArray() {
    int[] array = new int[] {8,4,23,42,16,15};
    QuickSort sut = new QuickSort();
    int[] array1 = new int[] {4,8,15,16,23,42};
    sut.quickSort(array, 0, 5);
    assertEquals(array1[1], array[1]);
    assertEquals(array1[2], array[2]);
    assertEquals(array1[3], array[3]);
    assertEquals(array1[4], array[4]);
    assertEquals(array1[5], array[5]);
  }
}
