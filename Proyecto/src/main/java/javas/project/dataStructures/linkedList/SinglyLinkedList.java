package javas.project.dataStructures.linkedList;

class Node {
    public int value;
    public Node next;

    public Node() {
        this.value = value;
        this.next = null;
    }
}

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Método para agregar un nodo al final de la lista
    public void push(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;

        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }


    public Node pop() {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return null;
        }

        Node removeNode = tail;

        if (head == tail) {     //Check if the list has only one node
            head = tail = null;
        } else {
            Node currentNode = head;
            while (currentNode.next != tail) {  //iterates through the list until it finds the node right before the tail.
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            tail = currentNode;
        }

        size--;
        return removeNode;
    }


    // Method to insert a node at a specified index
    public boolean insert(int value, int index) {
        if (index < 0 || index > size) {
            return false;  // Invalid index
        }

        Node newNode = new Node();
        newNode.value = value;

        if (index == 0) {  // Insert at the head
            newNode.next = head;
            head = newNode;
            if (size == 0) {
                tail = newNode;
            }
        } else if (index == size) {  // Insert at the tail
            tail.next = newNode;     // Correctly link the last node to the new node
            tail = newNode;          // Update tail to the new node
        } else {  // Insert in the middle
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }

        size++;
        return true;
    }


}