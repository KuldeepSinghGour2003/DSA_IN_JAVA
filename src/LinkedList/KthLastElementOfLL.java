package LinkedList;

public class KthLastElementOfLL {

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

    static void display(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static int getKthelementfromLast(ListNode head, int k) {

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < k; i++) {
            if(fast==null) return-1;

            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.val;
    }

    public static void main(String[] args) {

        ListNode head = null;

        head = add(head, 1);
        head = add(head, 2);
        head = add(head, 3);
        head = add(head, 4);
        head = add(head, 5);

        System.out.println("Linked List:");
        display(head);

        int k = 2;

        int result = getKthelementfromLast(head, k);

        System.out.println(k + "nd element from last: " + result);
    }
}