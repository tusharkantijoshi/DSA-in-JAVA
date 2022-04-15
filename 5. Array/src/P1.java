import java.util.*;

public class P1 {

   public static void main(String[] args) {
      int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
      System.out.println("Original Array: ");
      print(arr);

   }

   // todo: Functions

   // ! Print
   static void print(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }

   // ! Linear Search
   static int linearSearch(int arr[], int num) {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == num) {
            return i;
         }
      }
      return -1;
   }

   // !Insertion

   static int insert(int arr[], int num, int pos) {
      int size = arr.length;

      if (pos > size) {
         System.out.println("Size not sufficient");
         return size;
      }

      int index = pos - 1;
      for (int i = size - 1; i >= index; i--) {
         arr[i + 1] = arr[i];
      }
      arr[index] = num;

      return (size + 1);

   }

}
