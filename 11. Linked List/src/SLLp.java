public class SLLp {
   public static void main(String[] args) {
      SLL sll = new SLL();

      int elementArr[] = { 10, 20, 30, 40, 50 };
      for (int i = 0; i < elementArr.length; i++) {
         sll.push(elementArr[i]);
      }

      // sll.push(10);
      // sll.push(20);
      // sll.push(30);
      // sll.push(40);
      // sll.push(50);

      // sll.append(60);

      // sll.insertAt(550, 0);

      // sll.print();

      // if (sll.search(500)) {
      // System.out.println("Element Found");
      // } else {
      // System.out.println("Element not Found");
      // }

      sll.print();

      // sll.deleteLast();

      // sll.delete(0);

      // sll.print();

   }

}
