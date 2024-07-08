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

        if (head == tail) {
            head = tail = null;
        } else {
            Node currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            tail = currentNode;
        }

        size--;
        return removeNode;
    }



}