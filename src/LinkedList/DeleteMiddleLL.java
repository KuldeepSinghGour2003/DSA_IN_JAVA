package LinkedList;

public class DeleteMiddleLL {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode add(ListNode head, int val) {

        ListNode newNode = new ListNode(val);

        if (head == null) {
            return newNode;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    static ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode fast = head.next.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    static void display(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = null;

        head = add(head, 1);
        head = add(head, 2);
        head = add(head, 3);
        head = add(head, 4);
        head = add(head, 5);

        System.out.println("Before deleting middle:");
        display(head);

        head = deleteMiddle(head);

        System.out.println("After deleting middle:");
        display(head);
    }
}