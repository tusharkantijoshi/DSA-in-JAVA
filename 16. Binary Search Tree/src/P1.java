public class P1 {
   public static void main(String[] args) {
      BinarySearchTree tree = new BinarySearchTree();

      int elementArr[] = { 50, 30, 20, 40, 70, 60, 80 };

      for (int i = 0; i < elementArr.length; i++) {
         tree.root = tree.insertRec(tree.root, elementArr[i]);
      }

      tree.printInOrder(tree.root);

   }
}
