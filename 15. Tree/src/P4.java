import java.util.*;

public class P4 {
   public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();

      int elementArr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
      tree.root = tree.insert(elementArr, tree.root, 0);
      tree.printLevelOrder(tree.root);
      System.out.println();
      printLevelOrderLineByLine(tree.root);
   }

   static void printLevelOrderLineByLine(Node root) {
      if (root == null) {
         return;
      }
      Queue<Node> q = new LinkedList<Node>();

      q.add(root);
      q.add(null);

      while (q.size() > 1) {
         Node curr = q.poll();

         if (curr == null) {
            System.out.println();
            q.add(null);
         } else {
            System.out.print(curr.data + " ");
            if (curr.left != null) {
               q.add(curr.left);
            }
            if (curr.right != null) {
               q.add(curr.right);
            }
         }
      }

   }
}
