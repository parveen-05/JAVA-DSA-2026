package Linked_List_Most_impo_Que;

public class LL_Cycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        ListNode hare = head;
        ListNode turtle = head;

        while (hare != null && hare.next != null) {

            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        LL_Cycle obj = new LL_Cycle();

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle: 4 -> 2
        fourth.next = second;

        if (obj.hasCycle(head)) {
            System.out.println("Cycle is present");
        } else {
            System.out.println("Cycle is not present");
        }
    }
}
