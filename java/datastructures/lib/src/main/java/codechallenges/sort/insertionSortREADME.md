# Insertion Sorting

- Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

[//]: # (feeksforgeeks)

Pseudo Code
InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp

Code

package codechallenges.sort;

public class InsertionSort {
public static int[] insertionSort(int[] arr){
for(int i = 1; i < arr.length; i++){
int j = i - 1;
int temp = arr[i];

      while (j >= 0 && temp < arr[j]){
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = temp;
    }
    return arr;
}
}

Big O

Time: O(n^2) While iterating over the array, we are iterating over the array again at index (i-1) to determine proper ordering of values in the array. In the worst case scenario, every value in the array is compared to every other value (n * n-1)

Space: O(1) array is being sorted in place


Attributions: Mandy Mason
