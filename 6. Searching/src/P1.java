public class P1 {
   public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
      int size = arr.length;

      // ! Print Array
      for (int i = 0; i < size; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();

      // ! Binary Search (Iterative)
      int res = binarySearch(arr, 9);
      if (res != -1) {
         System.out.println("Element found at index: " + res);
      } else {
         System.out.println("Element not found");
      }

      // ! Binary Search (Recursive)
      int res2 = binarySearchRec(arr, 0, size - 1, 9);
      if (res2 != -1) {
         System.out.println("Element found at index: " + res2);
      } else {
         System.out.println("Element not found");
      }

   }

   // ! Binary Search Function

   // ! Iterative
   static int binarySearch(int arr[], int key) {
      int size = arr.length;
      int low = 0, high = size - 1;
      while (low <= high) {
         int mid = (low + high) / 2;

         if (arr[mid] == key) {
            return mid;
         } else if (arr[mid] > key) {
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return -1;
   }

   // ! Recursive
   static int binarySearchRec(int arr[], int low, int high, int key) {

      if (low > high) {
         return -1;
      }

      int mid = (low + high) / 2;

      if (arr[mid] == key) {
         return mid;
      } else if (arr[mid] > key) {
         return binarySearchRec(arr, low, mid - 1, key);
      } else {
         return binarySearchRec(arr, mid + 1, high, key);
      }
   }
}

/*
 * Time Complexity: O(log n)
 */
