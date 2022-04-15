public class P2 {
   public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 3, 5, 6, 6, 6, 6 };
      int size = arr.length;
      for (int i = 0; i < size; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();

      System.out.println(firstOccurrence(arr, 6));
      System.out.println(lastOccurrence(arr, 6));
      System.out.println(countOccurrence(arr, 6));
   }

   // ! First Occurrence
   static int firstOccurrence(int arr[], int key) {
      int size = arr.length, low = 0, high = size - 1;
      while (low <= high) {
         int mid = (low + high) / 2;

         if (arr[mid] > key) {
            high = mid - 1;
         } else if (arr[mid] < key) {
            low = mid + 1;
         } else {
            if (mid == 0 || arr[mid - 1] != arr[mid]) {
               return mid;
            } else {
               high = mid - 1;
            }
         }
      }
      return -1;
   }

   // ! Last Occurrence
   static int lastOccurrence(int arr[], int key) {
      int size = arr.length, low = 0, high = size - 1;

      while (low <= high) {
         int mid = (low + high) / 2;

         if (arr[mid] > key) {
            high = mid - 1;
         } else if (arr[mid] < key) {
            low = mid + 1;
         } else {
            if (mid == size - 1 || arr[mid] != arr[mid + 1]) {
               return mid;
            } else {
               low = mid + 1;
            }
         }
      }
      return -1;
   }

   // ! Count Occurrence
   static int countOccurrence(int arr[], int key) {
      int first = firstOccurrence(arr, key);
      if (first == -1) {
         return 0;
      } else {
         return (lastOccurrence(arr, key) - first + 1);
      }
   }
}
