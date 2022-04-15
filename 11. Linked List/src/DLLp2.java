public class DLLp2 {
   public static void main(String[] args) {
      DLL dll = new DLL();
      dll.push(10);
      dll.push(20);
      dll.push(30);
      dll.push(40);
      dll.push(50);

      System.out.println("Original List:");
      dll.print(dll.head);

      System.out.println();

      System.out.println("Reversed List:");
      DLLNode head = reverse(dll.head);
      dll.print(head);
   }

   static DLLNode reverse(DLLNode node) {
      if (node == null) {
         System.out.println("List is Empty");
         return node;
      }

      if (node.next == null) {
         System.out.println("List has only one element");
         return node;
      }

      DLLNode curr = node;
      DLLNode temp = null;

      while (curr != null) {
         // swap prev and next of each node
         temp = curr.prev;
         curr.prev = curr.next;
         curr.next = temp;

         curr = curr.prev; // as we have swapped prev and next therefore to move forward we have to use
                           // prev
      }

      return temp.prev;
   }
}
