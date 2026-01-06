// Stack implemented using Singly Linked List
public class LinkedListStack<T> {
    
    private class Node {
        T data;
        Node next;
        Node(T data) { this.data = data; }
    }
    
    private Node top;
    private int size;
    
    public LinkedListStack() {
        top = null;
        size = 0;
    }
    
    public void push(T item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Pushed: " + item);
    }
    
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return null;
        }
        T item = top.data;
        top = top.next;
        size--;
        System.out.println("Popped: " + item);
        return item;
    }
    
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek.");
            return null;
        }
        return top.data;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top → bottom): ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }
}