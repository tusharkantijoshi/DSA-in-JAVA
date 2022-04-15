/* 
Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.
*/

public class P5 {
   public static void main(String[] args) {
      int arr[] = { 65, 92, 33, 4, 55, 16, 75, 8, 19 };
      int size = arr.length;

      print(arr);

      mergeSort(arr, 0, size - 1);

      print(arr);
   }

   static void mergeSort(int arr[], int low, int high) {
      // only if we have more than 1 elements
      if (low < high) {
         int mid = low + (high - low) / 2; // its same as (low+high)/2

         // Sort left and right halves
         mergeSort(arr, low, mid);
         mergeSort(arr, mid + 1, high);

         // Merge the two sorted halves
         merge(arr, low, mid, high);
      }
   }

   // * Time: O(n), Space: O(n)
   static void merge(int arr[], int low, int mid, int high) {
      // Find sizes of two sub arrays to be merged
      int n1 = mid - low + 1, n2 = high - mid;

      /* Create temp arrays */
      int left[] = new int[n1];
      int right[] = new int[n2];

      /* Copy data to temp arrays */
      for (int i = 0; i < n1; i++) {
         left[i] = arr[low + i]; // low + i bcz low can or cannot be 0
      }
      for (int i = 0; i < n2; i++) {
         right[i] = arr[mid + i + 1];
      }

      /* Merge the temp arrays */

      // Initial indexes of first and second sub arrays
      int i = 0, j = 0;
      // Initial index of merged sub array array
      int k = low;

      // Standard logic to merge two sorted array
      while (i < n1 && j < n2) {
         if (left[i] <= right[j]) {
            arr[k] = left[i];
            i++;
            k++;
         } else {
            arr[k] = right[j];
            j++;
            k++;
         }
      }

      // for remaining elements after we come out of the loop
      while (i < n1) {
         arr[k] = left[i];
         i++;
         k++;
      }
      while (j < n2) {
         arr[k] = right[j];
         j++;
         k++;
      }
   }

   static void print(int arr[]) {
      for (int i = 0; i < arr.length; ++i)
         System.out.print(arr[i] + " ");
      System.out.println();
   }

}
