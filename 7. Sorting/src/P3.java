/* 
The Insertion sort algorithm sorts an array by, The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
*/

public class P3 {
   public static void main(String[] args) {
      int arr[] = { 65, 92, 33, 4, 55, 16, 75, 8, 19 };
      int size = arr.length;

      for (int i = 0; i < size; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();

      insertionSort(arr);
      for (int i = 0; i < size; i++) {
         System.out.print(arr[i] + " ");
      }
   }

   // * Time: O(n^2), Space: O(1)
   static void insertionSort(int arr[]) {
      int size = arr.length;
      for (int i = 1; i < size; i++) {
         int curr = arr[i];
         int j = i - 1;

         while (j >= 0 && arr[j] > curr) {
            arr[j + 1] = arr[j];
            j--;
         }
         arr[j + 1] = curr;
      }
   }
}
