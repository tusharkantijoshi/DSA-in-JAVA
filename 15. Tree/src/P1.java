import java.util.*;

public class P1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      BinaryTree tree = new BinaryTree();

      int elementArr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
      tree.root = tree.insert(elementArr, tree.root, 0);

      tree.printInOrder(tree.root);
      System.out.println();

      // System.out.println(tree.search(tree.root, 4));
      tree.printLevelOrder(tree.root);

      sc.close();

   }
}
