public class P7 {
   public static void main(String[] args) {
      int arr[] = { 65, 92, 33, 4, 55, 16, 75, 8, 19 };
      int size = arr.length, low = 0, high = size - 1;

      System.out.println("Original array: ");
      print(arr);

      quickSort(arr, low, high);
      print(arr);

   }

   static void quickSort(int arr[], int low, int high) {
      if (low < high) {
         int pivot = Lomuto(arr, low, high);
         quickSort(arr, low, pivot - 1);
         quickSort(arr, pivot + 1, high);
      }
   }

   // ! Lomuto
   static int Lomuto(int arr[], int low, int high) {

      int pivot = arr[high];

      int i = low - 1;

      for (int j = low; j < high; j++) {
         if (arr[j] < pivot) {
            i++;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
         }
      }

      int temp = arr[i + 1];
      arr[i + 1] = arr[high];
      arr[high] = temp;

      return (i + 1);
   }

   // ! Print
   static void print(int arr[]) {
      for (int i = 0; i < arr.length; ++i)
         System.out.print(arr[i] + " ");
      System.out.println();
   }

}
