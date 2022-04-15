public class CLLp {
   public static void main(String[] args) {
      CLL cll = new CLL();

      cll.push(10);
      // cll.push(20);
      // cll.push(30);
      // cll.push(40);
      // cll.push(50);
      // cll.append(60);
      // cll.append2(70);

      cll.print(cll.head);

      // System.out.println(cll.search(4));

      cll.deleteHead2();
      cll.print(cll.head);

   }
}
