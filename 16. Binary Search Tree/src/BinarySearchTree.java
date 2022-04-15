class Node {
   int data;
   Node left, right;

   Node(int data) {
      this.data = data;
      left = right = null;
   }
}

public class BinarySearchTree {
   Node root;

   BinarySearchTree() {
      root = null;
   }

   // ! Insertion
   Node insertRec(Node node, int data) {
      if (node == null) {
         node = new Node(data);
         return node;
      }

      if (data < node.data) {
         node.left = insertRec(node.left, data);
      } else if (data > node.data) {
         node.right = insertRec(node.right, data);
      }

      return node;

   }

   // ! Searching
   // * Recursive
   boolean search1(Node node, int data) {
      if (root == null) {
         return false;
      } else if (root.data == data) {
         return true;
      } else if (root.data < data) {
         return search1(node.right, data);
      } else {
         return search1(node.left, data);
      }
   }

   // * Iterative
   boolean search2(Node node, int data) {
      while (node != null) {
         if (node.data == data) {
            return true;
         } else if (node.data < data) {
            node = node.right;
         } else {
            node = node.left;
         }
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
}
