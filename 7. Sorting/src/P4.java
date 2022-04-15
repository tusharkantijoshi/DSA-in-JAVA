public class P4 {
   public static void main(String[] args) {
      int arr1[] = { 111, 222, 333, 444, 555 };
      int size1 = arr1.length;

      for (int i = 0; i < size1; i++) {
         System.out.print(arr1[i] + " ");
      }
      System.out.println();

      int arr2[] = { 60, 70, 80, 90, 100 };
      int size2 = arr2.length;
      for (int i = 0; i < size2; i++) {
         System.out.print(arr2[i] + " ");
      }
      System.out.println();

      merge(arr1, arr2);
   }

   // * Time: O(size1 + size2), Space: O(1)
   static void merge(int arr1[], int arr2[]) {
      int size1 = arr1.length;
      int size2 = arr2.length;

      int i = 0, j = 0;
      while (i < size1 && j < size2) {
         if (arr1[i] <= arr2[j]) {
            System.out.print(arr1[i] + " ");
            i++;
         } else {
            System.out.print(arr2[j] + " ");
            j++;
         }
      }

      // for remaining elements after we come out of the loop
      while (i < size1) {
         System.out.print(arr1[i] + " ");
         i++;
      }
      while (j < size2) {
         System.out.print(arr2[j] + " ");
         j++;
      }
   }
}