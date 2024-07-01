package javas.test.DataStructures.Queues;

public class Main {
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