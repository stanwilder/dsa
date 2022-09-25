package codechallenges.sort;

public class MergeSort {
  public static void mergeSort(int[] arr){
    int n = arr.length;

    if (n > 1) {
      int mid = n/2;
//      int left = arr[0...mid]
//      int right = arr[mid...n]
//      mergeSort(left)
//      mergeSort(right)
//      merge(left, right, arr);
    }
//    public void merge (int[] left, int[] right, int[] arr){
      int i = 0;
      int j = 0;
      int k = 0;

//      while( i < left.length && j  < right.length){
//        if(left[i] <= right[j]){
//          arr[k] = left[i];
          i = i  + 1;
//        } else {
//          arr[k] = right[j];
          j = j + 1;
          k = k +1;
        }
//        while (i < left.length){
//          arr[k + 1] = left[i + 1];
        }
//        while (j < right.length){
//          arr[k + 1] = right[j + 1];
//        }
//      }
//    }
//  }
//}
