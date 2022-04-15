class SLLNode {
   int data;
   SLLNode next;

   SLLNode(int data) {
      this.data = data;
   }
}

public class SLL {
   SLLNode head;

   SLL() {
      head = null;
   }

   // ! Insertion (Beginning)
   void push(int data) {
      SLLNode newNode = new SLLNode(data);
      newNode.next = head;
      head = newNode;
   }

   // ! Insertion (End)
   void append(int data) {
      SLLNode newNode = new SLLNode(data);

      if (head == null) {
         head = newNode;
         return;
      }

      SLLNode curr = head;
      while (curr.next != null) {
         curr = curr.next;
      }

      curr.next = newNode;
   }

   // ! Insertion (Given Position)
   void insertAt(int data, int pos) {
      SLLNode newNode = new SLLNode(data);

      if (pos < 0) {
         System.out.println("position should be greater than 0");
         return;
      }
      if (pos == 0) {
         newNode.next = head;
         head = newNode;
         return;
      }

      SLLNode curr = head;
      for (int i = 1; i <= pos - 1 && curr != null; i++) {
         curr = curr.next;
      }

      if (curr == null) {
         System.out.println("Position not found");
         return;
      }

      newNode.next = curr.next;
      curr.next = newNode;
   }

   // ! Print
   void print() {
      SLLNode curr = head;
      while (curr != null) {
         System.out.print(curr.data + "-> ");
         curr = curr.next;
      }
      System.out.print("null ");
      System.out.println();
   }

   // ! Searching
   boolean search(int data) {
      SLLNode curr = head;

      while (curr != null) {
         if (curr.data == data) {
            return true;
         }
         curr = curr.next;
      }

      return false;
   }

   // ! Deletion (First Node)
   void deleteFirst() {
      if (head == null) {
         return;
      }

      SLLNode temp = head;
      head = head.next;
      temp.next = null;
   }

   // ! Deletion (Last Node)
   void deleteLast() {
      if (head == null) {
         return;
      }

      SLLNode curr = head;
      SLLNode temp = null;

      if (head.next == null) {
         head = curr.next;
         return;
      } else {
         while (curr.next != null) {
            temp = curr;
            curr = curr.next;
         }
         temp.next = null;
      }
   }

   // ! Deletion (Given Position)
   void delete(int pos) {
      if (head == null) {
         System.out.println("Empty List");
         return;
      }
      if (pos < 0) {
         System.out.println("Position should be greater or equal to 0");
         return;
      }

      SLLNode curr = head;
      SLLNode temp = null;

      if (pos == 0) {
         // head = curr.next;
         // OR
         deleteFirst();
         return;
      }

      for (int i = 0; curr != null && i < pos; i++) {
         temp = curr;
         curr = curr.next;
      }

      // Position is more than number of Nodes
      if (curr == null) {
         System.out.println("Position Not Found");
         return;
      } else if (curr.next == null) {
         temp.next = null;
         // OR
         // deleteLast();
      } else {
         // De Link the node at given position
         SLLNode current = curr.next;
         curr.next = current.next;
      }

   }
}