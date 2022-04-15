class CLLNode {
   int data;
   CLLNode next;

   CLLNode(int data) {
      this.data = data;
   }
}

public class CLL {
   CLLNode head;

   CLL() {
      head = null;
   }

   // ! Insertion (Beginning)
   // * Time: O(n)
   void push(int data) {
      CLLNode newNode = new CLLNode(data);

      if (head == null) {
         head = newNode;
         newNode.next = newNode;
      } else {
         CLLNode curr = head;
         while (curr.next != head) {
            curr = curr.next;
         }
         curr.next = newNode;
         newNode.next = head;
         head = newNode;
      }
   }

   // * Time: O(1)
   void push2(int data) {
      CLLNode newNode = new CLLNode(data);

      if (head == null) {
         head = newNode;
         newNode.next = newNode;
      } else {
         // connecting newNode in the list next to head
         newNode.next = head.next;
         head.next = newNode;

         // swap the data of head and newNode
         int tempData = head.data;
         head.data = newNode.data;
         newNode.data = tempData;
      }
   }

   // ! Insertion (End)
   // * Time: O(n)
   void append(int data) {
      CLLNode newNode = new CLLNode(data);

      if (head == null) {
         head = newNode;
         newNode.next = newNode;
      } else {
         CLLNode curr = head;
         while (curr.next != head) {
            curr = curr.next;
         }
         curr.next = newNode;
         newNode.next = head;
      }
   }

   // * Time: O(1)
   void append2(int data) {
      CLLNode newNode = new CLLNode(data);

      if (head == null) {
         head = newNode;
         newNode.next = newNode;
      } else {
         // connecting newNode in the list next to head
         newNode.next = head.next;
         head.next = newNode;

         // swap the data of head and newNode
         int tempData = head.data;
         head.data = newNode.data;
         newNode.data = tempData;

         // making newNode our new head so that prev head will become last node
         head = newNode;
      }
   }

   // ! print
   void print(CLLNode node) {
      if (node == null) {
         return;
      }
      CLLNode curr = node;
      do {
         System.out.print(curr.data + "-> ");
         curr = curr.next;
      } while (curr != node);
      System.out.println("Repeat");
      System.out.println();
   }

   // ! Searching
   boolean search(int data) {
      CLLNode curr = head;

      do {
         if (curr.data == data) {
            return true;
         }
         curr = curr.next;
      } while (curr != head);

      return false;
   }

   // ! Deletion (Head Node)
   // * Time: O(n)
   public void deleteHead() {
      // Empty List
      if (head == null) {
         return;
      }

      CLLNode curr = head;

      // One element in the list
      if (head.next == head) {
         head = null;
         return;
      } else { // More than one element
         while (curr.next != head) {
            curr = curr.next;
         }
         curr.next = head.next;
         head = curr.next;
      }
   }

   // * Time: O(1)
   public void deleteHead2() {
      // Empty List
      if (head == null) {
         return;
      }

      // One element in the list
      if (head.next == head) {
         head = null;
         return;
      } else { // More than one element
         head.data = head.next.data;
         head.next = head.next.next;
         head = head.next.next;

      }
   }
}
