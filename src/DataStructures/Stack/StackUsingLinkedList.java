package DataStructures.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    Node top;

    // Push Operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }

    // Pop Operation
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    // Peek Operation
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    public void printStack() {
        if(top == null) {
            System.out.println("Stack is Empty!!");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        Node temp = top;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack();
        System.out.println("Top Element: " + stack.peek()); // Output: 30
        System.out.println("Popped Element: " + stack.pop()); // Output: 30
        stack.printStack();
    }
}

