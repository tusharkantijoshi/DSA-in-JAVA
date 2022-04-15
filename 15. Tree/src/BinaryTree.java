import java.util.*;

class Node {
   int data;
   Node left, right;

   Node(int data) {
      this.data = data;
      left = right = null;
   }
}

public class BinaryTree {
   Node root;

   BinaryTree() {
      root = null;
   }

   // ! Insertion using an array
   Node insert(int elementArr[], Node node, int index) {
      if (index < elementArr.length) {
         node = new Node(elementArr[index]);
         node.left = insert(elementArr, node.left, 2 * index + 1);
         node.right = insert(elementArr, node.right, 2 * index + 2);
      }
      return node;
   }

   // ! Searching
   boolean search(Node node, int data) {
      if (node == null) {
         System.out.println("Empty Node");
         return false;
      }
      if (node.data == data) {
         return true;
      }

      // search in left subtree
      boolean leftSearch = search(node.left, data);
      if (leftSearch) {
         return true;
      }

      // search in right subtree
      boolean rightSearch = search(node.right, data);
      if (rightSearch) {
         return true;
      }

      return false;

   }

   // ! InOrder Tree Traversal: left, root, right
   void printInOrder(Node node) {
      if (node == null) {
         return;
      }

      printInOrder(node.left);
      System.out.print(node.data + " ");
      printInOrder(node.right);

   }

   // ! PreOrder Tree Traversal: root, left, right
   void printPreOrder(Node node) {
      if (node == null) {
         return;
      }

      System.out.print(node.data + " ");
      printPreOrder(node.left);
      printPreOrder(node.right);
   }

   // ! PostOrder Tree Traversal: left, right, root
   void printPostOrder(Node node) {
      if (node == null) {
         return;
      }

      printPostOrder(node.left);
      printPostOrder(node.right);
      System.out.print(node.data + " ");
   }

   // ! LevelOrder Tree Traversal: left, right, root
   void printLevelOrder(Node node) {
      if (node == null) {
         return;
      }

      Queue<Node> q = new LinkedList<Node>();
      q.add(node);
      while (q.isEmpty() == false) {
         Node curr = q.poll();
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