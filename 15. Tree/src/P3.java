public class P3 {
   public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();

      int elementArr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
      tree.root = tree.insert(elementArr, tree.root, 0);

      tree.printInOrder(tree.root);
      System.out.println();

      printKthNode(tree.root, 2);
   }

   static void printKthNode(Node root, int k) {
      if (root == null) {
         return;
      }

      if (k == 0) {
         {
            System.out.print(root.data + " ");
         }
      } else {
         printKthNode(root.left, k - 1);
         printKthNode(root.right, k - 1);
      }
   }
}
