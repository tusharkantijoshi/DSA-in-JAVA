public class P6 {
   public static void main(String[] args) {
      int arr[] = { 65, 92, 33, 4, 55, 16, 75, 8, 19 };
      int size = arr.length, low = 0, high = size - 1;

      System.out.println("Original array: ");
      print(arr);

      // int pivotIndex = 0;

      // System.out.println("Naive algorithm with pivot " + arr[pivotIndex] + " in
      // index " + pivotIndex);
      // int res = Naive(arr, pivotIndex, low, high);
      // print(arr);
      // System.out.println("New index of pivot element " + res);

      // System.out.println("Lomuto algorithm with pivot " + arr[high] + " in index "
      // + size);
      // int res3 = Lomuto(arr, low, high);
      // print(arr);
      // System.out.println("New index of pivot element " + res3);

      System.out.println("Hoare algorithm with pivot " + arr[low] + " in index " + 0);
      int res2 = Hoare(arr, low, high);
      print(arr);
      System.out.println("New index of pivot element " + res2);

   }

   // ! Functions

   // ! Naive
   // * Time: O(n), Space: O(n)
   static int Naive(int arr[], int pivot, int low, int high) {
      int temp[] = new int[high - low + 1];
      int tempIndex = 0;

      // we are using separate loops to ensure the stability
      // store all the smaller elements
      for (int i = low; i <= high; i++) {
         if (arr[i] < arr[pivot]) {
            temp[tempIndex] = arr[i];
            tempIndex++;
         }
      }

      // store all the equal elements
      for (int i = low; i <= high; i++) {
         if (arr[i] == arr[pivot]) {
            temp[tempIndex] = arr[i];
            tempIndex++;
         }
      }

      // store new index of pivot element
      int pivotIndex = low + tempIndex - 1; // Its basically tempIndex - 1 as we are giving a sub array thats why we are
                                            // adding low

      // store all the greater elements
      for (int i = low; i <= high; i++) {
         if (arr[i] > arr[pivot]) {
            temp[tempIndex] = arr[i];
            tempIndex++;
         }
      }

      // copy all the temp elements into original array
      for (int i = low; i <= high; i++) {
         arr[i] = temp[i - low];
      }

      return pivotIndex;
   }

   // ! Lomuto (we assume our pivot is always the last element)
   // * Time: O(n), Space: O(1)
   static int Lomuto(int arr[], int low, int high) {

      // if the pivot element is given then first swap the pivot element to the last
      // then use the lomuto logic

      // swap(arr[pivot], arr[high]);

      int pivot = arr[high];

      int i = low - 1; // window of smaller elements so as of now its 0

      for (int j = low; j < high; j++) {
         if (arr[j] < pivot) {
            i++; // increased the window

            // swap the element
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
         }
      }

      // window of smaller element is from 0 to i
      // window of equal element is i
      // window of larger element is from i + 1 to high

      // arrange the pivot element in the correct index
      int temp = arr[i + 1];
      arr[i + 1] = arr[high];
      arr[high] = temp;

      return (i + 1); // index of pivot element will be i + 1
   }

   // ! Hoare (we assume our pivot is always the first element)
   static int Hoare(int arr[], int low, int high) {
      int pivot = arr[low];
      int i = low - 1, j = high + 1;

      while (true) {
         // Find leftmost element greater than or equal to pivot
         do {
            i++;
         } while (arr[i] < pivot);

         // Find rightmost element smaller than or equal to pivot
         do {
            j--;
         } while (arr[j] > pivot);

         // If two pointers met.
         if (i >= j)
            return j;
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         // swap(arr[i], arr[j]);
      }
   }

   // ! Print
   static void print(int arr[]) {
      for (int i = 0; i < arr.length; ++i)
         System.out.print(arr[i] + " ");
      System.out.println();
   }
}
