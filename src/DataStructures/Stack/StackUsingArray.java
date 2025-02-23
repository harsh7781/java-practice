package DataStructures.Stack;

class Stack {
    private int[] arr;
    int top;
    int size;

    public Stack(int s) {
        size = s;
        arr = new int[size];
        top = -1;
    }

    public void push(int data) {
        if(top < size)
            arr[++top] = data;
        else System.out.println("Stack Overflow!!");
    }

    public void printStack() {
        for(int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public int pop() {
        if(top > -1)
            return arr[top--];
        else System.out.println("Stack Underflow!!!");
        return 0;
    }

    public int peek() {
        if(top == -1) {
            System.out.println("Stack is Empty!!");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack nums = new Stack(5);

        nums.push(10);
        nums.push(30);
        System.out.println(nums.pop());
        nums.push(70);
        nums.push(20);
        nums.push(50);
        System.out.println(nums.peek());
        nums.push(90);
        System.out.println("Stack Empty? " + nums.isEmpty());
        nums.printStack();

    }
}
