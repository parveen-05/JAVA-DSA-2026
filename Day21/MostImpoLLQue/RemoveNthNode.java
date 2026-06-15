package Linked_List_Most_impo_Que;

public class Find_and_Delete_nth_Node_FromLast {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        // Find size of linked list
        int size = 0;
        ListNode curr = head;

        while (curr != null) {
            curr = curr.next;
            size++;
        }

        // Delete first node
        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;

        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        // Delete nth node from end
        prev.next = prev.next.next;

        return head;
    }

    // Display linked list
    public void printList(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Find_and_Delete_nth_Node_FromLast obj =
                new Find_and_Delete_nth_Node_FromLast();

        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(2);
        head.next.next = obj.new ListNode(3);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);

        System.out.println("Original List:");
        obj.printList(head);

        int n = 2;

        head = obj.removeNthFromEnd(head, n);

        System.out.println("After Deleting " + n + "th Node From End:");
        obj.printList(head);
    }
}
