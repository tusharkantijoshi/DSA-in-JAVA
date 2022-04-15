public class DLLp {
   public static void main(String[] args) {
      DLL dll = new DLL();

      dll.push(10);
      dll.push(20);
      dll.push(30);
      dll.push(40);
      dll.push(50);

      dll.print(dll.head);

      System.out.println();

      // dll.delete(3);
      // dll.printForward();
      // dll.printBackward();

      dll.deleteLast();
      dll.print(dll.head);

   }
}
