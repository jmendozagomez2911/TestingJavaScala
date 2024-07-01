package javas.test.DataStructures.Queues;

public class ListNode {
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