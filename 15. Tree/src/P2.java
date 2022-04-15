public class P2 {
   public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();

      int elementArr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
      tree.root = tree.insert(elementArr, tree.root, 0);

      tree.printInOrder(tree.root);
      System.out.println();

      System.out.println(height(tree.root));
   }

   static int height(Node root) {
      if (root == null) {
         return 0;
      } else {
         return Math.max(height(root.left), height(root.right) + 1);
      }

   }
}
