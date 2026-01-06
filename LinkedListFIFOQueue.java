// FIFO Queue implemented using Singly Linked List
public class LinkedListFIFOQueue<T> {
    
    private class Node {
        T data;
        Node next;
        Node(T data) { this.data = data; }
    }
    
    private Node front;
    private Node rear;
    private int size;
    
    public LinkedListFIFOQueue() {
        front = rear = null;
        size = 0;
    }
    
    public void enqueue(T item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Enqueued: " + item);
    }
    
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return null;
        }
        T item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;  // queue became empty
        }
        size--;
        System.out.println("Dequeued: " + item);
        return item;
    }
    
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Nothing to peek.");
            return null;
        }
        return front.data;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue (front → rear): ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }
}