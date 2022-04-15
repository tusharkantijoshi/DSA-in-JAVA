class DLLNode {
   int data;
   DLLNode next, prev;

   DLLNode(int data) {
      this.data = data;
   }
}

public class DLL {
   DLLNode head;
   DLLNode tail;

   DLL() {
      head = null;
   }

   // ! Insertion (Beginning)
   void push(int data) {
      DLLNode newNode = new DLLNode(data);
      newNode.next = head;

      if (head != null) {
         head.prev = newNode;
      }
      head = newNode;
   }

   // ! Insertion (End)
   void append(int data) {
      DLLNode newNode = new DLLNode(data);

      if (head == null) {
         head = newNode;
         return;
      }

      DLLNode curr = head;
      while (curr.next != null) {
         curr = curr.next;
      }

      curr.next = newNode;
      newNode.prev = curr;
   }

   // ! Insertion (Given Position)
   void insertAfter(DLLNode node, int data) {
      if (node == null) {
         return; // given node cannot be null
      }

      DLLNode newNode = new DLLNode(data);
      newNode.next = node.next;
      node.next = newNode;
      newNode.prev = node;

      // Check if new node is added as tail
      if (newNode.next != null) {
         newNode.next.prev = newNode;
      }

   }

   void insertBefore(DLLNode node, int data) {
      if (node == null) {
         return; // given node cannot be null
      }

      DLLNode newNode = new DLLNode(data);
      newNode.prev = node.prev;
      node.prev = newNode;
      newNode.next = node;

      // Check if new node is added as head
      if (newNode.prev != null) {
         newNode.prev.next = newNode;
      } else {
         head = newNode;
      }
   }

   // ! Print
   void print(DLLNode node) {
      printForward(node);
      printBackward(node);
   }

   void printForward(DLLNode node) {
      DLLNode curr = node;
      while (curr != null) {
         System.out.print(curr.data + "-> ");
         curr = curr.next;
      }
      System.out.print("null");
      System.out.println();
   }

   void printBackward(DLLNode node) {
      DLLNode curr = node;
      DLLNode last = null;

      while (curr != null) {
         last = curr;
         curr = curr.next;
      }

      System.out.print("null");
      while (last != null) {
         System.out.print(" <-" + last.data);
         last = last.prev;
      }
      System.out.println();
   }

   // ! Searching
   boolean search(int data) {
      DLLNode curr = head;

      while (curr != null) {
         if (curr.data == data) {
            return true;
         }
         curr = curr.next;
      }

      return false;
   }

   // ! Deletion (First Node)
   public void deleteFirst() {
      if (head == null) {
         return;
      }

      DLLNode curr = head;
      if (head.next == null) {
         head = curr.next;
         return;
      } else {
         head = head.next;
         head.prev = null;
         return;
      }
   }

   // ! Deletion (Last Node)
   public void deleteLast() {
      if (head == null) {
         return;
      }

      DLLNode curr = head;
      DLLNode temp = null;

      if (head.next == null) {
         head = curr.next;
      } else {
         while (curr.next != null) {
            temp = curr;
            curr = curr.next;
         }

         temp.next = null; // new last node
      }

   }

   // ! Deletion (Given Position)
   public void delete(int pos) {
      if (head == null) {
         System.out.println("Empty List");
         return;
      }

      if (pos < 0) {
         System.out.println("Position should be greater or equal to 0");
         return;
      }

      DLLNode curr = head;
      DLLNode prev = null; // for deleting last node

      if (pos == 0) {
         head = curr.next;
         head.prev = null;
         // OR
         // deleteFirst();
         return;
      }

      for (int i = 0; curr != null && i < pos; i++) {
         prev = curr;
         curr = curr.next;
      }

      // Position is more than number of Nodes
      if (curr == null) {
         System.out.println("Position Not Found");
         return;
      } else if (curr.next == null) { // temp has last node
         prev.next = null;
         // OR
         // deleteLast();
      } else {
         DLLNode temp = curr.next;
         curr.next = temp.next;
         temp.next.prev = curr;
      }

   }

}
