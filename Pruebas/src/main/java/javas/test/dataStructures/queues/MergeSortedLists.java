package javas.test.dataStructures.queues;

public class MergeSortedLists {
    public static void main(String[] args) {
        // Crear la primera lista: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // Crear la segunda lista: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Fusionar las listas
        Solution solution = new Solution();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Imprimir la lista fusionada
        printList(mergedList);
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("null");
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Nodo ficticio para simplificar el manejo de punteros
        ListNode dummy = new ListNode(0);
        // Puntero que se utilizará para construir la lista fusionada
        ListNode current = dummy;

        // Mientras ambas listas no estén vacías
        while (list1 != null && list2 != null) {
            // Comparar los valores actuales de list1 y list2
            if (list1.val < list2.val) {
                // Si el valor de list1 es menor, añadir list1 a la lista fusionada
                current.next = list1;
                // Mover el puntero de list1 al siguiente nodo
                list1 = list1.next;
            } else {
                // Si el valor de list2 es menor o igual, añadir list2 a la lista fusionada
                current.next = list2;
                // Mover el puntero de list2 al siguiente nodo
                list2 = list2.next;
            }
            // Mover el puntero de la lista fusionada al siguiente nodo
            current = current.next;
        }

        // Si list1 aún tiene nodos, añadirlos a la lista fusionada
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            // Si list2 aún tiene nodos, añadirlos a la lista fusionada
            current.next = list2;
        }

        // Retornar el primer nodo de la lista fusionada, excluyendo el nodo ficticio
        return dummy.next;
    }
}
