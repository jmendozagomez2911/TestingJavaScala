package javas.project.dataStructures.linkedList;

class Nodes {
    public int value;
    public Nodes next;

    public Nodes(int value) {
        this.value = value;
        this.next = null;
    }
}

public class SinglyLinkedListII {
    private Nodes head;
    private Nodes tail;
    private int size;

    public SinglyLinkedListII() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Push method to add a node to the end of the list
    public void push(int value) {
        Nodes newNodes = new Nodes(value);

        if (this.head == null) {
            this.head = newNodes;
            this.tail = newNodes;
        } else {
            this.tail.next = newNodes; //This step ensures that the current last node’s next reference points to the new node.
                                        // Without this step, the new node would not be connected to the list.

            this.tail = newNodes; //This step updates the tail reference to point to the new node.
                                    // Without this step, the tail reference would still point to the old last node.
                                     // As a result, the tail would not correctly represent the last node in the list
        }
        this.size++;
    }
}

