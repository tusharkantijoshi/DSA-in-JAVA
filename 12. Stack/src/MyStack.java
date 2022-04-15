class SLLNode {
    int data;
    SLLNode next;

    SLLNode(int data) {
        this.data = data;
    }
}

public class MyStack {

    SLLNode head;
    int size;

    MyStack() {
        head = null;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void push(int data) {
        SLLNode newNode = new SLLNode(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    int pop() {
        if (head == null) { // empty stack
            return Integer.MAX_VALUE;
        }

        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    int peek() {
        if (head == null) { // empty stack
            return Integer.MAX_VALUE;
        }
        return head.data;
    }

}