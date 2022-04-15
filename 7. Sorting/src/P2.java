/* 
The selection sort algorithm sorts an array by repeatedly finding the minimum element from unsorted part and putting it at the beginning.
*/

public class P2 {
   public static void main(String[] args) {
      int arr[] = { 65, 92, 33, 4, 55, 16, 75, 8, 19 };
      int size = arr.length;

      for (int i = 0; i < size; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();

      selectionSort2(arr);
      for (int i = 0; i < size; i++) {
         System.out.print(arr[i] + " ");
      }
   }

   // * Time: O(n^2), Space: O(n)
   static void selectionSort(int arr[]) {
      int size = arr.length;
      int temp[] = new int[size];

      for (int i = 0; i < size; i++) {
         int min = 0;
         for (int j = 1; j < size; j++) {
            if (arr[j] < arr[min]) {
               min = j;
            }
         }

         // insert the smallest element in temp array and put an infinity value in the
         // original array in place of that smallest element
         temp[i] = arr[min];
         arr[min] = Integer.MAX_VALUE;
      }

      // swap the elements in original array from temp array
      for (int i = 0; i < size; i++) {
         arr[i] = temp[i];
      }
   }

   // * Time: O(n^2), Space: O(1)
   static void selectionSort2(int arr[]) {
      int size = arr.length;

      for (int i = 0; i < size - 1; i++) { // we are going till (size - 1) no need to swap the last element with itself
         int min = i;
         // Find the minimum element in unsorted array
         for (int j = i + 1; j < size; j++) {
            if (arr[j] < arr[min]) {
               min = j;
            }
         }
         // Swap the found minimum element with the first element
         int temp = arr[min];
         arr[min] = arr[i];
         arr[i] = temp;
      }
   }
}
