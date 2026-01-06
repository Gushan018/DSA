// Circular Doubly Linked List - Student implementation
public class CircularDoublyLinkedList<T> {
    
    private class Node {
        T data;
        Node next;
        Node prev;
        
        Node(T data) {
            this.data = data;
            this.next = this;
            this.prev = this;
        }
    }
    
    private Node head;  // Points to any node (we'll use it as last inserted)
    private int size;
    
    public CircularDoublyLinkedList() {
        head = null;
        size = 0;
    }
    
    // Insert at the end
    public void insert(T item) {
        Node newNode = new Node(item);
        
        if (isEmpty()) {
            head = newNode;
        } else {
            // Connect to existing circle
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
        }
        head = newNode;  // Make new node the head reference
        size++;
        System.out.println("Inserted: " + item);
    }
    
    // Delete a node with given data (first occurrence)
    public void delete(T item) {
        if (isEmpty()) {
            System.out.println("List is empty! Cannot delete.");
            return;
        }
        
        Node current = head;
        do {
            if (current.data.equals(item)) {
                if (size == 1) {
                    head = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    if (current == head) {
                        head = current.next;  // Update head if deleting it
                    }
                }
                size--;
                System.out.println("Deleted: " + item);
                return;
            }
            current = current.next;
        } while (current != head);
        
        System.out.println("Item " + item + " not found.");
    }
    
    // Display forward
    public void displayForward() {
        if (isEmpty()) {
            System.out.println("Circular List is empty");
            return;
        }
        System.out.print("Forward: ");
        Node current = head;
        do {
            System.out.print(current.data + " ↔ ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }
    
    // Display backward
    public void displayBackward() {
        if (isEmpty()) {
            System.out.println("Circular List is empty");
            return;
        }
        System.out.print("Backward: ");
        Node current = head;
        do {
            System.out.print(current.data + " ↔ ");
            current = current.prev;
        } while (current != head);
        System.out.println("(back to head)");
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
}