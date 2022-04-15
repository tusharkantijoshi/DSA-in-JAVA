/* 
The Bubble sort algorithm sorts an array by repeatedly swapping the adjacent elements if they are in wrong order.
*/

public class P1 {
   public static void main(String[] args) {
      int arr[] = { 65, 92, 33, 4, 55, 16, 75, 8, 19 };
      int size = arr.length;

      for (int i = 0; i < size; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();

      bubbleSort2(arr);
      for (int i = 0; i < size; i++) {
         System.out.print(arr[i] + " ");
      }

   }

   // ! Bubble Sort
   // * Time: O(n^2)
   static void bubbleSort(int arr[]) {
      int size = arr.length;

      for (int i = 0; i < (size - 1); i++) { // we are going till (size - 1) bcz we are comparing (arr[j] > arr[j + 1])
                                             // means we are comparing each element with it's next element so
                                             // if i < size than we cant compare the last element
         for (int j = 0; j < (size - i - 1); j++) { // bcz in first iteration our largest element will go to the end
                                                    // so no need to compare it again therefor (j < size - i - 1)
                                                    // and not (j < size - 1)
            if (arr[j] > arr[j + 1]) {

               // swap arr[j] and arr[j + 1]
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
         }
      }
   }

   // * Optimized
   // * if the array is already sorted then in Time: O(n) and if not then O(n^2)
   static void bubbleSort2(int arr[]) {
      int size = arr.length;

      for (int i = 0; i < (size - 1); i++) { // we are going till (size - 1) bcz we are comparing (arr[j] > arr[j + 1])
                                             // means we are comparing each element with it's next element so
                                             // if i < size than we cant compare the last element
         boolean swapped = false;
         for (int j = 0; j < (size - i - 1); j++) { // bcz in first iteration our largest element will go to the end
                                                    // so no need to compare it again therefor (j < size - i - 1)
                                                    // and not (j < size - 1)
            if (arr[j] > arr[j + 1]) {

               // swap arr[j] and arr[j + 1]
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
               swapped = true;
            }
         }
         // Already Sorted
         if (swapped == false) {
            break;
         }
      }
   }

}
